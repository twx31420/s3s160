package org.nf.mvc.util;

/**
 * @author wangl
 * @date 2020/10/16
 */
public class ConvertUtils {

    /**
     *
     * @param requestParam 请求参数
     * @param clazz  要转换的数据类型
     * @return 返回任意基本数据类型的值
     */
    public static Object convert(String requestParam, Class<?> clazz){
        Object value = null;
        if(clazz.equals(String.class)){
            value = requestParam;
        }else if(clazz.equals(Short.class) || clazz.equals(Short.TYPE)){
            value = Short.valueOf(requestParam);
        }else if(clazz.equals(Integer.class) || clazz.equals(Integer.TYPE)){
            value = Integer.valueOf(requestParam);
        }else if(clazz.equals(Long.class) || clazz.equals(Long.TYPE)){
            value = Long.valueOf(requestParam);
        }else if(clazz.equals(Float.class) || clazz.equals(Float.TYPE)){
            value = Float.valueOf(requestParam);
        }else if(clazz.equals(Double.class) || clazz.equals(Double.TYPE)){
            value = Double.valueOf(requestParam);
        }else if(clazz.equals(Byte.class) || clazz.equals(Byte.TYPE)){
            value = Byte.valueOf(requestParam);
        }else if(clazz.equals(Character.class) || clazz.equals(Character.TYPE)){
            value = Character.valueOf(requestParam.charAt(0));
        }else if(clazz.equals(Boolean.class) || clazz.equals(Boolean.TYPE)){
            value = Boolean.valueOf(requestParam);
        }
        return value;
    }


    public static void main(String[] args) {
        String str = "21";
        Double age = (Double)ConvertUtils.convert(str, Double.class);
        System.out.println(age);
    }
}
