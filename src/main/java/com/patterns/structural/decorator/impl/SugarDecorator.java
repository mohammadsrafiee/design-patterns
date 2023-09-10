package com.patterns.structural.decorator.impl;

/**
 * Concrete decorator representing the addition of sugar to the coffee.
 */
public class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    /**
     * Get the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }

    /**
     * Get the description of the coffee.
     *
     * @return The description of the coffee.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }
}