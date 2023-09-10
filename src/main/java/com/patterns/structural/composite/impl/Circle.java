package com.patterns.structural.composite.impl;

/**
 * Leaf class of {@link Graphic}
 */
public class Circle implements Graphic {
    /**
     * Method to draw the graphic.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}