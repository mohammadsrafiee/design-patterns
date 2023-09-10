package com.patterns.structural.composite.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite class
 */
public class CompositeGraphic implements Graphic {
    private final List<Graphic> graphics = new ArrayList<>();

    /**
     * Add a graphic (either leaf or composite) to the composite.
     *
     * @param graphic The graphic to add.
     */
    public void add(Graphic graphic) {
        graphics.add(graphic);
    }

    /**
     * Method to draw the graphic.
     */
    @Override
    public void draw() {
        for (Graphic graphic : graphics) {
            graphic.draw();
        }
    }
}