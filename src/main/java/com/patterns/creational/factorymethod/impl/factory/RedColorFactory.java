package com.patterns.creational.factorymethod.impl.factory;

import com.patterns.creational.factorymethod.impl.Factory;
import com.patterns.creational.factorymethod.impl.Color;
import com.patterns.creational.factorymethod.impl.product.RedColor;

/**
 * Red Color Factory will produce {@link RedColor}.
 */
public class RedColorFactory implements Factory {
    @Override
    public Color factoryMethod() {
        return new RedColor();
    }
}