package edu.nf.demo4;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 天文学
 * 方法拦截器，类似于jdk动态代理的
 */
public class UserServiceInterceptor implements MethodInterceptor {
    /**
     *
     * @param proxy 运行时创建的代理对象
     * @param method 目标对象正在调用的方法
     * @param args 目标对象方法所需的参数
     * @param methodProxy 代理过的目标对象方法 目标对象方法的代理实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        before();
        //由于动态创建的代理对象是一个子类
        //因此要调用目标的方法（也就是父类）时，
        //使用methodProxy.invokeSuper（）
        methodProxy.invokeSuper(proxy,args);
        after();
        return null;
    }

    private void before(){
        System.out.println("before.....");
    }
    private void after(){
        System.out.println("after.....");
    }
}
