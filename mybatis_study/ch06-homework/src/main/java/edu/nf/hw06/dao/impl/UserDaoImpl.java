package edu.nf.hw06.dao.impl;

import edu.nf.hw06.dao.UserDao;
import edu.nf.hw06.entity.Users;
import edu.nf.hw06.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class UserDaoImpl implements UserDao {

    @Override
    public List<Users> listuser(Users users) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(UserDao.class).listuser(users);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
