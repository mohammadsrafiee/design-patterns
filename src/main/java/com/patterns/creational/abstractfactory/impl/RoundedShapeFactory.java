package com.patterns.creational.abstractfactory.impl;

import com.patterns.creational.abstractfactory.impl.families.Color;
import com.patterns.creational.abstractfactory.impl.families.Shape;
import com.patterns.creational.abstractfactory.impl.families.concrete.Circle;
import com.patterns.creational.abstractfactory.impl.families.concrete.Red;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class RoundedShapeFactory implements AbstractFactory {

    public static final String KEY = "ROUNDED_SHAPE_FACTORY";

    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}