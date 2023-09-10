package com.patterns.structural.flyweight.impl;

/**
 *
 */
public class Font {
    private final String name;
    private final int size;
    private final boolean bold;

    /**
     *
     * @param name
     * @param size
     * @param bold
     */
    public Font(String name, int size, boolean bold) {
        this.name = name;
        this.size = size;
        this.bold = bold;
    }

    /**
     *
     * @param text
     */
    public void render(String text) {
        System.out.printf("Rendering text '[%27s]' in font: [%16s], size: [%5s], bold: [%7s]%n", text, name, size, bold);
    }
}
