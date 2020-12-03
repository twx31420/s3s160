package org.nf.mvc.param.impl;

import org.nf.mvc.param.AbstractParamResolver;
import org.nf.mvc.util.ConverUtil;

import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class BasicParamResolver extends AbstractParamResolver {
    @Override
    public Object process(Parameter param) {
        Class<?>clazz=param.getType();
        String value=request.getParameter(param.getName());
        try {
            Object val = ConverUtil.convert(value, clazz);
            return val;
        }catch (Exception e){
            return null;
        }
    }
}
