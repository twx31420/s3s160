package edu.nf.hw08.dao.impl;

import edu.nf.hw08.dao.CardDao;
import edu.nf.hw08.dao.StuDao;
import edu.nf.hw08.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class CardDaoImpl implements CardDao {
    @Override
    public void dels(int[] ids) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(false)){
            sqlSession.getMapper(CardDao.class).dels(ids);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
