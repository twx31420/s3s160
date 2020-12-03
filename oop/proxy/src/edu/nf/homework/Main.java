package edu.nf.homework;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) throws Exception{
        ConnectionPool pool=new ConnectionPool(2);
        System.out.println("连接池大小："+pool.size());
        //获取连接
        Connection con=pool.getConnection();
//        Connection con2=pool.getConnection();
        System.out.println("连接池大小："+pool.size());
        con.close();
        con.close();
        //注意：调用con的close方法，将连接放回连接池
//        con1.close();
//        con2.close();
//        Connection con3=pool.getConnection();
//        Connection con4=pool.getConnection();
//        con3.close();
//        con4.close();

        System.out.println("连接池大小："+pool.size());
    }
}
