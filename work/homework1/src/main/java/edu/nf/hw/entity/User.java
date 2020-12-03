package edu.nf.hw.entity;

/**
 * @author 天文学
 */
public class User {
    private Integer id;
    private String name;
    private String pwd;
    private Integer age;

    public User() {
    }

    public User(Integer id, String name, String pwd, Integer age) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
