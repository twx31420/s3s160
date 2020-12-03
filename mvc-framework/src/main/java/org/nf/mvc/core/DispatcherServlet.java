package org.nf.mvc.core;

import org.nf.mvc.param.AbstractParamResolver;
import org.nf.mvc.param.BasicParamResolver;
import org.nf.mvc.param.BeanParamResolver;
import org.nf.mvc.param.ServletApiParamResolver;
import org.nf.mvc.util.ScanUtils;
import org.nf.mvc.view.View;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * @author wangl
 * @date 2020/10/14
 * 核心servlet，用于接收所有请求
 * 然后根据请求的url去匹配对应的Controller类的方法
 */
public class DispatcherServlet extends HttpServlet {

    /**
     * 这个map用户缓存请求的处理方法（Method），
     * key保存是请求的url（也就是Method注解上url地址）
     */
    private static Map<String, Method> map = new HashMap<>();

    /**
     * List集合，用于缓存所有的参数解析器
     */
    private static List<AbstractParamResolver> resolverList = new ArrayList<>();

    /**
     * 初始化，解析Method方法并缓存
     * @param config
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig config) throws ServletException {
        //初始化请求映射
        initRequestMapping();
        //初始化参数解析器
        initParamResolver();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当请求有到达service方法时，从map集合中找到匹配的Method来处理请求
        //获取客户端请求的uri地址
        String uri = req.getRequestURI();
        //判断在map集合中是否存在这个key,
        //如果包含了，则取出对应的Method方法来处理请求
        if(map.containsKey(uri)){
            Method method = map.get(uri);
            try {
                //找到当前method所在的类的Class类对象，然后创建类实例
                Object obj = method.getDeclaringClass().newInstance();
                //参数映射转换,返回一个Object数组，表示方法中的所有参数值
                Object[] params = resolveParams(req, resp, method);
                //回调method,params就是封装好的请求数据，映射到方法参数中
                //returnView是返回的视图对象，如果不为空，则转换为View的实例
                Object returnView = method.invoke(obj, params);
                //响应视图
                responseView(returnView, req, resp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            //否则其他的所有请求都交由回给Tomcat处理
            //不然就会忽略这些请求导致浏览器空白
            //因此就先获取Tomcat的默认Servlet的转发器,然后执行转发
            req.getServletContext().getNamedDispatcher("default").forward(req, resp);
        }
    }

    /**
     * 初始化请求映射
     */
    private void initRequestMapping(){
        //扫描所有包下的类，并返回所有类的完整类名
        Set<String> classNames = ScanUtils.scanPackage();
        //循环遍历
        for(String className : classNames){
            //执行类加载，得到Class对象
            try {
                Class<?> clazz = Class.forName(className);
                //获取Class对象中的所有公共的Method
                Method[] methods = clazz.getMethods();
                //循环遍历方法数组，找出带有@WebRequest注解的Method
                for(Method method : methods){
                    //如果方法有标识注解(就是一个请求处理方法),
                    //那么就将这个方法缓存起来，可以反复使用
                    if(method.isAnnotationPresent(WebRequest.class)){
                        //获取注解
                        WebRequest anno = method.getAnnotation(WebRequest.class);
                        //获取注解的value属性值
                        String url = anno.value();
                        //将url作为key，method作为value缓存到map集合中
                        map.put(url, method);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 初始化参数解析器，这些解析器只要初始化一次并缓存起来
     * （保存到List中）
     */
    private void initParamResolver() {
        resolverList.add(new BasicParamResolver());
        resolverList.add(new BeanParamResolver());
        resolverList.add(new ServletApiParamResolver());
    }

    /**
     * 解析转换方法参数
     * @return
     */
    private Object[] resolveParams(HttpServletRequest request,
                                    HttpServletResponse response,
                                    Method method) {
        //获取请求方法中的所有参数
        Parameter[] params = method.getParameters();
        //定义Object数组，用于存放参数的值,长度为参数列表的长度
        Object[] values = new Object[params.length];
        //循环遍历参数集合
        for(int i = 0; i<params.length; i++){
            Parameter param = params[i];
            //遍历解析器集合，匹配转换，如果转换成功则返回具体的值
            //否则返回null，让下一个解析器继续处理
            for(AbstractParamResolver resolver : resolverList){
                //给解析器设置request和response对象
                resolver.setRequest(request);
                resolver.setResponse(response);
                //进行解析转换，并返回转换后的value
                Object value = resolver.process(param);
                //判断value是否为空，不为空则保存到Object数组
                if(value != null){
                    values[i] = value;
                    //转换成功就无须再走下一个解析器，直接跳出当前循环
                    //执行下一个参数的转换
                    break;
                }
            }
        }
        return values;
    }

    /**
     *  响应视图
     */
    private void responseView(Object returnView, HttpServletRequest request,
                              HttpServletResponse response) throws ServletException, IOException{
        if(returnView != null) {
            //判断如果returnView是View类的实例，则可以强转
            if(returnView instanceof View){
                //响应视图
                View view = (View)returnView;
                //设置request和response对象
                view.setRequest(request);
                view.setResponse(response);
                //执行视图响应方法
                view.response();
            }else{
                //否则返回的不是View实例则使用默认视图响应
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().println(returnView);
            }

        }
    }
}
