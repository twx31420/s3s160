package edu.nf.ch05;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author 天文学
 */
public class Main3 {
    public static void main(String[] args) throws Exception {
        //获取Users类的Class对象
        Class<?>clazz=Users.class;
        //跟据Class对象创建当前类的实例（会执行构造方法）
        Object obj=clazz.newInstance();
        //获取当前类的所有公共的方法，包括继承的（自然也包括Object中的方法）
        //Method用于描述方法信息，一个方法使用一个Method来描述
        Method [] methods=clazz.getMethods();
        for (Method method :  methods) {
            //获取方法名称
            System.out.println("名称："+method.getName());
            //获取方法的返回值类型
            System.out.println("返回类型："+method.getReturnType());

        }
        System.out.println("_____________________________________________");
        //获取某一个公共的方法,差数一指定方法名
        //第二个差开始是一个可变差数，表示方法的差数类型
        //如果方法声明了差数，那么就需要指定差数类型
        Method method1=clazz.getMethod("say" ,String.class,Integer.TYPE);
        //获取方法名
        System.out.println(method1.getName());
        //获取方法返回类型
        System.out.println(method1.getReturnType());
        //获取方法差数个数
        System.out.println(method1.getParameterCount());
        //获取方法差数信息，Parameter表示差数信息，一个Parameter
        //表示一个差数对象
        Parameter [] params=method1.getParameters();
        for (Parameter param:params){
            //获取差数名称
            System.out.println(param.getName());
            //获取差数类型
            System.out.println(param.getType());

        }
        //回调调用当前方法,使用invoke方法，差数一传入当前类的实例，第二个差数
        //开始是一个可变差数，表示方法的实参，如果方法有返回值，
        //那么invoke也会返回相应的值，如果方法返回值是void ，那么invoke返回的是null
        System.out.println(method1.invoke(obj,"user1" ,23));

        //获取某个私有的方法
        Method method2=clazz.getDeclaredMethod("run");
        //私有方法式不能直接访问的，调用前必须先打开访问开关
        method2.setAccessible(true);
        //run 方法没有差数 ，因此调用invoke时候不需要传入实参，只需传入当前实例
        method2.invoke(obj);

        //获取本类中所有方法，包括私有和公共的，但不包括继承的
        Method [] methods2=clazz.getDeclaredMethods();
        for (Method m:methods2){
            System.out.println(m.getName());
        }


    }

}
