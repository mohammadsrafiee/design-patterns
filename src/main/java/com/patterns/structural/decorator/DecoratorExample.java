package com.patterns.structural.decorator;

import com.patterns.structural.decorator.impl.Coffee;
import com.patterns.structural.decorator.impl.MilkDecorator;
import com.patterns.structural.decorator.impl.SimpleCoffee;
import com.patterns.structural.decorator.impl.SugarDecorator;

/**
 * <p>
 * <strong>Decorator </strong>  is a structural design pattern that lets you attach new behaviors
 * to objects by placing these objects inside special wrapper objects that contain the behaviors.
 * </p>
 * <ul>
 *     <li><strong><em>Intent:</em></strong>The Decorator Pattern is a structural design pattern that allows you to add
 *     behavior or responsibilities to individual objects, either statically or dynamically,
 *     without altering their code. It is used to extend the functionality of classes in a
 *     flexible and reusable way.</li>
 *     <li><strong><em>Usage:</em></strong>The Decorator Pattern is typically used when you need to:
 *     <ul>
 *         <li>Add responsibilities to objects without modifying their source code.</li>
 *         <li>Extend the behavior of a class with multiple optional features.</li>
 *         <li>Combine and compose objects to create complex and customizable behaviors.</li>
 *         <li>Maintain an open-closed principle, allowing for easy extension without modifying existing code.</li>
 *     </ul>
 *     </li>
 *     <li><strong><em>Flexibility:</em></strong>The Decorator Pattern provides flexibility by allowing you to create
 *     a variety of decorator classes that can be stacked or combined in various ways to modify
 *     an object's behavior. This enables you to tailor the behavior of objects at runtime without
 *     affecting other objects of the same class.</li>
 * </ul>
 * Here are a few real-world use cases where the Decorator pattern can be applied effectively:
 * <ul>
 *     <li><strong><em>GUI Components:</em></strong> Decorating GUI components like buttons, panels,
 *     or windows with various borders, colors, or additional functionalities.</li>
 *     <li><strong><em>I/O Streams:</em></strong> Adding functionality to I/O streams for encryption,
 *     compression, or logging without altering the core stream classes.</li>
 *     <li><strong><em>Text Formatting:</em></strong> Enhancing text processing with decorators
 *     like bold, italic, or underline styles.</li>
 *     <li><strong><em>Authentication and Authorization:</em></strong> Adding security-related
 *     decorators to control access to methods or resources.</li>
 *     <li><strong><em>Logging:</em></strong> Adding logging decorators to monitor method calls
 *     or record data changes.</li>
 *     <li><strong><em>Caching:</em></strong> Implementing caching decorators to optimize data
 *     retrieval.</li>
 *     <li><strong><em>Validation:</em></strong> Applying validation decorators to check input
 *     data before processing.</li>
 *     <li><strong><em>Database Connections:</em></strong> Adding decorators for connection pooling or profiling.</li>
 *     <li><strong><em>Game Characters:</em></strong> Decorating characters in a game with
 *     weapons, armor, and special abilities.</li>
 *     <li><strong><em>Order Processing:</em></strong> Modifying order processing with decorators
 *     discounts, shipping options, or gift wrapping.</li>
 * </ul>
 */
public class DecoratorExample {

    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.cost());
        System.out.println("Description: " + coffee.getDescription());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + milkCoffee.cost());
        System.out.println("Description: " + milkCoffee.getDescription());

        Coffee sugarMilkCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost: $" + sugarMilkCoffee.cost());
        System.out.println("Description: " + sugarMilkCoffee.getDescription());
    }
}
