package edu.nf.ch08.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnUtils {
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&characterEncoding=utf-8";
    private static String user="root";
    private static String pwd="";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("获取连接异常",e);
        }
    }

}

