package com.patterns.structural.decorator.impl;

/**
 * Abstract CoffeeDecorator class, which is also a Coffee component.
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    /**
     * Constructor for CoffeeDecorator.
     *
     * @param coffee The coffee to be decorated.
     */
    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    /**
     * Get the cost of the coffee.
     *
     * @return The cost of the coffee.
     */
    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    /**
     * Get the description of the coffee.
     *
     * @return The description of the coffee.
     */
    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}
