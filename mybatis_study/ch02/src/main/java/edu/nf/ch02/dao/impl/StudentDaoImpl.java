package edu.nf.ch02.dao.impl;

import edu.nf.ch02.dao.StudentDao;
import edu.nf.ch02.entity.Student;
import edu.nf.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void save2(Student student) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StudentDao.class).save2(student);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void save(Student student) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(StudentDao.class).save(student);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
