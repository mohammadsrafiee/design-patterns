package com.patterns.creational.prototype.impl;

import com.patterns.creational.prototype.impl.products.Circle;
import com.patterns.creational.prototype.impl.products.Rectangle;
import com.patterns.creational.prototype.impl.products.ShapeType;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static final Map<ShapeType, CloneableShape> shapeMap = new HashMap<>();

    public static CloneableShape getShape(ShapeType type) {
        return shapeMap.get(type).createClone();
    }

    public static void loadCache() {
        shapeMap.put(ShapeType.CIRCLE, new Circle(10, 20, 15));
        shapeMap.put(ShapeType.RECTANGLE, new Rectangle(30, 40));
    }
}
