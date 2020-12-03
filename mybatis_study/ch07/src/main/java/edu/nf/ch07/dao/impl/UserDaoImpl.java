package edu.nf.ch07.dao.impl;

import edu.nf.ch07.dao.UserDao;
import edu.nf.ch07.entity.Users;
import edu.nf.ch07.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void addBatch(List<Users> users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).addBatch(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delBatch(int[] ids) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).delBatch(ids);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
