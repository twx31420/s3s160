package edu.nf.ch08.entity;

import lombok.Data;

@Data
public class IdCard {
    private Integer cardId;
    private String cardNum;
    //关联学生
    private Student student;
}
