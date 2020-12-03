package edu.nf.hw08.entity;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 天文学
 */
@Data
public class ClassInfo {
    private Integer cid;
    private String className;
    private List<Student> students=new ArrayList<>();
}
