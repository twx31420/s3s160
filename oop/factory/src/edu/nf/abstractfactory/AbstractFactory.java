package edu.nf.abstractfactory;

import edu.nf.item.Pad;
import edu.nf.item.Phone;

public interface AbstractFactory {
    Phone buildPhone();
    Pad buildPad();
}
