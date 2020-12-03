package edu.nf.ch08.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 */
@Data
public class Student {
    private Integer stuId;
    private String stuName;
    private Integer stuAge;
    //关联班级（多对一关联）
    private ClassInfo classInfo;
    //关联身份证(一对一)
    private IdCard idCard;
    //关联课程(多对多)
    private List<Subject> subjects=new ArrayList<>();

}
