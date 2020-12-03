package edu.nf.hw.service;

import edu.nf.hw.dao.CityDao;
import edu.nf.hw.dao.impl.CityDaoImpl;
import edu.nf.hw.entity.City;

import java.util.List;

/**
 * @author 天文学
 */
public class Cityservice {
    public List<City> cityList(){
        return new CityDaoImpl().listCity();
    }
}
