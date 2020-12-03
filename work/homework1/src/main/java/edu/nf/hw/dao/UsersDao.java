package edu.nf.hw.dao;

import edu.nf.hw.entity.User;
import edu.nf.hw.util.ConUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 */
public class UsersDao {
    public List<User> getList(){
        String sql="SELECT u_id,u_name,u_password,age FROM user_info";
        List<User> list=new ArrayList<User>();
        try(Connection con= ConUtils.getCon();
            PreparedStatement ps=con.prepareStatement(sql)){
            try(ResultSet rs=ps.executeQuery()) {
                while (rs.next()){
                    User user=new User();
                    user.setId(rs.getInt(1));
                    user.setName(rs.getString(2));
                    user.setPwd(rs.getString(3));
                    user.setAge(rs.getInt(4));
                    list.add(user);
                }
            }catch (Exception e){
                throw e;
            }
        }catch (Exception e){
            throw new RuntimeException("查询失败",e);
        }
        return list;
    }
}
