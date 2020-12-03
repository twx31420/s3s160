package edu.nf.item.impl;

import edu.nf.containerfactory.Bean;
import edu.nf.item.Phone;

/**
 * @author 天文学
 */
@Bean("applePhone")
public class ApplePhone extends Phone {
    @Override
    public void call() {
        System.out.println("使用苹果手机打电话");
    }

    @Override
    public void message() {
        System.out.println("使用苹果手机发短信");
    }
}
