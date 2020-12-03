package edu.nf.hw08.dao;

import edu.nf.hw08.entity.Student;

import java.util.List;

/**
 * @author 天文学
 */
public interface StuDao {

    /**
     * 查询所有学生
     * @return
     */
    List<Student> getAll();

    /**
     * 批量删除
     * @param ids
     */
    void dels(int[] ids);


}
