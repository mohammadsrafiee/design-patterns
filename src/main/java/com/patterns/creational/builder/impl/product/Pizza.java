package com.patterns.creational.builder.impl.product;

import com.patterns.creational.builder.impl.Type;
import com.patterns.creational.builder.impl.features.Crust;
import com.patterns.creational.builder.impl.features.Sauce;
import com.patterns.creational.builder.impl.features.Topping;

/**
 * Pizza is a product class.
 */
public class Pizza {
    private Type type;
    private Crust crust;
    private Sauce sauce;
    private Topping topping;

    public Pizza() {

    }

    public Pizza(Type type, Crust crust, Sauce sauce, Topping topping) {
        this.type = type;
        this.crust = crust;
        this.sauce = sauce;
        this.topping = topping;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setType(Type type) {
        this.type = type;
    }

}
