package edu.nf.hw.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 天文学
 */
public class ConUtils {
     private static String driver="com.mysql.jdbc.Driver";
     private static String url="jdbc:mysql://localhost:3306/uers?useSSL=false&useCode=true&characterEncoding=utf-8";
     private static String user="root";
     private static String pwd="";

     static {
         try {
             Class.forName(driver);
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
     }

     public static Connection getCon(){
         try {
             return DriverManager.getConnection(url,user,pwd);
         } catch (SQLException e) {
             e.printStackTrace();
             throw new RuntimeException("连接异常",e);
         }
     }
}
