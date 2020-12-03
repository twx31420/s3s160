package edu.nf.ch06;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 天文学
 * @date 2020/12/2
 */
public class Users {
    private String userName;
    private Integer age;
    private List<String> address;
    private Map<String,String> card;
    private Properties prop;

    public Users() {
    }

    public Users(String userName, Integer age, List<String> address, Map<String, String> card, Properties prop) {
        this.userName = userName;
        this.age = age;
        this.address = address;
        this.card = card;
        this.prop = prop;
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

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
}
