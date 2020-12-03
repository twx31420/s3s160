package edu.nf.demo1;

import edu.nf.demo1.impl.AcerFactory;
import edu.nf.demo1.impl.AcerProxy;

public class Main {
    public static void main(String[] args) {
        //创建代理
        PcFactory proxy=new AcerProxy(new AcerFactory());
        proxy.sell(2500);
    }
}
