package edu.nf.ch08.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.InputStream;

/**
 * @author 天文学
 * @date 2020/12/2
 */
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {

        try {
            InputStream is= Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }

}
