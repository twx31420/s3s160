package edu.nf.ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class Main4 {
    public static void main(String[] args) throws Exception{
        //获取User的Class对象
        Class<?> clazz=Class.forName("edu.nf.ch05.Users");
        //根据Class获取所有公共的相应的构造方法,构造方法使用Constructor对象来描述
        //一个Constructor表示一个构造方法
        Constructor [] cons=clazz.getConstructors();
        for(Constructor c:cons){
            //输出构造方法的名
            System.out.println(c.getName());
            //获取构造方法的参数信息以及差数的个数
            Parameter[] params= c.getParameters();
            //循环输出每一个参数的详细信息
            for(Parameter p:params){
                System.out.println("参数名称："+p.getName());
                System.out.println("参数类型："+p.getType());
            }
            System.out.println();
        }
        System.out.println("____________________________________________-");
        //获取某一个公共的构造方法
        Constructor con=clazz.getConstructor(String.class);
        //使用构造方法类创建实例,同时需要传入构造方法所需的参数
        //如果是无参的构造方法。则不需要
        Object obj=con.newInstance("user1");
        System.out.println("创建出来的实例："+obj);
        System.out.println("__________________________________________");
        //获取所有的构造方法，包括私有的
        Constructor []cons2=clazz.getDeclaredConstructors();
        for (Constructor c:cons2){
            System.out.println(c.getName()+",参数的个数："+c.getParameterCount());
        }
        //获取某一个的私有的构造方法
        Constructor c=clazz.getDeclaredConstructor(Integer.TYPE);
        System.out.println("私有的构造方法"+c.getName());
        //如果要使用私有的构造方法来创建实例，就必须先打开访问开关
        c.setAccessible(true);
        Object obj2=c.newInstance(1);
        System.out.println("私有构造方法创建的实例："+obj2);
    }
}
