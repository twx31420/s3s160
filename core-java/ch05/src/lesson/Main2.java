package lesson;

import java.lang.reflect.Field;

/**
 * @author 天文学
 */
public class Main2 {
    public static void main(String[] args)throws Exception {
        Class<?>clazz=Student.class;
        Object obj=clazz.newInstance();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        System.out.println(clazz.getPackage());
        Field [] fields=clazz.getFields();
        for (Field f:fields){
            System.out.println("字段名为："+f);
        }
    }

}
