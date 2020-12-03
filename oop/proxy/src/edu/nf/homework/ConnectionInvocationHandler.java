package edu.nf.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author 天文学
 */
public class ConnectionInvocationHandler implements InvocationHandler {
    private Object target;
    private LinkedList<Connection> pool;

    public ConnectionInvocationHandler(Object target, LinkedList<Connection> pool) {
        this.target = target;
        this.pool = pool;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue=null;
        if("close".equals(method.getName())){
            //将连接放回连接池(注意：是被代理的连接对象)
            if (pool.size()==0 || pool.getLast()!=proxy){
                pool.addLast((Connection)proxy);
            }

        }else {
            returnValue=method.invoke(target,args);
        }
        return returnValue;
    }
}
