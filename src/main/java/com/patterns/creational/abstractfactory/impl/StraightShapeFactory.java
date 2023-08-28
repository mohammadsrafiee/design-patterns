package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.impl.families.Color;
import com.patterns.creational.abstractfactory.impl.families.Shape;
import com.patterns.creational.abstractfactory.impl.families.concrete.Blue;
import com.patterns.creational.abstractfactory.impl.families.concrete.Square;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class StraightShapeFactory implements AbstractFactory {

    public static final String KEY = "STRAIGHT_SHAPE_FACTORY";
    @Override
    public Shape createShape() {
        return new Square();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}