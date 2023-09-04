package com.patterns.creational.builder.impl.builders;

import com.patterns.creational.builder.impl.PizzaBuilder;
import com.patterns.creational.builder.impl.features.Crust;
import com.patterns.creational.builder.impl.features.Sauce;
import com.patterns.creational.builder.impl.features.Topping;
import com.patterns.creational.builder.impl.product.Pizza;
import com.patterns.creational.builder.impl.product.RecipePizza;

/**
 * Concrete builders implement steps defined in the common interface.
 */
public class RecipeMargheritaPizzaBuilder extends PizzaBuilder {

    private RecipePizza pizza;

    @Override
    public void createNewPizza() {
        this.pizza = new RecipePizza();
    }

    @Override
    public void buildCrust() {
        pizza.setCrust(new Crust("thin"));
    }

    @Override
    public void buildSauce() {
        pizza.setSauce(new Sauce("tomato"));
    }

    @Override
    public void buildTopping() {
        pizza.setTopping(new Topping("cheese"));
    }

    public RecipePizza getResult() {
        return this.pizza;
    }
}