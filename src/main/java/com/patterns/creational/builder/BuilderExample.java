package com.patterns.creational.builder;

import com.patterns.creational.builder.impl.PizzaDirector;
import com.patterns.creational.builder.impl.builders.MargheritaPizzaBuilder;
import com.patterns.creational.builder.impl.builders.PepperoniPizzaBuilder;
import com.patterns.creational.builder.impl.builders.RecipeMargheritaPizzaBuilder;
import com.patterns.creational.builder.impl.builders.RecipePepperoniPizzaBuilder;
import com.patterns.creational.builder.impl.product.Pizza;
import com.patterns.creational.builder.impl.product.RecipePizza;

/**
 * <p>
 * <strong>Builder</strong> is a creational design pattern, which allows constructing
 * complex objects step by step.
 * Unlike other creational patterns, Builder does not require products to have a common interface.
 * That makes it possible to produce different products using the same construction process.
 * The Builder pattern is a well-known pattern in Java world. It’s especially useful when you
 * need to create an object with lots of possible configuration options.
 * </p>
 * <p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The Builder pattern is used when you want to create
 *         complex objects step by step. It separates the construction of a complex object from its
 *         representation, allowing the same construction process to create different representations.
 *         to its subclasses.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: It's useful when you need to create objects with
 *         many optional parameters or configurations, and you want to ensure that the process
 *         is easy to understand and maintain.
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>:  It provides more fine-grained control over
 *         the object construction process. Builders can be used to create objects with specific
 *         configurations, and they can enforce the order of construction steps.
 *     </li>
 * </ul>
 * </p>
 * <p>
 * Here are a few real-world use cases where the Builder pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Database Query Builders</em></em></strong>: When constructing database queries,
 *         especially for SQL databases, you often have a variety of optional clauses like SELECT fields,
 *         WHERE conditions, JOINs, and ORDER BY. A query builder can help construct these queries step by
 *         step without having to deal with complex SQL strings directly.
 *     </li>
 *     <li>
 *         <strong><em>Configuration Builders</em></em></strong>:In applications that require complex
 *         configurations with numerous options, such as setting up a server, configuring a game character,
 *         or creating a custom user interface, a builder can be used to construct and modify these
 *         configurations in a more readable and maintainable way.
 *     </li>
 *     <li>
 *         <strong><em>Document Generation</em></em></strong>:When generating complex documents like HTML,
 *         XML, or JSON, a builder can help create the structure and content of the document piece by piece.
 *         For instance, in generating HTML pages, you can have builders for headers, paragraphs, tables,
 *         and other HTML elements.
 *     </li>
 *     <li>
 *         <strong><em>Immutable Objects</em></em></strong>: In languages that encourage immutability,
 *         such as Java, you can use a builder to create immutable objects with a large number of properties.
 *         The builder allows you to set each property individually and then build an immutable instance when all
 *         properties are set.
 *     </li>
 *     <li>
 *         <strong><em>Mailing Systems</em></em></strong>:When sending emails or messages, you may have
 *         various optional components like attachments, headers, and recipients. A message builder can be
 *         used to construct these messages by adding or removing components as needed.
 *     </li>
 * </ul>
 * </p>
 */
public class BuilderExample {

    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        {
            MargheritaPizzaBuilder builder = new MargheritaPizzaBuilder();
            director.constructPizza(builder);
            Pizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            director.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            PepperoniPizzaBuilder builder = new PepperoniPizzaBuilder();
            director.constructPizza(builder);
            Pizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            director.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            RecipeMargheritaPizzaBuilder builder = new RecipeMargheritaPizzaBuilder();
            director.constructPizza(builder);
            RecipePizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            director.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            RecipePepperoniPizzaBuilder builder = new RecipePepperoniPizzaBuilder();
            director.constructPizza(builder);
            RecipePizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            director.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

    }
}
