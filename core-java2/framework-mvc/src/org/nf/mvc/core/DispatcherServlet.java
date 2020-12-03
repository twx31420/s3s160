package org.nf.mvc.core;

import org.nf.mvc.param.AbstractParamResolver;
import org.nf.mvc.param.ParamsResolver;
import org.nf.mvc.param.impl.BasicParamResolver;
import org.nf.mvc.param.impl.BeanParamResolver;
import org.nf.mvc.param.impl.ServletApiParamResolver;
import org.nf.mvc.util.ScanUtils;
import org.nf.mvc.view.View;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 天文学
 */
public class DispatcherServlet extends HttpServlet {

    private static Map<String, ClassInfo> map=new HashMap<>();
    private static Set<ParamsResolver> set=new HashSet<>();
    @Override
    public void init(ServletConfig config) throws ServletException {
        initMethod();
        initParam();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url=req.getRequestURI();
        if (map.containsKey(url)){
            try {
                Object obj=map.get(url).getClazz().newInstance();
                Method method=map.get(url).getMethod();
                Object[] objects=setParam(method,req,resp);
                Object returnView= method.invoke(obj,objects);
                responseView(returnView,req,resp);
            }catch (Exception e){
                e.printStackTrace();
                throw new RuntimeException("运行时异常",e);
            }
        }else {
            req.getServletContext().getNamedDispatcher("default").forward(req,resp);
        }
    }

    /**
     * 初始化所有方法
     */
    private void initMethod(){
        Set<String> clazzs= ScanUtils.scanPackage();
        for (String str:clazzs){
            try {
                Class clazz=Class.forName(str);
                Method [] methods=clazz.getDeclaredMethods();
                for (Method method:methods){
                    if (method.isAnnotationPresent(WebRequest.class)){
                        WebRequest anno=method.getAnnotation(WebRequest.class);
                        String url=anno.value();
                        ClassInfo classInfo=new ClassInfo(clazz,method);
                        map.put(url,classInfo);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void initParam(){
        set.add(new BasicParamResolver());
        set.add(new BeanParamResolver());
        set.add(new ServletApiParamResolver());
    }

    private Object[] setParam(Method method,HttpServletRequest request,HttpServletResponse response){
        Parameter [] params=method.getParameters();
        Object[] objects=new Object[params.length];
        for (int i=0;i<params.length;i++){
            for (ParamsResolver resolver:set){
                ((AbstractParamResolver)resolver).setRequest(request);
                ((AbstractParamResolver)resolver).setResponse(response);
                if(resolver.process(params[i])!=null){
                    objects[i]=resolver.process(params[i]);
                    break;
                }
            }
        }
        return objects;
    }
    private void responseView(Object returnView,HttpServletRequest request,HttpServletResponse response)
     throws Exception{
        if (returnView!=null){
            if(returnView instanceof View){
                View view=(View)returnView;
                view.setRequest(request);
                view.setResponse(response);
                view.response();
            }else {
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().println(returnView);
            }
        }
    }
}
