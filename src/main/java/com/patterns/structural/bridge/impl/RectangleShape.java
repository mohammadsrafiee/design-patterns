package com.patterns.structural.bridge.impl;

/**
 *
 */
public class RectangleShape extends Shape {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    /**
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param drawingEngine
     */
    public RectangleShape(int x1, int y1, int x2, int y2, DrawingEngine drawingEngine) {
        super(drawingEngine);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     *
     */
    @Override
    public void draw() {
        drawingEngine.drawRectangle(x1, y1, x2, y2);
    }
}