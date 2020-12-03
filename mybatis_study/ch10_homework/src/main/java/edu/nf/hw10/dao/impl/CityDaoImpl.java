package edu.nf.hw10.dao.impl;

import edu.nf.hw10.dao.CityDao;
import edu.nf.hw10.entity.City;
import edu.nf.hw10.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 天文学
 */
public class CityDaoImpl implements CityDao {
    @Override
    public List<City> querylistCity(String province,String name,
            Integer pageNum, Integer pageSize) {
        try(SqlSession sqlSession= MybatisUtils.getSqlSession(true)){
            return sqlSession.getMapper(CityDao.class).querylistCity(province,name,pageNum,pageSize);
        }catch (RuntimeException e){
            throw e;
        }
    }
}
