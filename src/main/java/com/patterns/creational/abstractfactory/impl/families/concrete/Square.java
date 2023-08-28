package com.patterns.creational.abstractfactory.impl.families.concrete;

import com.patterns.creational.abstractfactory.impl.families.Shape;

/**
 * All products families have the same varieties (RoundedShape/StraightShape).
 * This is a variant of a Shape.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}