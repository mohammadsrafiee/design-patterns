package com.patterns.structural.composite;

import com.patterns.structural.composite.impl.Circle;
import com.patterns.structural.composite.impl.CompositeGraphic;
import com.patterns.structural.composite.impl.Graphic;

/**
 * <p>
 * <strong>Composite</strong> is a structural design pattern that lets you compose objects into tree
 * structures and then work with these structures as if they were individual objects.
 * </p>
 * <ul>
 *     <li><strong><em>Intent:</em></strong>The Composite Pattern is a structural design pattern that allows you to
 *     compose objects into tree-like structures to represent part-whole hierarchies.
 *     It lets clients treat individual objects and compositions of objects uniformly.</li>
 *     <li><strong><em>Usage:</em></strong>
 *     <ul>
 *         <li>When you want to represent hierarchical structures of objects where
 *         clients can treat individual objects and compositions of objects uniformly.</li>
 *         <li>When you need to create a structure that supports both leaf
 *         (individual) and composite (grouped) objects.</li>
 *         <li>When you want to simplify the client code by avoiding the need
 *         to distinguish between individual objects and composites.</li>
 *     </ul>
 *     </li>
 *     <li><strong><em>Flexibility:</em></strong>The Composite Pattern provides flexibility in building
 *     complex hierarchies of objects while keeping the code simple. It allows you
 *     to add new types of components (leaf or composite) without changing the
 *     existing code, promoting code usability and maintainability.</li>
 * </ul>
 * Here are a few real-world use cases where the Composite pattern can be applied effectively:
 * <ul>
 *     <li><strong><em>Graphics Composition:</em></strong> The Composite Pattern is commonly used in graphics
 *     systems where you can compose complex graphics from simple shapes (e.g., circles, rectangles)
 *     and groups of shapes.</li>
 *     <li><strong><em>File System Structure:</em></strong> In file systems, directories can contain both
 *     files (leaf nodes) and subdirectories (composite nodes), making it suitable for representing the
 *     file system structure.</li>
 *     <li><strong><em>GUI Components:</em></strong> GUI frameworks often use the Composite Pattern to
 *     create complex user interface elements by combining simple controls and containers.</li>
 *     <li><strong><em>Organization Hierarchy:</em></strong> The pattern can represent organizational
 *     hierarchies, with individual employees (leaf nodes) and departments (composite nodes).</li>
 *     <li><strong><em>Document Structure:</em></strong> In document processing applications, you can
 *     use the Composite Pattern to represent structured documents with paragraphs, sections, and chapters.</li>
 *     <li><strong><em>Menu Systems:</em></strong> In menu systems, items in a menu can be leaf nodes
 *     (individual menu items) or composite nodes (submenus).</li>
 *     <li><strong><em>Mathematical Expressions:</em></strong> When building a mathematical expression
 *     evaluator, you can use the Composite Pattern to represent complex expressions composed of simpler subexpressions.</li>
 * </ul>
 */
public class CompositeExample {

    public static void main(String[] args) {
        // Create leaf objects
        Graphic circle1 = new Circle();
        Graphic circle2 = new Circle();

        // Create a composite object
        CompositeGraphic composite = new CompositeGraphic();
        composite.add(circle1);
        composite.add(circle2);

        // Call draw() on both individual objects and the composite
        circle1.draw();
        circle2.draw();
        composite.draw();
    }
}
