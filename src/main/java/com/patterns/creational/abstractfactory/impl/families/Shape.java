package com.patterns.creational.abstractfactory.impl.families;

/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Color/Shape). All products of
 * the same family have the common interface.
 * This is the common interface for shape family.
 */
public interface Shape {

    /**
     *
     */
    void draw();
}
