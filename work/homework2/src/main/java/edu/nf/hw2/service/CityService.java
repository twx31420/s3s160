package edu.nf.hw2.service;

import edu.nf.hw2.dao.CityDao;
import edu.nf.hw2.entity.City;

import java.util.List;

/**
 * @author 天文学
 */
public class CityService {
    /**
     * 查询城市列表
     * @return
     */
    public List<City> cityList(){
        return new CityDao().cityList();
    }

}
