package com.patterns.structural.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class FontFactory {
    private static final Map<String, Font> fonts = new HashMap<>();

    /**
     *
     * @param name
     * @param size
     * @param bold
     * @return
     */
    public Font getFont(String name, int size, boolean bold) {
        String key = name.concat(String.valueOf(size)).concat(String.valueOf(bold));
        if (!fonts.containsKey(key)) {
            fonts.put(key, new Font(name, size, bold));
        }
        return fonts.get(key);
    }
}