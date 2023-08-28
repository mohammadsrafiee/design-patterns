package com.patterns.creational.abstractfactory;

import com.patterns.creational.abstractfactory.impl.AbstractFactory;
import com.patterns.creational.abstractfactory.impl.RoundedShapeFactory;
import com.patterns.creational.abstractfactory.impl.StraightShapeFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * <strong>Abstract Factory</strong> Abstract Factory is a creational design pattern,
 * which solves the problem of creating
 * <em><strong>entire product families</strong> without specifying their concrete classes.<em/>
 * </p>
 * <p>
 * Abstract Factory defines an interface for creating all distinct products but leaves
 * the actual product creation to concrete factory classes. Each factory type corresponds
 * to a certain product variety.
 * The client code calls the creation methods of a factory object instead of creating
 * products directly with a constructor call (new operator). Since a factory corresponds
 * to a single product variant, all its products will be compatible.
 * Client code works with factories and products only through their abstract interfaces.
 * This lets the client code work with any product variants, created by the factory object.
 * You just create a new concrete factory class and pass it to the client code.
 * </p>
 * <p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The intent of the Abstract Factory design pattern is to
 *         provide an interface for creating families of related objects, ensuring that the created objects
 *         are compatible and work together seamlessly. It promotes the concept of "product families," where
 *         each family consists of multiple related products with common characteristics.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: The Abstract Factory pattern is particularly useful in scenarios
 *         where you have multiple sets of related objects that need to be created together, ensuring that
 *         they are consistent and well-matched. It's also beneficial when you want to abstract the creation
 *         process, allowing you to switch between different families of objects easily without changing the
 *         client code that uses them.
 *     </li>
 *     <li>
 *         <strong><em>Structure</em></strong>:
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>: The Abstract Factory pattern provides flexibility by
 *         allowing you to create families of related objects in a consistent way. It also facilitates
 *         the addition of new families of products without modifying existing client code. This pattern
 *         promotes loose coupling between client code and the concrete classes, making it easier to
 *         switch between different implementations.
 *     </li>
 * </ul>
 * </p>
 * <p>
 * By using the Abstract Factory pattern, you can achieve:
 * <ul>
 *     <li>
 *         <strong><em>Separation of Concerns</em></strong>: The client code is separated from the details
 *         of object creation, promoting better organization and maintenance.
 *     </li>
 *     <li>
 *         <strong><em>Consistency</em></strong>: The pattern ensures that objects created together are
 *         compatible and work seamlessly.
 *     </li>
 *     <li>
 *         <strong><em>Easy Adaptation</em></strong>: Switching between different families of products is
 *         simplified, as long as the new families adhere to the same abstract factory and product interfaces.
 *     </li>
 *     <li>
 *         <strong><em>Scalability</em></strong>: New families of products can be added by introducing
 *         new concrete factories and products without altering existing code.
 *     </li>
 * </ul>
 * </p>
 * <p>
 * Here are a few real-world use cases where the Abstract Factory pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Document Processing</em></strong>: When working with various document formats
 *         (e.g., PDF, HTML, plaintext), an abstract factory can help create objects for reading, writing,
 *         and manipulating those formats. Different factories can be responsible for creating objects that
 *         work with specific document types.
 *     </li>
 *     <li>
 *         <strong><em>Abstract Data Sources</em></strong>: In applications that retrieve data from different
 *         sources (e.g., APIs, databases, files), the Abstract Factory pattern can be useful. Each concrete
 *         factory could implement the methods for fetching and processing data from its respective data source.
 *     </li>
 *     <li>
 *         <strong><em>Textile Industry</em></strong>: In the textile industry, the Abstract Factory pattern
 *         can be applied to produce different styles and types of clothing or fabrics. For example, a factory
 *         could create formal wear, casual wear, and sportswear collections, each with their own specific designs
 *         and materials.
 *     </li>
 *     <li>
 *         <strong><em>Game Development</em></strong>: In game development, the Abstract Factory pattern can be used to create
 *         different types of game objects based on the current level or game scenario. For instance, in a strategy
 *         game, you might have different units, buildings, and resources that are created by a factory corresponding
 *         to the current faction or civilization.
 *     </li>
 *     <li>
 *         <strong><em>Theme Customization</em></strong>: In applications that offer theme customization
 *         (such as changing the color scheme), an abstract factory can be used to create UI components with
 *         the selected theme. Each theme could have a separate concrete factory that generates the appropriate
 *         set of buttons, labels, and other UI elements with the chosen appearance.
 *     </li>
 *     <li>
 *         <strong><em>Database Access</em></strong>: When developing applications that need to work with
 *         different types of databases (e.g., MySQL, PostgreSQL, SQLite), the Abstract Factory pattern can be
 *         employed. You can create an abstract factory that defines methods for creating database connections,
 *         queries, and result sets. Concrete factories would be implemented for each specific database type,
 *         providing the necessary implementation details.
 *     </li>
 * </ul>
 * </p>
 */
public class AbstractFactoryExample {
    public static void main(String[] args) {

        Map<String, AbstractFactory> factories = new HashMap<>();
        factories.put(RoundedShapeFactory.KEY, new RoundedShapeFactory());
        factories.put(StraightShapeFactory.KEY, new StraightShapeFactory());

        factories.get(RoundedShapeFactory.KEY).createShape().draw();
        factories.get(RoundedShapeFactory.KEY).createColor().fill();

        factories.get(StraightShapeFactory.KEY).createShape().draw();
        factories.get(StraightShapeFactory.KEY).createColor().fill();
    }
}
