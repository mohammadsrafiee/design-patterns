package com.patterns.creational.prototype;

import com.patterns.creational.prototype.impl.ShapeCache;
import com.patterns.creational.prototype.impl.products.ShapeType;

/**
 * <p>
 * <strong>Prototype</strong> Prototype is a creational design pattern that lets you copy
 * existing objects without making your code dependent on their classes.
 * The Prototype design pattern is a creational design pattern that deals with object
 * creation by cloning existing objects, known as prototypes, rather than creating new
 * instances from scratch. This pattern allows you to create new objects by copying an
 * existing one, typically with the help of a prototype manager or a cloning method.
 * It is often used when the cost of creating an object is more expensive or complex
 * than copying an existing one.
 * </p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The primary intent of the Prototype design
 *         pattern is to create new objects by copying existing ones, ensuring that the new
 *         object is an independent copy of the original, and any modifications to the new
 *         object do not affect the original or vice versa. This pattern promotes flexibility
 *         and reduces the overhead of creating objects through complex initialization processes.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: 1) When creating new objects is more expensive than copying existing ones.
 *         2) To avoid complex and error-prone object initialization processes. 3) When you want to isolate
 *         changes in the created objects from the original ones. 4) In scenarios where a system needs to be
 *         independent of how its objects are created, composed, and represented.
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>: The Prototype design pattern offers several benefits:
 *         1) It allows for the creation of new objects with minimal overhead.
 *         2) It promotes code reusability by using existing objects as templates.
 *         3) It separates the client code from the concrete classes being cloned, making the system more maintainable.
 *         4) It provides a way to create complex objects without specifying their exact classes.
 *     </li>
 * </ul>
 * <p>
 * Here are a few real-world use cases where the Prototype pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Document Copying</em></strong>: In a document processing application, you can
 *         use the Prototype pattern to clone existing document templates (e.g., invoices, reports) to
 *         create new documents with similar structures.
 *     </li>
 *     <li>
 *         <strong><em>Game Object Creation</em></strong>: Video games often involve creating numerous
 *         objects with similar attributes (e.g., game characters, weapons). The Prototype pattern can be
 *         used to clone and customize game objects.
 *     </li>
 *     <li>
 *         <strong><em>Caching</em></strong>:  In caching systems, you can clone cached objects to provide
 *         copies to multiple clients without fetching the data from the source repeatedly.
 *     </li>
 *     <li>
 *         <strong><em>UI Component Libraries</em></strong>: Building user interfaces often involves creating
 *         similar UI components (e.g., buttons, forms). The Prototype pattern can be used to clone
 *         standard UI components for reuse.
 *     </li>
 *     <li>
 *         <strong><em>Database Connection Pooling</em></strong>: In database connection pooling frameworks,
 *         you can use the Prototype pattern to clone database connections to improve performance and reduce overhead.
 *     </li>
 * </ul>
 * </p>
 */
public class PrototypeExample {

    public static void main(String[] args) {
        ShapeCache cache = new ShapeCache(); // we use singleton cache Object or use Utility class for this caching
        cache.getShape(ShapeType.CIRCLE).draw();
        cache.getShape(ShapeType.CIRCLE).draw();
        cache.getShape(ShapeType.CIRCLE).draw();
        cache.getShape(ShapeType.RECTANGLE).draw();
        cache.getShape(ShapeType.RECTANGLE).draw();
    }
}
