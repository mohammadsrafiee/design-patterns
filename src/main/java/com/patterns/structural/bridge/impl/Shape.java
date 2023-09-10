package com.patterns.structural.bridge.impl;

/**
 *
 */
public abstract class Shape {
    protected final DrawingEngine drawingEngine;

    /**
     * @param drawingEngine
     */
    public Shape(DrawingEngine drawingEngine) {
        this.drawingEngine = drawingEngine;
    }

    /**
     *
     */
    public abstract void draw();
}