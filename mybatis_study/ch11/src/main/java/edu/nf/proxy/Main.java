package edu.nf.proxy;

import org.evergreen.aop.core.ProxyBuilder;

public class Main {
    public static void main(String[] args) {
        ProxyBuilder builder=new ProxyBuilder(UserService.class);
        UserService service=builder.createProxy();
        service.say();
    }
}
