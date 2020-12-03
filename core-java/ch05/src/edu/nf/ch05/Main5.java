package edu.nf.ch05;



/**
 * @author 天文学
 */
public class Main5 {

    public static void main(String[] args) {
        //获取User的Class对象
        Class<?>clazz=Users.class;
        //获取父类的Class对象
        Class<?> superClass=clazz.getSuperclass();
        //父类的完整类名
        System.out.println(superClass.getName());
        //在往上父类的完整类名
        System.out.println(superClass.getSuperclass().getName());

        System.out.println("________________________________________");
        //获取实现的接口的Class对象信息，因为一个类可以实现多个接口
        //所有返回的是一个Class数组
        Class<?> [] infClasses=clazz.getInterfaces();
        for (Class<?>infClass:infClasses){
            System.out.println(infClass.getName());
        }

    }


}
