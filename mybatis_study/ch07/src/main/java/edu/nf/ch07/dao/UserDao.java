package edu.nf.ch07.dao;

import edu.nf.ch07.entity.Users;

import java.util.List;

/**
 * @author 天文学
 */
public interface UserDao {
    /**
     * 批量添加用户
     * @param users
     */
    void addBatch(List<Users> users);

    /**
     * 批量删除
     * @param ids
     */
    void delBatch(int[] ids);
}
