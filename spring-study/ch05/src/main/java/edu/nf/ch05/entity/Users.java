package edu.nf.ch05.entity;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author 天文学
 * @date 2020/12/1
 */
public class Users {
    private Integer id;
    private String name;

    public Users() {
    }

    public Users(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
