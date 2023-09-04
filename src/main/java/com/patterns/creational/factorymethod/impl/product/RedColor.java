package com.patterns.creational.factorymethod.impl.product;

import com.patterns.creational.factorymethod.impl.Color;

/**
 * Red Color implementation.
 */
public class RedColor implements Color {
    @Override
    public void create() {
        System.out.println("Creating Concrete Product A");
    }
}