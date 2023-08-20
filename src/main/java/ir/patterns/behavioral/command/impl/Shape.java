package ir.patterns.behavioral.command.impl;

import java.util.Formatter;

/**
 * Shape is a receiver class which stores multiple properties defining the shape
 * presented in UI: color, height and width.
 */
public class Shape {
    private Color color;
    private int height;
    private int width;

    public Shape() {

    }

    public Shape(Color color, int height, int width) {
        this.setColor(color);
        this.setHeight(height);
        this.setWidth(width);
    }

    public enum Color {
        RED, BLACK, GREEN, BLUE,
        ;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return new Formatter().format("Color : %10s, Height : %5s, Width : %5s", color != null ? color.name() : " ", height, width)
                .toString();
    }

}
