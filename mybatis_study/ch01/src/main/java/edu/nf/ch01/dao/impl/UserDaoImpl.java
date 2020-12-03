package edu.nf.ch01.dao.impl;

import edu.nf.ch01.dao.UserDao;
import edu.nf.ch01.entity.Users;
import edu.nf.ch01.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.Map;

/**
 * @author 天文学
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save(Users users) {
        //获取SqlSession 对象， 并设置为true，表示自动提交事务
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            //通过getMapper方法返回一个UserDao的代理实现类
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //调用代理对象save方法进行保存
            userDao.save(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Users users) {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            UserDao userDao=sqlSession.getMapper(UserDao.class);
            userDao.update(users);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int uid) {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            UserDao userDao=sqlSession.getMapper(UserDao.class);
            userDao.delete(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save2(Map<String, Object> map) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            //通过getMapper方法返回一个UserDao的代理实现类
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            //调用代理对象save方法进行保存
            userDao.save2(map);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update2(String userName, int uid) {
        try(SqlSession sqlSession=MybatisUtils.getSqlSession(true)){
            UserDao userDao=sqlSession.getMapper(UserDao.class);
            userDao.update2(userName,uid);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
