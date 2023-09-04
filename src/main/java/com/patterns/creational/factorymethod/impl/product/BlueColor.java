package com.patterns.creational.factorymethod.impl.product;

import com.patterns.creational.factorymethod.impl.Color;

/**
 * Blue Color implementation.
 */
public class BlueColor implements Color {
    @Override
    public void create() {
        System.out.println("Creating Concrete Product B");
    }
}
