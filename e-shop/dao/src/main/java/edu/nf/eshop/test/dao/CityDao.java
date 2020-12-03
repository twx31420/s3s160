package edu.nf.eshop.test.dao;

import edu.nf.eshop.test.entity.City;
import edu.nf.eshop.test.entity.PageBean;
import edu.nf.eshop.test.util.ConUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CityDao {

    /**
     * 获取所有城市
     * @return
     */
    public List<City> cityList(PageBean page){
        String sql="SELECT city_id,city_name,city_code,province FROM city_info limit ?,?";
        List<City> list=new ArrayList<>();
        try(Connection con= ConUtils.getCon();
            PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setInt(1,page.getRow());
            ps.setInt(2,page.getPageSize());
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
            throw new RuntimeException("查寻异常",e);
        }
        return list;
    }

    /**
     * 查询总行数
     * @return
     */
    public int total(){
        String sql="select count(*) from  city_info";
        int count=0;
        try(Connection con= ConUtils.getCon();
            PreparedStatement ps=con.prepareStatement(sql)) {
            try(ResultSet rs=ps.executeQuery()){
                if (rs.next()){
                    count=rs.getInt(1);
                }
            }catch (Exception e){
                throw e;
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("查寻异常",e);
        }
        return count;
    }
}
