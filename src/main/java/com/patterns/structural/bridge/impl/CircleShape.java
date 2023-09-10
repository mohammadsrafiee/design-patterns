package com.patterns.structural.bridge.impl;

/**
 *
 */
public class CircleShape extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    /**
     * @param x
     * @param y
     * @param radius
     * @param drawingEngine
     */
    public CircleShape(int x, int y, int radius, DrawingEngine drawingEngine) {
        super(drawingEngine);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /**
     *
     */
    @Override
    public void draw() {
        drawingEngine.drawCircle(x, y, radius);
    }
}