package edu.nf.hw06.dao;

import edu.nf.hw06.entity.Users;

import java.util.List;

public interface UserDao {

    /**
     * 多条件查询
     * @param users
     * @return
     */
    List<Users> listuser(Users users);
}
