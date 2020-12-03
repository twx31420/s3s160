package edu.nf.eshop.test.service;

import edu.nf.eshop.test.dao.CityDao;
import edu.nf.eshop.test.entity.PageBean;

/**
 * @author 天文学
 */
public class CityService {

    public PageBean cityList(PageBean page){
        CityDao dao =new CityDao();
        page.setData(dao.cityList(new PageBean()));
        page.setTotal(dao.total());
        return page;
    }

}
