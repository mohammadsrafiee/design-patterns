package com.patterns.behavioural.strategy;

import com.patterns.behavioural.strategy.impl.*;
import ir.patterns.behavioural.strategy.impl.*;

/**
 * Strategy is a behavioral design pattern that turns a set of behaviors into objects and
 * makes them interchangeable inside original context object.
 * The original object, called context, holds a reference to a strategy object. The context
 * delegates executing the behavior to the linked strategy object. In order to change the way
 * the context performs its work, other objects may replace the currently linked strategy
 * object with another one.
 */
public class StrategyExample {

    public static void main(String[] args) {

        Order order = new Order();
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());
        order.addOrder(new OrderItem());

        double orderPrice = order.getPrice();
        System.out.println(orderPrice + (new ParcelTerminalShippingStrategy()).calculate(order));
        System.out.println(orderPrice + (new InStorePickupStrategy()).calculate(order));
        System.out.println(orderPrice + (new PriorityShippingStrategy()).calculate(order));

    }
}
