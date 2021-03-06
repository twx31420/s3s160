package org.nf.mvc.core;

import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.nf.mvc.param.ParamConverter;
import org.nf.mvc.param.impl.AbstractParamConverter;
import org.nf.mvc.param.impl.BasicParamConverter;
import org.nf.mvc.param.impl.BeanConvert;
import org.nf.mvc.param.impl.ServletConverter;
import org.nf.mvc.param2.AbstractParamResolver;
import org.nf.mvc.param2.ParamsResolver;
import org.nf.mvc.param2.impl.BasicParamResolver;
import org.nf.mvc.param2.impl.BeanParamResolver;
import org.nf.mvc.param2.impl.ServletApiParamResolver;
import org.nf.mvc.util.ScanUtils;
import org.nf.mvc.view.View;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @author 天文学
 * 核心servlet，用于接收所有请求
 * 然后根据请求的url去匹配对应的Controller类的方法
 */
public class DispatcherServlet extends HttpServlet {
    /**
     * 这个map用户缓存请求的处理方法（Method）,
     * key保存时请求的uri（也就时Method注解上url地址）
     */
    private static Map<String,Method>map=new HashMap<>();
    private static List<ParamsResolver>list=new ArrayList<>();
    @Override
    public void init(ServletConfig config) throws ServletException {
        //
        initRequestMapping();
        initParamResolver();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当请求有到达service方法是，从map集合中找到匹配的Method

        String uri=req.getRequestURI();
        if (map.containsKey(uri)){
            Method method=map.get(uri);
            //回调这个method
            //通过method找到声明此方法
            try {
                //回调这个method所在的类的Class类对象，然后创建了实例
                Object obj=method.getDeclaringClass().newInstance();
                //参数映射装换,返回一个Object数组
                Object[]params=resolverParams(req,resp,method);
                //回调这个method，
                Object returnView=method.invoke(obj,params);
                //returnView 是返回的视图对象，如果不为空，则转换为View实例
                responseView(returnView,req,resp);

            }catch (Exception e){
                e.printStackTrace();
            }

        }else {
            //否则其他的所有请求交由个tomcat处理
            //不然就会忽略着些请求导致浏览器空白
            //因此
            req.getServletContext().getNamedDispatcher("default").forward(req,resp);
        }
    }

    /**
     * 解析转换方法参数
     * @return
     */
    private Object[] resolverParams(HttpServletRequest request,
                                    HttpServletResponse response,
                                    Method method) {
        //获取请求方法中的所有参数
        Parameter[] params=method.getParameters();
        //定义Object数组，用于存放参数的值，长度为参数列表的长度
        Object[]values=new Object[params.length];
        //循环遍历参数集合
        for (int i=0;i<params.length;i++){
            Parameter param=params[i];
            //循环遍历解析器集合，匹配转换，如果转换成功则防火具体的值
            //否则返回null，让下一个解析器继续处理
            for (ParamsResolver resolver:list){
                //给解析器设置request和response对象
                ((AbstractParamResolver)resolver).setRequest(request);
                ((AbstractParamResolver)resolver).setResponse(response);
                //进行解析转换，并返回转换后的value
                Object value=resolver.process(param);
                //判断value是否为空，不为空则保存到Object数组
                if (value!=null){
                    values[i]=value;
                    //
                    break;
                }
            }
        }
        return values;
    }

    /**
     * 初始化方法解析器
     */
    private void initRequestMapping(){
        //扫描所有包下的类，并返回所有的类的类名
        Set<String> classNames= ScanUtils.scanPackage();
        for(String className:classNames){
            try {
                Class<?> clazz=Class.forName(className);
                //获取Class对象中的所有公共的Method
                Method [] methods=clazz.getMethods();
                //循环遍历方法数组，找出带有@
                for (Method method:methods){
                    //如果方法有标识注解（就是一个请求处理方法）
                    //那么就将这个方法缓存起来，可以反复使用
                    if (method.isAnnotationPresent(WebRequest.class)){
                        //获取注解
                        WebRequest anno=method.getAnnotation(WebRequest.class);
                        //获取注解的value属性值
                        String url=anno.value();
                        //将url作为key，method
                        map.put(url,method);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    /**
     * 初始化参数解析器，这些解析器
     */
    private void initParamResolver(){
        list.add(new BasicParamResolver());
        list.add(new BeanParamResolver());
        list.add(new ServletApiParamResolver());
    }

    private void responseView(Object returnView,HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        if (returnView!=null) {
            //判断如果returnview是view类的实例，则可以强转
            if (returnView instanceof View){
                //向应视图
                View view = (View)returnView;
                //设置request和response对象
                view.setRequst(request);
                view.setResponse(response);
                //执行视图响应的方法
                view.response();
            }else{
                //否则返回的不是view实例则使用默认视图响应
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().println(returnView);
            }

        }
    }
}
