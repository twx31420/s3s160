package edu.nf.ch09.dao.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.entity.Users;
import edu.nf.ch09.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 天文学
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Users getUserById(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users getUserById2(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById2(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public Users getUserById3(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById3(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save(Users users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).save(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).update(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(UserDao.class).delete(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
