package edu.nf.hw2.ch02.dao.impl;

import edu.nf.hw2.ch02.dao.BooksDao;
import edu.nf.hw2.ch02.entity.Books;
import edu.nf.hw2.ch02.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 天文学
 */
public class BooksDaoImpl implements BooksDao {
    @Override
    public void save(Books books) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(BooksDao.class).save(books);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void update(Books books) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(BooksDao.class).update(books);
        }catch (RuntimeException e){
            throw e;
        }
    }

    @Override
    public void delete(int id) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            sqlSession.getMapper(BooksDao.class).delete(id);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
