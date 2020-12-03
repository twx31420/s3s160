package edu.nf.demo2;

/**
 * @author 天文学
 * 目标对象，（也就是被代理的对象）
 */
public class TargetImpl implements DemoInf{
    @Override
    public void todo(String name) {
        System.out.println("执行业务逻辑操作:"+name);
    }

    @Override
    public void say(String name) {
        System.out.println("hello world:"+name);
    }
}
