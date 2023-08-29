package com.patterns.creational.factorymethod.impl.factory;

import com.patterns.creational.factorymethod.impl.Creator;
import com.patterns.creational.factorymethod.impl.Color;
import com.patterns.creational.factorymethod.impl.product.BlueColor;
import com.patterns.creational.factorymethod.impl.product.RedColor;

/**
 * Red Color Factory will produce {@link RedColor}.
 */
public class RedColorFactory implements Creator {
    @Override
    public Color factoryMethod() {
        return new RedColor();
    }
}