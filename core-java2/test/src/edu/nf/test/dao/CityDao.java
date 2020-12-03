package edu.nf.test.dao;

import edu.nf.test.entity.City;
import edu.nf.test.entity.PageBean;
import edu.nf.test.util.ConUtil;

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
     * 获取所有城市信息
     * @return
     */
    public List<City> cityList(PageBean page){
        List<City>list =new ArrayList<>();
        String sql="select city_id,city_name,city_code,province from city_info limit ?,?";
        try(Connection con= ConUtil.getcon();
            PreparedStatement ps=con.prepareStatement(sql)){
            ps.setInt(1,page.getRowNum());
            ps.setInt(2,page.getPageSize());
            try(ResultSet rs=ps.executeQuery()){
                while (rs.next()){
                    City city=new City();
                    city.setId(rs.getInt(1));
                    city.setCityName(rs.getString(2));
                    city.setCityCode(rs.getString(3));
                    city.setProvince(rs.getString(4));
                    list.add(city);
                }
            }catch (Exception e){
                throw  e;
            }
        }catch (Exception e){
            throw new RuntimeException("查询异常",e);
        }
        return list;
    }

    /**
     * 查询所有行数
     * @return
     */
    public Integer selectCount(){
        int count=0;
        String sql="select count(*) from city_info";
        try(Connection con= ConUtil.getcon();
            PreparedStatement ps=con.prepareStatement(sql)){
            try(ResultSet rs=ps.executeQuery()){
               if (rs.next()){
                    count=rs.getInt(1);
               }
            }catch (Exception e){
                throw  e;
            }
        }catch (Exception e){
            throw new RuntimeException("查询异常",e);
        }
        return count;
    }
}
