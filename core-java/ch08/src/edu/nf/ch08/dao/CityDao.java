package edu.nf.ch08.dao;

import edu.nf.ch08.entity.City;
import edu.nf.ch08.entity.PageBean;
import edu.nf.ch08.util.ConnUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 */
public class CityDao {
    public List<City>listCity(PageBean page){
        String sql="select city_id,city_name,city_code,province from city_info limit ?,?";
        List<City> list=new ArrayList<>();
        try(Connection con= ConnUtils.getConnection();
            PreparedStatement ps=con.prepareStatement(sql)){
            ps.setInt(1,page.getRow());
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
            }catch (SQLException e){
                throw e;
            }

        }catch(SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询异常",e);
        }
        return list;
    }

//    public static void main(String[] args) {
//        CityDao dao=new CityDao();
//        List<City> list=dao.listCity(0,10);
//        list.forEach(city -> System.out.println(city.getCityName()));
//    }
    public Integer count(){
        int count=0;
        String sql="select count(*) from city_info ";
        try(Connection con= ConnUtils.getConnection();
            PreparedStatement ps=con.prepareStatement(sql)){
            try(ResultSet rs=ps.executeQuery()){
               if (rs.next()){
                   count=rs.getInt(1);
               }
            }catch (SQLException e){
                throw e;
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException("查询失败",e);
        }
        return count;
    }

}
