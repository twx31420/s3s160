package org.nf.mvc.param2.impl;

import org.nf.mvc.param2.AbstractParamResolver;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class ServletApiParamResolver extends AbstractParamResolver {
    @Override
    public Object process(Parameter param) {
        Class<?> paramType=param.getType();
        if (paramType.equals(HttpServletRequest.class)){
            return request;
        }else if (paramType.equals(HttpServletResponse.class)){
            return response;
        }else if(paramType.equals(HttpSession.class)){
            return request.getSession();
        }else if(paramType.equals(ServletContext.class)){
            return request.getServletContext();
        }else if(paramType.equals(Cookie.class)){
            return request.getCookies();
        }else {
            return null;
        }
    }
}
