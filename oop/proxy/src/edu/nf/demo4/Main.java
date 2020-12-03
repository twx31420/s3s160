package edu.nf.demo4;

import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        //创建代理生成器，用于创建代理对象
        Enhancer eh=new Enhancer();
        //给代理生成器设置父类，也就是要告诉
        //cglib给哪一个Class动态生成代理子类
        eh.setSuperclass(UserService.class);
        //在设置方法拦截器
        eh.setCallback(new UserServiceInterceptor());
        //创建代理
        UserService proxy=(UserService)eh.create();
        proxy.say();
        proxy.run();
    }
}
