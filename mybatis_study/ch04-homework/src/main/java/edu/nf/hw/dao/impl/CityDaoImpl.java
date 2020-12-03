package edu.nf.hw.dao.impl;

import edu.nf.hw.dao.CityDao;
import edu.nf.hw.entity.City;
import edu.nf.hw.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class CityDaoImpl implements CityDao {
    @Override
    public List<City> listCity() {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(CityDao.class).listCity();
        }catch (RuntimeException e){
            throw e ;
        }
    }
}
