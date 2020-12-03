package edu.nf.hw08.dao;

import edu.nf.hw08.entity.Student;
import edu.nf.hw08.entity.Subject;

import java.util.List;

public interface SubDao {
    /**
     * 根据id查询
     * @param uid
     * @return
     */
    Student getStudentById(int uid);

    List<Subject> getStudentById2(int uid);

}
