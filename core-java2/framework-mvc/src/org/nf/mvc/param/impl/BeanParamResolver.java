package org.nf.mvc.param.impl;

import org.nf.mvc.param.AbstractParamResolver;
import org.nf.mvc.util.ConverUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class BeanParamResolver extends AbstractParamResolver {

    @Override
    public Object process(Parameter param) {
        Class<?> clazz=param.getType();
        try {
            Object obj = clazz.newInstance();
            Field [] fields=clazz.getDeclaredFields();
            for (Field field:fields){
                field.setAccessible(true);
                String value =request.getParameter(field.getName());
                if(value!=null) {
                    Object objValue = ConverUtil.convert(value, field.getType());
                    field.set(obj, objValue);
                }
            }
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
