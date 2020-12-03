package edu.nf.hw08.dao.impl;

import edu.nf.hw08.dao.StuDao;
import edu.nf.hw08.entity.Student;
import edu.nf.hw08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class StuDaoImpl implements StuDao {
    @Override
    public List<Student> getAll() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(StuDao.class).getAll();
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void dels(int[] ids) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(false)){
            sqlSession.getMapper(StuDao.class).dels(ids);
        }catch (RuntimeException e){
            throw e;
        }
    }


}
