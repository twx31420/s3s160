package edu.nf.ch05;

/**
 * 任何一个类都会有一个对应的Class对象
 * 当类加载器加载class文件时，先将文件解析为
 * 二进制的字节数组，然后利用这个字节数组创建
 * 一个唯一的Class对象，这个Class对象里面包含
 * 了整个类的所有信息（列如类名，字段、方法、构造方法等等）
 * 注意：Class对象是有类加载器去加载创建的，我们不能创建。
 * 但我们可以在程序中通过某些方式获得这个创建好的Class对象
 *
 *
 * 反射：在运行时动态访问和操作Class对象的信息，让Java语言
 * 具备一定的动态性。
 *
 * @author 天文学
 */
public class Main {
    public static void main(String[] args) throws Exception {
        //可以使用一下三种方式来获取Class对象
        Class c1=Main.class;
        Class c2=Class.forName("edu.nf.ch05.Main");
        Main m=new Main();
        Class c3=m.getClass();
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        //通过Class对象来创建当前类的实例，使用newInstance方法
        c1.newInstance();
    }
}
