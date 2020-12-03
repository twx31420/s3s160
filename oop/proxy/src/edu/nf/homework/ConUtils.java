package edu.nf.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConUtils {
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

    public static Connection getConnetion(){
        try {
            return DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            throw  new RuntimeException("连接失败",e);
        }
    }



}
