package edu.nf.ch10.dao;

import edu.nf.ch10.entity.City;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 天文学
 */
public interface CityDao {

    List<City> listCity(@Param("pageNum") Integer pageNum,@Param("pageSize") Integer pageSize);



}
