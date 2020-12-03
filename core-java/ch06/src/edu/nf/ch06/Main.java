package edu.nf.ch06;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class Main {
    public static void main(String[] args)throws Exception {
        //获取Users的Class对象
        Class<?> clazz=Users.class;
        //获取类上标识的注解信息
        //isAnnoTationPresent方法
        if(clazz.isAnnotationPresent(MyAnno.class)){
            //获取指定的注解信息
            //Annotation []annos=clazz.getAnnotations();
            //获取指定的注解信息
            MyAnno anno=clazz.getAnnotation(MyAnno.class);
            //获取注解的属性信息
            String value=anno.value();
            String name=anno.name();
            System.out.println(name+", "+value);

        }
        System.out.println("-------------------------------");
        //获取方法的上的注解信息
        Method method=clazz.getMethod("say",String.class);
        if (method.isAnnotationPresent(MyAnno.class)){
            MyAnno anno2=method.getAnnotation(MyAnno.class);
            String value=anno2.value();
            String name=anno2.name();
            System.out.println(name+", "+value);
        }
        System.out.println("-----------------------------");
        //获取字段上的注解信息
        Field field=clazz.getDeclaredField("name");
        if (field.isAnnotationPresent(MyAnno.class)){
            MyAnno anno3=field.getAnnotation(MyAnno.class);
            String value=anno3.value();
            String name=anno3.name();
            System.out.println(name+", "+value);
        }
        System.out.println("---------------------------------");
        Parameter[] params=method.getParameters();
        for (Parameter p:params){
            if (p.isAnnotationPresent(MyAnno.class)){
                MyAnno anno=p.getAnnotation(MyAnno.class);
                String value=anno.value();
                String name=anno.name();
                System.out.println(name+", "+value);
            }
        }

        Constructor<?> cons=clazz.getConstructor(String.class);
        if (cons.isAnnotationPresent(MyAnno.class)){
            MyAnno anno = cons.getAnnotation(MyAnno.class);
            String value=anno.value();
            String name=anno.name();
            System.out.println(name+", "+value);
        }

    }
}
