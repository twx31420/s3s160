package edu.nf.hw2.dao;

import edu.nf.hw2.entity.City;
import edu.nf.hw2.util.ConUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 */
public class CityDao {
    /**
     * 查询所有城市方法
     * @return
     */
    public List<City> cityList(){
        String sql="SELECT city_id,city_name,city_code,province FROM city_info limit 0,16";
        List<City> list=new ArrayList<>();

        try(Connection con= ConUtils.getCon();
            PreparedStatement ps=con.prepareStatement(sql)) {
            try(ResultSet rs=ps.executeQuery()){
                while (rs.next()){
                    City city=new City();
                    city.setId(rs.getInt(1));
                    city.setName(rs.getString(2));
                    city.setCode(rs.getString(3));
                    city.setProvince(rs.getString(4));
                    list.add(city);
                }
            }catch (Exception e){
                throw e;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
