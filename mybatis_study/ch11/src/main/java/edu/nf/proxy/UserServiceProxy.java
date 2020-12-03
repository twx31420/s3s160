package edu.nf.proxy;

import org.evergreen.aop.annotation.Around;
import org.evergreen.aop.core.InvocationContext;

public class UserServiceProxy {

    @Around
    public void test(InvocationContext ic)throws Throwable{
        System.out.println("befort");
        ic.proceed();
        System.out.println("after");
    }


}
