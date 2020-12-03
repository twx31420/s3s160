package edu.nf.ch06.util;

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
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession(boolean antoCommit){
        return sqlSessionFactory.openSession(antoCommit);
    }
}
