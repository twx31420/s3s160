package edu.nf.ch03.dao.impl;

import edu.nf.ch03.dao.UserDao;
import edu.nf.ch03.entity.Users;
import edu.nf.ch03.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * @author 天文学
 */
public class UserDaoImpl implements UserDao {
    @Override
    public Users getUserByid(int id) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserByid(id);
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public Map<String, Object> getUserById2(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).getUserById2(uid);
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public List<Users> listUser() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser();
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public List<Map<String, Object>> listUser2() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listUser2();
        }catch (RuntimeException e){
            throw  e;
        }
    }

    @Override
    public int count() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).count();
        }catch (RuntimeException e){
            throw  e;
        }
    }
}
