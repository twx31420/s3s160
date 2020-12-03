package edu.nf.hw.dao;

import edu.nf.hw.entity.City;

import java.util.List;

/**
 * @author 天文学
 */
public interface CityDao {
    /**
     * 查询城市列表
     * @return
     */
    List<City> listCity();
}
