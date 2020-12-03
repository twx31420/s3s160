package edu.nf.containerfactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ClassUtil {
    private static Map<String,Object> container=new HashMap<>();
    public ClassUtil(String url) {
        init(url);
    }
    private void init(String url){
        ScanUtils.scanPackage().forEach(str ->{
            if (str.contains(url)){
                try {
                    Class<?> clazz=Class.forName(str);
                    System.out.println(clazz.getSimpleName());
                    container.put(clazz.getSimpleName(),clazz.newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public <T>T getInstance(String name){
        return (T)container.get(name);
    }
}
