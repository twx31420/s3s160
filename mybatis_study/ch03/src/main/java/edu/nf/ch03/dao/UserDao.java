package edu.nf.ch03.dao;


import edu.nf.ch03.entity.Users;

import java.util.List;
import java.util.Map;

/**
 * @author 天文学
 */
public interface UserDao {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    Users getUserByid(int id) ;

    /**
     * 根据id查询用户信息
     * @param uid
     * @return
     */
    Map<String,Object> getUserById2(int uid);

    /**
     * 查询所有用户
     * @return
     */
    List<Users> listUser();

    /**
     * 查询所有用户，返回List<Map<String,Object>>
     * @return
     */
    List<Map<String,Object>> listUser2();


    int count();
}
