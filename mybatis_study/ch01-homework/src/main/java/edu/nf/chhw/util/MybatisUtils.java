package edu.nf.chhw.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 天文学
 */
public class MybatisUtils {
    /**
     * SqlSessionFactory的是一个工厂类，用于专门创建SqlSession对象，
     * 而SqlSession就是具体的连接对象，它封装了Connection等jdbc的API,
     * 用于操作数据库
     */
    private static SqlSessionFactory sqlSessionFactory;

    /**
     * 初始化SqlSessionFactory
     */
    static {
        try{
            InputStream is=Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            sqlSessionFactory=builder.build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    /**
     * 获取SqlSession 对象
     * @param antoCommit true表示自动提交事务，false表示手动提交事务。
     * @return
     */
    public static SqlSession getSqlSession(boolean antoCommit){
        return sqlSessionFactory.openSession(antoCommit);
    }

}
