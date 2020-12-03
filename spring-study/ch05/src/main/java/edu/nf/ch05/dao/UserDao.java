package edu.nf.ch05.dao;

import edu.nf.ch05.entity.Users;

/**
 * @author 天文学
 * @date 2020/12/1 */
public interface UserDao {
    /**
     * 添加用户
     */
    void save(Users users);
}
