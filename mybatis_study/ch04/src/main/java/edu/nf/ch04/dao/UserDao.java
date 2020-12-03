package edu.nf.ch04.dao;

import edu.nf.ch04.entity.Users;

import java.util.List;

public interface UserDao {
    /**
     * 根据id查询用户信息
     * @param uid
     * @return
     */
    Users getUserById(int uid);

    /**
     * 查询用户列表
     * @return
     */
    List<Users> listUser();

    /**
     * 统计总人数
     * @return
     */
    int count();

    /**
     * 模糊查询
     * @param likeName
     * @return
     */
    List<Users> like(String likeName);
}
