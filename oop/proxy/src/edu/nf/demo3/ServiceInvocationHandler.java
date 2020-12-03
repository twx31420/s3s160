package edu.nf.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ServiceInvocationHandler implements InvocationHandler {
    private Object target;

    public ServiceInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用目标对象的方法
        Object returnValue=method.invoke(target,args);
        //记录日志
        log();
        return returnValue;
    }
    private void log(){
        System.out.println("记录操作日志。。。。。");
    }
}
