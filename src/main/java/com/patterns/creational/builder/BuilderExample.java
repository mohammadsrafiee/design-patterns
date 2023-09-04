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
 * <strong>Builder</strong> Builder is a creational design pattern, which allows constructing
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
 *         <strong><em</em></strong>:
 *     </li>
 * </ul>
 * </p>
 */
public class BuilderExample {

    public static void main(String[] args) {

        {
            MargheritaPizzaBuilder builder = new MargheritaPizzaBuilder();
            PizzaDirector.constructPizza(builder);
            Pizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            PizzaDirector.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            PepperoniPizzaBuilder builder = new PepperoniPizzaBuilder();
            PizzaDirector.constructPizza(builder);
            Pizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            PizzaDirector.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            RecipeMargheritaPizzaBuilder builder = new RecipeMargheritaPizzaBuilder();
            PizzaDirector.constructPizza(builder);
            RecipePizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            PizzaDirector.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

        {
            RecipePepperoniPizzaBuilder builder = new RecipePepperoniPizzaBuilder();
            PizzaDirector.constructPizza(builder);
            RecipePizza pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
            PizzaDirector.constructHalfReadyPizza(builder);
            pizza = builder.getResult();
            System.out.printf("Pizza: %s %n", pizza);
        }

    }
}
