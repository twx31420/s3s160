package edu.nf.proxy;

import org.evergreen.aop.annotation.Interceptors;

@Interceptors({UserServiceProxy.class})
public class UserService {

    public void say(){
        System.out.println("say...");
    }

}
