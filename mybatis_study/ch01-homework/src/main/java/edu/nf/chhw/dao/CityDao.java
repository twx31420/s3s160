package edu.nf.chhw.dao;

import edu.nf.chhw.entity.City;

import java.util.List;

/**
 * @author 天文学
 */
public interface CityDao {
    /**
     * 添加
     * @param city
     */
    void save(City city);

    /**
     * 修改
     * @param city
     */
    void update(City city);

    /**
     * 删除
     * @param id
     */
    void delete(int id);



}
