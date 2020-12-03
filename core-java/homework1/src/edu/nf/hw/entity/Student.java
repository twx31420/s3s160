package edu.nf.hw.entity;

/**
 * @author 天文学
 */
public class Student {
    private String name;
    private Integer age;
    private String sex;
    private String address;

    public Student() {
    }

    public Student(String name, Integer age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "学生姓名："+name+
                "\n学生年龄：" + age +
                "\n学生性别：" + sex +
                "\n家庭住址：" + address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
