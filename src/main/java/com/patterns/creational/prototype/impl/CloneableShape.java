package com.patterns.creational.prototype.impl;

/**
 * The Prototype interface declares the cloning methods. In most cases, it’s a single clone method.
 */
public interface CloneableShape {

    /**
     * @return
     */
    CloneableShape createClone();

    /**
     *
     */
    void draw();
}
