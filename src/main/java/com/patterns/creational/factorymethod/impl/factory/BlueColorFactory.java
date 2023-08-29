package com.patterns.creational.factorymethod.impl.factory;

import com.patterns.creational.factorymethod.impl.Creator;
import com.patterns.creational.factorymethod.impl.Color;
import com.patterns.creational.factorymethod.impl.product.BlueColor;

/**
 * Blue Color Factory will produce {@link BlueColor}.
 */
public class BlueColorFactory implements Creator {
    @Override
    public Color factoryMethod() {
        return new BlueColor();
    }
}