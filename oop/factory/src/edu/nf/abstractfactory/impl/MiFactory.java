package edu.nf.abstractfactory.impl;

import edu.nf.abstractfactory.AbstractFactory;
import edu.nf.item.Pad;
import edu.nf.item.Phone;
import edu.nf.item.impl.MiPad;
import edu.nf.item.impl.MiPhone;

public class MiFactory implements AbstractFactory {
    @Override
    public Phone buildPhone() {
        return new MiPhone();
    }

    @Override
    public Pad buildPad() {
        return new MiPad();
    }
}
