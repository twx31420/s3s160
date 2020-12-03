package edu.nf.homework;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;

public class ConnectionPool {
    private LinkedList<Connection> pool=new LinkedList();

    /**
     * 在构造方法中初始化连接池大小，（从数据库获取5个connection）
     * @param
     */
    public ConnectionPool(int size) {
        for (int i=0;i<size;i++){
            pool.push(creatProxy(ConUtils.getConnetion()));
        }
    }
    private Connection creatProxy(Object obj){
        return (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),
                new Class[]{Connection.class},
                new ConnectionInvocationHandler(obj,pool));
    }
    public Connection getConnection(){
        if (pool.size()>0){
            return pool.removeFirst();
        }else {
            throw new RuntimeException("连接池暂无可连接");
        }
    }
    public int size(){
        return pool.size();
    }

    public void back(Connection con){
        pool.addLast(con);
    }


}
