package com.patterns.creational.prototype.impl;

import com.patterns.creational.prototype.impl.products.Circle;
import com.patterns.creational.prototype.impl.products.Rectangle;
import com.patterns.creational.prototype.impl.products.ShapeType;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static final Map<ShapeType, CloneableShape> shapes = new HashMap<>();

    public ShapeCache() {
        if (shapes.size() == 0) {
            shapes.put(ShapeType.CIRCLE, new Circle(10, 20, 15));
            shapes.put(ShapeType.RECTANGLE, new Rectangle(30, 40));
        }
    }

    public CloneableShape getShape(ShapeType type) {
        return shapes.get(type).createClone();
    }

}
