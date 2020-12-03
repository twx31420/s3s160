package org.nf.mvc.param.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class ServletConverter extends AbstractParamConverter {
    @Override
    public Object convert(Parameter param) {
        if(param.getType().equals(HttpServletRequest.class)){
            return request;
        }
        if(param.getType().equals(HttpServletResponse.class)){
            return response;
        }
        return null;
    }
}
