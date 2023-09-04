package com.patterns.creational.builder.impl.builders;

import com.patterns.creational.builder.impl.PizzaBuilder;
import com.patterns.creational.builder.impl.features.Crust;
import com.patterns.creational.builder.impl.features.Sauce;
import com.patterns.creational.builder.impl.features.Topping;
import com.patterns.creational.builder.impl.product.Pizza;

/**
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * In this case we build a Pepperoni Pizza for a Pizza, using the same steps as we
 * built a Pizza. This allows to produce Pizza for specific Pizza models,
 * configured with different features.
 */
public class PepperoniPizzaBuilder extends PizzaBuilder {
    private Pizza pizza;

    @Override
    public void createNewPizza() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildCrust() {
        pizza.setCrust(new Crust("thick"));
    }

    @Override
    public void buildSauce() {
        pizza.setSauce(new Sauce("spicy"));
    }

    @Override
    public void buildTopping() {
        pizza.setTopping(new Topping("pepperoni"));
    }

    public Pizza getResult() {
        return this.pizza;
    }
}