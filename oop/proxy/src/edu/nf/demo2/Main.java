package edu.nf.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        //创建回调处理器
        InvocationHandler handler=new DemoInvocationHandler(new TargetImpl());
        //使用jdk提供的proxy工具类来创建代理对象
        //newProxyInstance方法三个参数说明：
        //参数一：任意一个类加载器实列，因为jdk在运行时动态创建的代理字节码
        //      需要使用一个类加载器加载到jvm中才可以创建代理对象
        //参数二：目标对象实现的所以接口的class，因为jdk动态代理会根据这些
        //      接口动态生成一个代理，这个代理也会实现这些接口。
        //参数三：回调处理器，代理对象会执行回调处理器的invoke方法来调用目标对象的行为
        DemoInf proxy=(DemoInf) Proxy.newProxyInstance(Main.class.getClassLoader(),
                        TargetImpl.class.getInterfaces(),handler);
        proxy.todo("user1");

    }
}
