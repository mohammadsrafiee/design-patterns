package com.patterns.creational.builder.impl;

/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore, it may not know what product is
 * being built.
 */
public class PizzaDirector {
    public PizzaDirector() {

    }

    public void constructPizza(PizzaBuilder builder) {
        builder.createNewPizza();
        builder.buildCrust();
        builder.buildSauce();
        builder.buildTopping();
    }

    public void constructHalfReadyPizza(PizzaBuilder builder) {
        builder.createNewPizza();
        builder.buildCrust();
        builder.buildSauce();
    }

}
