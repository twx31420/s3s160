package org.nf.mvc.core;

import org.nf.mvc.param.ParamConverter;
import org.nf.mvc.param.impl.AbstractParamConverter;
import org.nf.mvc.param.impl.BasicParamConverter;
import org.nf.mvc.param.impl.BeanConvert;
import org.nf.mvc.param.impl.ServletConverter;
import org.nf.mvc.util.ScanUtils;

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
 * @author 天文学
 * 核心servlet，用于接收所有请求
 * 然后根据请求的url去匹配对应的Controller类的方法
 */
public class DispatcherServlet3 extends HttpServlet {
    /**
     * 这个map用户缓存请求的处理方法（Method）,
     * key保存时请求的uri（也就时Method注解上url地址）
     */
    private static Map<String,Method>map=new HashMap<>();
    private static List<ParamConverter> converters=new ArrayList<>();
    @Override
    public void init(ServletConfig config) throws ServletException {
        converters.add(new BasicParamConverter());
        converters.add(new ServletConverter());
        converters.add(new BeanConvert());
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

            }
        }
        //
        //DispatcherServlet2.initParamConvert();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //当请求有到达service方法是，从map集合中找到匹配的Method

        String uri=req.getRequestURI();
        System.out.println(uri);
        if (map.containsKey(uri)){
            Method method=map.get(uri);
            //回调这个method
            //通过method找到声明此方法
            try {
//                //回调这个method所在的类的Class类对象，然后创建了实例
//                Object obj=method.getDeclaringClass().newInstance();
//                //回调这个method
//                method.invoke(obj,req,resp);
                Parameter[] params = method.getParameters();
                Object[] par = new Object[params.length];
                for (int i = 0; i < params.length; i++) {
                    for (ParamConverter converter : converters) {
                        ((AbstractParamConverter)converter).setRequest(req);
                        ((AbstractParamConverter)converter).setResponse(resp);
                        if (converter.convert(params[i]) != null) {
                            par[i] = converter.convert(params[i]);
                            break;
                        }
                    }
                }
                method.invoke(method.getDeclaringClass().newInstance(), par);
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
}
