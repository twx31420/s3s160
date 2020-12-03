package edu.nf.eshop.test.entity;

public class City {
    private Integer id;
    private String name;
    private String code;
    private String province;

    public City() {
    }

    public City(Integer id, String name, String code, String province) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.province = province;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
