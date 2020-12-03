package edu.nf.test.service;

import edu.nf.test.dao.CityDao;
import edu.nf.test.entity.PageBean;

/**
 * @author 天文学
 */
public class CityService {
    public PageBean listCity(PageBean page){
        CityDao dao=new CityDao();
        page.setTotal(dao.selectCount());
        page.setData(dao.cityList(page));
        return page;
    }
}
