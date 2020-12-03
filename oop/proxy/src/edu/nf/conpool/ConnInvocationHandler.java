package edu.nf.conpool;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.LinkedList;

public class ConnInvocationHandler implements InvocationHandler {
    private LinkedList<Connection> pool;
    private Connection target;

    public ConnInvocationHandler(LinkedList<Connection> pool, Connection target) {
        this.pool = pool;
        this.target = target;
    }

    /**
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     * 连接对象的回调处理器
     *
     * 在回调处理器中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
