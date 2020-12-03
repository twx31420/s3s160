package edu.nf.methodfactory.impl;

import edu.nf.item.Phone;
import edu.nf.item.impl.MiPhone;
import edu.nf.methodfactory.AbstractFactory;

public class MiPhoneFactory implements AbstractFactory {
    @Override
    public Phone build() {
        return new MiPhone();
    }
}
