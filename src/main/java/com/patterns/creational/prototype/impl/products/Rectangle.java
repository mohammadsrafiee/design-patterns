package com.patterns.creational.prototype.impl.products;

import com.patterns.creational.prototype.impl.CloneableShape;

/**
 * The Concrete Prototype class implements the cloning method. In addition to copying the
 * original object’s data to the clone, this method may also handle some edge cases of the
 * cloning process related to cloning linked objects, untangling recursive dependencies, etc.
 */
public class Rectangle implements CloneableShape {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public CloneableShape createClone() {
        return new Rectangle(width, height);
    }

    @Override
    public void draw() {
        System.out.printf("[object ID : %70s] Drawing Rectangle with width %d and height %d %n", this, width, height);
    }
}
