package com.patterns.structural.decorator.impl;

/**
 * Interface for the Coffee component.
 */
public interface Coffee {

    /**
     * Get the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    double cost();

    /**
     * Get the description of the coffee.
     *
     * @return The description of the coffee.
     */
    String getDescription();
}
