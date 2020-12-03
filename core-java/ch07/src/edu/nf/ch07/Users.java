package edu.nf.ch07;

import java.util.Objects;

/**
 * @author 天文学
 * 重写equals方法的目的是为了重新比较对象的内容是否相等
 * 但同时也重写hashcode方法（hashcode是一种使用hash算法键内存地址换算为一个in类型值），
 * 当比较两个对象是否相等时，先调用hashcode返回的数值来比较如果hashcode
 * 不相同则认为为两个对象不相同的，如果hashcode相同，则调用equals方法来比较
 * 内容是否相等，如果equals返回true着表示相等，false则不等
 */
public class Users {
    private String userName;
    private Integer age;

    public Users() {
    }

    public Users(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


   /* @Override
    public boolean equals(Object obj) {
        //先判断obj是否是当前类的实例
        if (obj instanceof Users){
            Users u=(Users)obj;
            //如果当前对象的userName和age和传入进来的Users的username和age 相同
            //则认为是一样的对象
            if (this.userName.equals(u.getUserName())&&this.age.equals(u.getAge())){
                return true;
            }
            return false;
        }
        return false;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o){ return true;}
        if (!(o instanceof Users)){ return false;}
        Users users = (Users) o;
        return Objects.equals(userName, users.userName) &&
                Objects.equals(age, users.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age);
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
}
