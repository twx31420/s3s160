package org.nf.mvc.core;

public class ConvertUtils {
    /**
     *
     * @param reqParam 请求差数
     * @param clazz 要转换的数据类型
     * @return 返回任意基本数据类型的值
     */
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
