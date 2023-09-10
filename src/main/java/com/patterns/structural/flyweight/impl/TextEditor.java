package com.patterns.structural.flyweight.impl;

public class TextEditor {
    private final FontFactory fontFactory;

    public TextEditor(FontFactory fontFactory) {
        this.fontFactory = fontFactory;
    }

    public void type(String text, String fontName, int fontSize, boolean bold) {
        this.fontFactory
                .getFont(fontName, fontSize, bold)
                .render(text);
    }
}
