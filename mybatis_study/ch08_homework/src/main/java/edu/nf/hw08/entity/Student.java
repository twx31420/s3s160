package edu.nf.hw08.entity;

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
    private IdCard idCard;
    private ClassInfo classInfo;
    private List<Subject> subjects=new ArrayList<>();
}
