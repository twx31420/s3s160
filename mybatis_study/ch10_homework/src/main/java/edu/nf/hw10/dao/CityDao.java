package edu.nf.hw10.dao;

import edu.nf.hw10.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 天文学
 */
public interface CityDao {

    List<City> querylistCity(String province,String name,
            @Param("pageNum") Integer pageNum, @Param("pageSize") Integer pageSize);



}
