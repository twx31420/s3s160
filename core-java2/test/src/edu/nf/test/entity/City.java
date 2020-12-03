package edu.nf.test.entity;

/**
 * @author 天文学
 */
public class City {
    private Integer id;
    private String cityName;
    private String cityCode;
    private String province;

    public City() {
    }

    public City(Integer id, String cityName, String cityCode, String province) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.province = province;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
