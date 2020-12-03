package edu.nf.demo1.impl;

import edu.nf.demo1.PcFactory;

/**
 * @author 天文学
 * target(目标对象，也就是被代理的对象)
 */
public class AcerFactory implements PcFactory {
    @Override
    public void sell(int money) {
        System.out.println("Acer厂商直销价格："+money);
    }
}
