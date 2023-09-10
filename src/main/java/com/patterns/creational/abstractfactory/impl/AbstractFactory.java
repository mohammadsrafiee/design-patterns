package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.impl.families.Color;
import com.patterns.creational.abstractfactory.impl.families.Shape;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface AbstractFactory {
    /**
     * @return
     */
    Shape createShape();

    /**
     * @return
     */
    Color createColor();
}
