package edu.nf.methodfactory.impl;

import edu.nf.item.Phone;
import edu.nf.item.impl.ApplePhone;
import edu.nf.methodfactory.AbstractFactory;

public class ApplePhoneFactory implements AbstractFactory {
    @Override
    public Phone build() {
        return new ApplePhone();
    }
}
