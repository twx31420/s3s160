package edu.nf.ch08.dao;

import edu.nf.ch08.entity.ClassInfo;
import edu.nf.ch08.entity.Student;

import java.util.List;

/**
 * @author 天文学
 */
public interface ClassDao {
    /**
     * 根据id查询班级信息
     * @param id
     * @return
     */
    ClassInfo getClassById(int id);
}
