package org.nf.mvc.param.impl;


import org.nf.mvc.util.ConverUtil;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class BeanConvert extends AbstractParamConverter{
    @Override
    public Object convert(Parameter param) {
            Class<?> clazz = param.getType();
            try {
                Object obj = clazz.newInstance();
                Field[] fields = clazz.getDeclaredFields();
                for (Field field : fields) {
                    field.setAccessible(true);
                    String value = request.getParameter(field.getName());
                    field.set(obj, ConverUtil.convert(value,field.getType()));
                }
                return obj;
            } catch (Exception e) {
                return null;
            }
    }
}
