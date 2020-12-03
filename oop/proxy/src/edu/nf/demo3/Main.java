package edu.nf.demo3;

import edu.nf.demo3.impl.UserServiceAImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvocationHandler handler=new ServiceInvocationHandler(new UserServiceAImpl());
        ServiceInf proxy=(ServiceInf) Proxy.newProxyInstance(Main.class.getClassLoader(),
                UserServiceAImpl.class.getInterfaces(),
                handler);
    }
}
