package org.nf.mvc.param.impl;



import org.nf.mvc.util.ConverUtil;

import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class BasicParamConverter extends AbstractParamConverter{

    @Override
    public Object convert(Parameter param) {
        Class<?> paramType=param.getType();
        String paramName=param.getName();
        System.out.println(paramType);

        String paramValue=request.getParameter(paramName);
        System.out.println(paramValue);
        try {
            Object value = ConverUtil.convert(paramValue, paramType);
            return value;
        }catch (Exception e){
            return null;
        }
    }
}
