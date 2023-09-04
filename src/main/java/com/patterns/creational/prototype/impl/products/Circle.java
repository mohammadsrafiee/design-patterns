package com.patterns.creational.prototype.impl.products;

import com.patterns.creational.prototype.impl.CloneableShape;

/**
 * The Concrete Prototype class implements the cloning method. In addition to copying the
 * original object’s data to the clone, this method may also handle some edge cases of the
 * cloning process related to cloning linked objects, untangling recursive dependencies, etc.
 */
public class Circle implements CloneableShape {
    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public CloneableShape createClone() {
        return new Circle(x, y, radius);
    }

    @Override
    public void draw() {
        System.out.printf("[object ID : %70s] Drawing Circle at ( %d, %d) with radius %d %n", this, x, y, radius);
    }
}