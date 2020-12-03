package edu.nf.conpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 天文学
 */
public class ConnUtils {
    private static String driver="com.mysql.jdbc.Driver";
    private static String url="jdbc:mysql://localhost:3306/mybatis_study";
    private static String user="root";
    private static String pwd="";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConncetion(){
        try {
            return DriverManager.getConnection(url,user,pwd);
        } catch (SQLException e) {
            throw new RuntimeException("连接失败",e);
        }
    }
}
