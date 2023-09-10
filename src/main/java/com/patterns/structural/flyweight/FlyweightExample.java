package com.patterns.structural.flyweight;

import com.patterns.structural.flyweight.impl.FontFactory;
import com.patterns.structural.flyweight.impl.TextEditor;

/**
 * <p>
 * <strong>Flyweight</strong> is a structural design pattern that allows programs to
 * support vast quantities of objects by keeping their memory consumption low.
 * The pattern achieves it by sharing parts of object state between multiple objects.
 * In other words, the Flyweight saves RAM by caching the same data used by different objects.
 * </p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The primary intent of the Flyweight design pattern is to reduce
 *         the memory usage or computational costs associated with creating a large number of similar objects
 *         by sharing as much as possible among them. It achieves this by separating the intrinsic (shared) and
 *         extrinsic (unique) states of objects. The intrinsic state is stored in a shared manner, while the
 *         extrinsic state is passed as a parameter when needed.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>:
 *         <ul>
 *             <li><strong><em>Large Number of Objects:</em></strong> The Flyweight pattern is most
 *             beneficial when you have a large number of objects
 *             that share common characteristics or properties, but they also have some unique properties
 *             (extrinsic state).</li>
 *             <li><strong><em>Memory Optimization:</em></strong>It is used to optimize memory usage by sharing the common,
 *             intrinsic state of objects, thereby reducing the memory footprint of your application.</li>
 *             <li><strong><em>Performance Improvement: </em></strong> The pattern can also improve performance by reducing
 *             the time and computational resources needed to create and manage objects, especially in
 *             scenarios where object creation is expensive.</li>
 *             <li><strong><em>Externalization of State:</em></strong> The Flyweight pattern often involves externalizing the
 *             extrinsic state of objects, which can be useful when you want to control and manage this state separately.</li>
 *             <li><strong><em>Factory and Caching:</em></strong> Typically, a FlyweightFactory is used to create and manage
 *             Flyweight objects. This factory is responsible for reusing existing Flyweights when
 *             requested and creating new ones when necessary.</li>
 *         </ul>
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>:
 *         <ul>
 *             <li><strong><em>Separation of Intrinsic and Extrinsic State:</em></strong> The Flyweight pattern encourages the separation
 *             of an object's intrinsic state (shared among multiple objects) from its extrinsic state
 *             (unique to each object). This separation allows for flexibility in managing and manipulating the objects.</li>
 *             <li><strong><em>Variability:</em></strong> While the intrinsic state is shared among objects, the Flyweight pattern
 *             allows for variability in the extrinsic state. This means that you can create different instances
 *             of objects with different extrinsic states, even though their intrinsic states are shared.</li>
 *             <li><strong><em>Dynamic State:</em></strong> The Flyweight pattern can be adapted to handle dynamic state changes by
 *             externalizing and managing the extrinsic state separately. This enables flexibility in modifying
 *             an object's extrinsic state without affecting its intrinsic state or other objects.</li>
 *         </ul>
 *     </li>
 * </ul>
 * Here are a few real-world use cases where the Flyweight pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Text Editors or Word Processors</em></strong>:
 *          As previously mentioned, text editors and word processors can use the
 *          Flyweight pattern to manage fonts and characters efficiently.
 *          Different characters can share the same font attributes to save memory.
 *     </li>
 *     <li>
 *         <strong><em>Graphic Rendering</em></strong>:
 *          In graphics and multimedia applications, the Flyweight pattern can be used
 *          to manage graphical elements like sprites, textures, and fonts. Objects that share common properties
 *          (such as color, texture, or size) can be represented as flyweights, reducing memory consumption.
 *     </li>
 *     <li>
 *         <strong><em>Game Development</em></strong>:
 *          In video games, the Flyweight pattern is often used for managing game
 *          objects that share similar attributes, like bullets, enemies, or power-ups.
 *          This helps optimize memory usage and performance.
 *     </li>
 *     <li>
 *         <strong><em>Database Connection Pools</em></strong>:
 *          When dealing with database connections, creating a new connection for every
 *          request can be resource-intensive. The Flyweight pattern can be used to manage
 *          a pool of reusable database connection objects, optimizing resource usage.
 *     </li>
 *     <li>
 *         <strong><em> Web Servers</em></strong>:
 *         Web servers handling multiple client requests can use the Flyweight pattern to
 *         represent shared resources like cached data, session objects, or configuration settings.
 *     </li>
 *     <li>
 *         <strong><em>Financial Applications</em></strong>:
 *         In financial applications dealing with a large number of financial instruments
 *         (stocks, bonds, etc.), the Flyweight pattern can be used to represent shared
 *         data like market prices, which can be accessed by different instances.
 *     </li>
 *     <li>
 *         <strong><em>Document Management Systems</em></strong>:
 *         Applications dealing with large documents, such as PDF generators, can use the
 *         Flyweight pattern to manage reusable elements like fonts, images, and formatting
 *         information.
 *     </li>
 *     <li>
 *         <strong><em>Network Protocol Implementations</em></strong>:
 *         Network protocols often involve headers with fixed structures that are used in
 *         various packets. The Flyweight pattern can be applied to reuse these header
 *         structures efficiently.
 *     </li>
 *     <li>
 *         <strong><em>GUI Widgets in UI Frameworks</em></strong>:
 *         Graphical user interface frameworks can use the Flyweight pattern to optimize
 *         memory usage for UI elements such as buttons, labels, and checkboxes that share
 *         similar visual properties.
 *     </li>
 *     <li>
 *         <strong><em>Spelling and Grammar Checkers</em></strong>:
 *         Applications that perform spelling and grammar checks can use the Flyweight
 *         pattern to manage dictionaries and linguistic data that is shared among
 *         different parts of the text.
 *     </li>
 * </ul>
 */
public class FlyweightExample {

    /**
     * @param args
     */
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        TextEditor textEditor = new TextEditor(fontFactory);
        textEditor.type("Hello, world!", "Arial", 12, false);
        textEditor.type("Flyweight pattern example", "Times New Roman", 16, true);
        textEditor.type("Reusable font instances", "Arial", 12, false);
    }
}