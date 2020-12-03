package edu.nf.ch05.dao;

import edu.nf.ch05.entity.Users;

import java.util.List;

public interface UserDao {
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
