package org.nf.mvc.param.impl;

import org.nf.mvc.param.AbstractParamResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class ServletApiParamResolver extends AbstractParamResolver {

    @Override
    public Object process(Parameter param) {
        Class<?>clazz=param.getType();
        if (clazz.equals(HttpServletRequest.class)){
            return request;
        }else
        if (clazz.equals(HttpServletResponse.class)){
            return response;
        }else {
            return null;
        }
    }
}
