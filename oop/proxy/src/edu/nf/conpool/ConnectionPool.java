package edu.nf.conpool;

import edu.nf.homework.ConUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

/**
 * @author 天文学
 */
public class ConnectionPool {
    private LinkedList<Connection> pool=new LinkedList<>();

    public ConnectionPool(int size) {
        for(int i=0;i<size;i++){
            //获取连接对象
            Connection con= ConUtils.getConnetion();
            //根据目标对象创建代理对象
            Connection proxy=createProxy(con);
            //添加到连接池
            pool.add(proxy);
        }
    }

    private Connection createProxy(Connection target){
        return (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),
                new Class[]{Connection.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if ("close".equals(method.getName())){
                            pool.addLast(target);
                            return null;
                        }else {
                            return method.invoke(target,args);
                        }
                    }
                });
    }
}
