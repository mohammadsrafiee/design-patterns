package com.patterns.structural.bridge.impl;

/**
 *
 */
public class VectorDrawingEngine implements DrawingEngine {

    /**
     * @param x
     * @param y
     * @param radius
     */
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.printf("Drawing a circle in vector format at (%d, %d) with radius %d \n", x, y, radius);
    }

    /**
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        System.out.printf("Drawing a rectangle in vector format from (%d, %d) to (%d, %d) \n", x1, y1, x2, y2);
    }
}
