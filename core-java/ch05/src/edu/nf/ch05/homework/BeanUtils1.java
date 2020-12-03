package edu.nf.ch05.homework;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 天文学
 */
public class BeanUtils1 {
    public static Object convertToBean(Map<String,Object>map,Class clazz)throws Exception{
        Object obj=clazz.newInstance();
        for (String key:map.keySet()){
           Field field= clazz.getDeclaredField(key);
           field.set(obj,map.get(key));
        }
        return obj;
    }
    public static Map<String,Object> convertToMap(Object obj)throws Exception{
        Map<String,Object> map =new HashMap<>();
        Field [] fields=obj.getClass().getDeclaredFields();
        for (Field f:fields){
            f.setAccessible(true);
            map.put(f.getName(),f.get(obj));
        }
        return map;
    }
    public static void copy(Object src,Object target)throws Exception{
        Field []fields=target.getClass().getDeclaredFields();
        for (Field f:fields){
            f.setAccessible(true);
            src.getClass().getDeclaredField(f.getName()).setAccessible(true);
            f.set(target,f.get(src));
        }
    }
}
