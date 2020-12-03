package edu.nf.chhw.dao.impl;

import edu.nf.chhw.dao.CityDao;
import edu.nf.chhw.entity.City;
import edu.nf.chhw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class CityDaoImpl implements CityDao {
    @Override
    public void save(City city) {
        getAgent().save(city);
    }

    @Override
    public void update(City city) {
        getAgent().update(city);
    }

    @Override
    public void delete(int id) {
        getAgent().delete(id);
    }



    /**
     * 获取代理对象
     * @return
     */
    public CityDao getAgent(){
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            CityDao dao=sqlSession.getMapper(CityDao.class);
            return dao;
        }catch (RuntimeException e){
            throw e;
        }
    }

}
