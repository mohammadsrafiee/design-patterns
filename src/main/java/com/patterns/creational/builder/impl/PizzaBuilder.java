package com.patterns.creational.builder.impl;


/**
 * Builder interface defines all possible ways to configure a product.
 */
public abstract class PizzaBuilder {
    public abstract void createNewPizza();

    public abstract void buildCrust();

    public abstract void buildSauce();

    public abstract void buildTopping();

}
