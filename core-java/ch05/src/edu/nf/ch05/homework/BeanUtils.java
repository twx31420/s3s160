package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

    public static Object convert(Map<String,Object>map,Class clazz)throws Exception{
        Object obj=clazz.newInstance();
        Field [] fields=clazz.getDeclaredFields();
        for (Field f:fields){
            Field field=clazz.getDeclaredField(f.getName());
            field.setAccessible(true);
            field.set(obj,map.get(field.getName()));
        }
        return obj;
    }

    /**
     * 对象进行copy
     * @param o1 被copy的对象
     * @param o copy的对象
     * @return
     * @throws Exception
     */
    public static Object copy1(Object o1,Object o)throws Exception{
        Object obj=o1.getClass().newInstance();
        Field [] fields=o1.getClass().getDeclaredFields();
        for (Field f:fields){
            Field field=o.getClass().getDeclaredField(f.getName());
            field.setAccessible(true);
            f.setAccessible(true);
            f.set(obj,field.get(o));
        }
        return obj;
    }
    public static Map<String,Object> convertMap(Object obj)throws Exception{
        Map<String,Object> map =new  HashMap<>();
        Field [] fields=obj.getClass().getDeclaredFields();
        for (Field f:fields){
            Field field=obj.getClass().getDeclaredField(f.getName());
            field.setAccessible(true);
            map.put(field.getName(),field.get(obj));
        }
        return map;
    }

    /**
     * 将map集合转换为实体
     * @param map
     * @param clazz
     * @return
     */
    public static Object convertToBean(Map<String,Object>map,Class clazz){
        try {
            Object obj=clazz.newInstance();
                //循环遍历map集合，取出每个key
                for (String  key:map.keySet()) {
                    Field field = null;

                    //只要key和实体的字段名相匹配，就可以取出相应的Field对象
                    field = clazz.getDeclaredField(key);
                    //打开访问开关，给field赋值
                    field.setAccessible(true);
                    //赋值，中map集合中根据key取出value，然后赋值给Field
                    Object value=map.get(key);
                    field.set(obj, value);
                }
            return obj;
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }

    /**
     * 将实体转换为map集合
     * @param obj
     * @return
     * @throws Exception
     */
    public static Map<String,Object> convertToMap(Object obj){
        Map<String,Object> map =new  HashMap<>();
        //根据实例获取Class对象
        Class<?>clazz=obj.getClass();
        //获取所有的私有字段
        Field [] fields=clazz.getDeclaredFields();
        //循环遍历每一个字段信息
        for (Field f:fields){
            //取出每一个field值
            try {
                Object value=f.get(obj);
                map.put(f.getName(),value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return map;
        // Field f=new Field(obj,"",String.class,1,3,"",bytes);
    }

    /**
     * Bean
     * 把src实体对象的字段信息拷贝到target实体对象的字段中
     * @param src
     * @param target
     */
    public static void copy(Object src,Object target){
        //先获取实例的Class对象
        Class<?>srcClass=src.getClass();
        Class<?>targetClass=target.getClass();
       //先获取源对象中的所有字段信息
        Field[] fields=srcClass.getDeclaredFields();
        for(Field field:fields){
            try {
                field.setAccessible(true);
                Object value=field.get(src);
                //跟据src的字段名去获取目标对象同名的Field
                Field targetField=targetClass.getDeclaredField(field.getName());
                //打开访问开关
                targetField.setAccessible(true);
                //给目标的field设置
                targetField.set(target,value);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void copy(Object src,Object... target){
        Class<?> tar=target.getClass();
        Class<?> sr=src.getClass();
        Field [] fields=tar.getDeclaredFields();
        for (Field field:fields){
            field.setAccessible(true);
            Field srcF= null;
            try {
                srcF = sr.getDeclaredField(field.getName());
                srcF.setAccessible(true);
                field.set(target,srcF.get(src));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
