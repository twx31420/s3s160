package edu.nf.hw08.dao.impl;

import edu.nf.hw08.dao.StuDao;
import edu.nf.hw08.dao.SubDao;
import edu.nf.hw08.entity.Student;
import edu.nf.hw08.entity.Subject;
import edu.nf.hw08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class SubDaoImpl implements SubDao {
    @Override
    public Student getStudentById(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(SubDao.class).getStudentById(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public List<Subject> getStudentById2(int uid) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(SubDao.class).getStudentById2(uid);
        }catch (RuntimeException e){
            throw e;
        }
    }

}
