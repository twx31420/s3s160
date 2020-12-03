package org.nf.mvc.param2.impl;

import org.nf.mvc.core.ConvertUtils;
import org.nf.mvc.param2.AbstractParamResolver;

import java.lang.reflect.Field;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

/**
 * @author 天文学
 */
public class BeanParamResolver extends AbstractParamResolver {
    @Override
    public Object process(Parameter param) {
        //获取参数类型
        Class<?> paramType=param.getType();
        try {
            //创建当前参数对象的实例
            Object obj=paramType.newInstance();
            //获取参数的所有私有字段
            Field[] fields = paramType.getDeclaredFields();
            for (Field field : fields) {
                //打开访问开关
                field.setAccessible(true);
                //获取字段类型
                Class<?> fieldType = field.getType();
                //字段名
                String fieldName = field.getName();
                //根据字段名与请求参数的你name匹配，获取请求参数的值
                String requestParam = request.getParameter(fieldName);
                //进行转换
                Object value = ConvertUtils.convert(requestParam, fieldType);
                //将value赋值给字段
                field.set(obj,value);
            }
            return obj;
        }catch (Exception e){
            return null;
        }

    }
}
