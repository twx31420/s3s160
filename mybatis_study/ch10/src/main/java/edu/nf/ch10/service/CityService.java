package edu.nf.ch10.service;

import com.github.pagehelper.PageInfo;
import edu.nf.ch10.dao.CityDao;
import edu.nf.ch10.dao.impl.CityDaoImpl;
import edu.nf.ch10.entity.City;

import java.util.List;

/**
 * @author 天文学
 */
public class CityService {
    /**
     * 查询分页数据，并分装成pageInfo对象
     * pageInfo这个类包含许多分页参数的信息，提供给页面访问
     * 列如：当前页，中页数，总记录数，起始页，尾页等的
     * @param pageNum
     * @param pageSize
     * @return
     */
    public PageInfo<City> listCity(Integer pageNum, Integer pageSize){
        CityDao dao =new CityDaoImpl();
        //查询分页记录
        List<City> list=dao.listCity(pageNum,pageSize);
        //将list分装pageInfo对象中并返回
        PageInfo<City> pageInfo =new PageInfo<>(list);
        return pageInfo;
    }

}
