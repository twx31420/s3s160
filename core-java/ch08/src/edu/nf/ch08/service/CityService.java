package edu.nf.ch08.service;

import edu.nf.ch08.dao.CityDao;
import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;

import java.util.List;

public class CityService {
    public void getCitys(PageBean page){
        CityDao dao=new CityDao();
        page.setCount(dao.count());
        List<City> list=dao.listCity(page);
        page.setData(list);
    }


}
