package com.patterns.structural.decorator.impl;

/**
 * Concrete decorator representing the addition of milk to the coffee.
 */
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    /**
     * Get the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    @Override
    public double cost() {
        return super.cost() + 1.0;
    }

    /**
     * Get the description of the coffee.
     *
     * @return The description of the coffee.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}
