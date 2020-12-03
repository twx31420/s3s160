package edu.nf.ch08.dao;

import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author 天文学
 * @date 2020/12/2
 */
public interface UserDao {
    /**
     * 查询用户列表
     * @return
     */
    List<Users> listUser();
}
