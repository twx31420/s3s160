package edu.nf.ch05.dao.impl;

import edu.nf.ch05.dao.UserDao;
import edu.nf.ch05.entity.Users;
import edu.nf.ch05.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public int count() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).count();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Users> like(String likeName) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).like(likeName);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
