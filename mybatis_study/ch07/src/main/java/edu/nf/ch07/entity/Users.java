package edu.nf.ch07.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor  //生成带参数的构造方法
//@NoArgsConstructor  //生成无参数 的构造方法
public class Users {
    private Integer uid;
    private String userName;
    private Integer age;
    private String tel;

    public Users(String userName, Integer age, String tel) {
        this.userName = userName;
        this.age = age;
        this.tel = tel;
    }
}
