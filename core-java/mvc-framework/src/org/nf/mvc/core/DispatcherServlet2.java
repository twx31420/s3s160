package org.nf.mvc.core;

import org.nf.mvc.param.ParamConverter;
import org.nf.mvc.param.impl.AbstractParamConverter;
import org.nf.mvc.param.impl.BasicParamConverter;
import org.nf.mvc.param.impl.BeanConvert;
import org.nf.mvc.param.impl.ServletConverter;
import org.nf.mvc.util.ScanUtils;


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
 */
public class DispatcherServlet2 extends HttpServlet {

   private static Map<String,ClassInfo> map =new HashMap<>();
   private static List<ParamConverter> converters=new ArrayList<>();
    @Override
    public void init() throws ServletException {
        initClassInfo();
        initParamConvert();
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri=req.getRequestURI();
        System.out.println(uri);
        System.out.println(map.containsKey(uri));
        if (map.containsKey(uri)) {
            ClassInfo classInfo = map.get(uri);
            try {
                Parameter[] params = classInfo.getMethod().getParameters();
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
                classInfo.getMethod().invoke(classInfo.getClazz(), par);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            req.getServletContext().getNamedDispatcher("default").forward(req,resp);
        }
    }

    private void initClassInfo(){
        Set<String> classNames= ScanUtils.scanPackage();
        for (String className:classNames){
            try {
                Class<?> clazz = Class.forName(className);
                if (clazz.isAnnotationPresent(WebRequest.class)){
                    Method[] methods=clazz.getDeclaredMethods();
                    for (Method m:methods){
                        if (m.isAnnotationPresent(WebRequest.class)){
                            WebRequest webreq=m.getAnnotation(WebRequest.class);
                            ClassInfo classInfo=new ClassInfo(clazz,m);
                            map.put(webreq.value(),classInfo);
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void initParamConvert(){
        converters.add(new BasicParamConverter());
        converters.add(new ServletConverter());
        converters.add(new BeanConvert());
    }
}
