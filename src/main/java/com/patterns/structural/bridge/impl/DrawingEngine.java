package com.patterns.structural.bridge.impl;

public interface DrawingEngine {

    /**
     *
     * @param x
     * @param y
     * @param radius
     */
    void drawCircle(int x, int y, int radius);

    /**
     *
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    void drawRectangle(int x1, int y1, int x2, int y2);
}
