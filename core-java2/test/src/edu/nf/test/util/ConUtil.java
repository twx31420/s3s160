package edu.nf.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 天文学
 */
public class ConUtil {
    private static String  driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/demo?useSSL=false&useCode=true&characterEncoding=utf-8";
    private static String user="root";
    private static String pwd="root";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("加载异常",e);
        }
    }

    public static Connection getcon(){
        try {
            return DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("连接失败",e);
        }
    }

    public static void main(String[] args) {
        System.out.println(getcon());
    }
}
