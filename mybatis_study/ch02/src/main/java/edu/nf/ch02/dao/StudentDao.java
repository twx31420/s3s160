package edu.nf.ch02.dao;

import edu.nf.ch02.entity.Student;

public interface StudentDao {
    /**
     * 添加学生
     * @param student
     */
    void save(Student student);

    void save2(Student student);
}
