package com.patterns.structural.decorator.impl;

/**
 * Concrete Coffee component representing a simple coffee.
 */
public class SimpleCoffee implements Coffee {

    /**
     * Get the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    @Override
    public double cost() {
        return 2.0;
    }

    /**
     * Get the description of the coffee.
     *
     * @return The description of the coffee.
     */
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}