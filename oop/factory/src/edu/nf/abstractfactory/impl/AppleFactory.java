package edu.nf.abstractfactory.impl;

import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.abstractfactory.AbstractFactory;
import edu.nf.item.impl.ApplePad;
import edu.nf.item.impl.ApplePhone;
import edu.nf.item.impl.MiPad;
import edu.nf.item.impl.MiPhone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone buildPhone() {
        return new ApplePhone();
    }

    @Override
    public Pad buildPad() {
        return new ApplePad();
    }
}
