package org.nf.mvc.util;

/**
 * @author 天文学
 */
public class ConverUtil {
    public static Object convert(String reqParam,Class<?> clazz){
        Object value=null;
        if(clazz.equals(String.class)){
            value=reqParam;
        }else if (clazz.equals(Short.class)||clazz.equals(Short.TYPE)){
            value=Short.valueOf(reqParam);
        }else if (clazz.equals(Integer.class)||clazz.equals(Integer.TYPE)){
            value=Integer.valueOf(reqParam);
        }else if (clazz.equals(Long.class)||clazz.equals(Long.TYPE)){
            value=Long.valueOf(reqParam);
        }else if (clazz.equals(Float.class)||clazz.equals(Float.TYPE)){
            value=Float.valueOf(reqParam);
        }else if (clazz.equals(Double.class)||clazz.equals(Double.TYPE)){
            value=Double.valueOf(reqParam);
        }else if (clazz.equals(Byte.class)||clazz.equals(Byte.TYPE)){
            value=Byte.valueOf(reqParam);
        }else if (clazz.equals(Character.class)||clazz.equals(Character.TYPE)){
            value=Character.valueOf(reqParam.charAt(0));
        }else if (clazz.equals(Boolean.class)||clazz.equals(Boolean.TYPE)){
            value=Boolean.valueOf(reqParam);
        }
        return value;
    }
}
