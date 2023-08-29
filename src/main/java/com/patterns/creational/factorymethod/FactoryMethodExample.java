package com.patterns.creational.factorymethod;

import com.patterns.creational.factorymethod.impl.Color;
import com.patterns.creational.factorymethod.impl.factory.BlueColorFactory;
import com.patterns.creational.factorymethod.impl.factory.RedColorFactory;

import java.util.Random;

/**
 * <p>
 * <strong>Factory Method</strong> Factory method is a creational design pattern which solves the problem of
 * creating product objects without specifying their concrete classes.
 * The Factory Method defines a method, which should be used for creating objects instead of using a
 * direct constructor call (new operator). Subclasses can override this method to change the class of
 * objects that will be created.
 * The Factory Method pattern suggests that you replace direct object construction calls
 * (using the new operator) with calls to a special factory method. Don’t worry: the objects are
 * still created via the new operator, but it’s being called from within the factory method.
 * Objects returned by a factory method are often referred to as products.
 * </p>
 * <p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The Factory Method pattern is used when you want to create
 *         objects of a certain family of classes without specifying the exact class to instantiate.
 *         It provides an interface for creating objects but delegates the responsibility of instantiation
 *         to its subclasses.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: It's commonly used when you have a superclass with multiple
 *         subclasses, and each subclass needs to create its own instance of a product.
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>: It allows for adding new product types without
 *         modifying the existing creator code. However, it doesn't provide fine-grained control over
 *         the creation process or object initialization.
 *     </li>
 * </ul>
 * </p>
 * <p>
 * Here are a few real-world use cases where the Factory Method pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Logging Libraries</em></strong>:Logging libraries need to create and manage
 *         different types of loggers (file logger, console logger, database logger, etc.).
 *         The Factory Method pattern can be employed to define a logger creation interface,
 *         allowing different logging strategies to be implemented by subclasses. This helps
 *         in abstracting away the details of log creation from the rest of the application.
 *     </li>
 *     <li>
 *         <strong><em>Restaurant Ordering System</em></strong>: Food Items In a restaurant
 *         ordering system, you can use the Factory Method pattern to create different types
 *         of food items. Each food item subclass can implement the factory method to handle
 *         details such as preparation time, ingredients, and pricing, while adhering to a
 *         common food item interface.
 *     </li>
 *     <li>
 *         <strong><em>Abstract Data Source Access</em></strong>: When working with databases
 *         or external data sources, the Factory Method pattern can help in creating data access
 *         objects. Subclasses can implement the factory method to handle specific data source
 *         connections, query execution, and result handling while adhering to a common data source interface.
 *     </li>
 *     <li>
 *         <strong><em>Vehicle Manufacturing</em></strong>: In a vehicle manufacturing system,
 *         you might have different types of vehicles (cars, trucks, motorcycles) that share
 *         some common features (wheels, engine, chassis). The Factory Method pattern can be
 *         applied to create instances of these vehicles. Subclasses representing each type of
 *         vehicle can customize the creation process based on their unique characteristics.
 *     </li>
 * </ul>
 * </p>
 */
public class FactoryMethodExample {

    public static void main(String[] args) {
        Color color;

        // Consider the following line: it will generate a random situation,
        // and you should replace it with another real-world scenario. For example,
        // the background color of the window is displayed in blue if the device
        // is a cellphone; otherwise, it is shown in red for other devices like PCs or tablets.
        int i = new Random().nextInt(2);
        if (i % 2 == 0) color = new RedColorFactory().factoryMethod();
        else color = new BlueColorFactory().factoryMethod();
        color.create();
    }
}
