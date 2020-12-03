package edu.nf.ch01.util;

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
            //首先查找mybatis的核心配置文件（mybatis.xml）进行解析,并返回一个输入流
            InputStream is= Resources.getResourceAsStream("mybatis.xml");
            //使用SqlSessionFactoryBuilder类来读取输入流并解析配置
            //并创建出SqlSessionfFactory对象
            SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
            //创建sqlSessionFactory
            sqlSessionFactory=builder.build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * 获取SqlSession 对象
     * @param autoCommit true表示自动提交事务，false表示手动提交事务。
     * @return
     */
    public static SqlSession getSqlSession(boolean autoCommit){
        //通过上面的初始化好的SqlSessionFactory来创建SqlSession对象
        return sqlSessionFactory.openSession(autoCommit);
    }
}
