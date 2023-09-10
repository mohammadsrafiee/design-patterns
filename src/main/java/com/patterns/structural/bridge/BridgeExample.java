package com.patterns.structural.bridge;


import com.patterns.structural.bridge.impl.CircleShape;
import com.patterns.structural.bridge.impl.RasterDrawingEngine;
import com.patterns.structural.bridge.impl.RectangleShape;
import com.patterns.structural.bridge.impl.VectorDrawingEngine;

/**
 * <p>
 * <strong>Bridge</strong> is a structural design pattern that divides business logic or
 * huge class into separate class hierarchies that can be developed independently.
 * One of these hierarchies (often called the Abstraction) will get a reference to
 * an object of the second hierarchy (Implementation).
 * The abstraction will be able to delegate some (sometimes, most) of its calls to the
 * implementations object. Since all implementations will have a common interface,
 * they’d be interchangeable inside the abstraction.
 * </p>
 * <ul>
 *     <li><strong><em>Intent:</em></strong>
 *     <ul>
 *         <li><strong><em>Decouple Abstraction from Implementation:</em></strong> The primary intent of the Bridge pattern is to
 *         decouple the abstraction (high-level logic or interface) from its implementation
 *         (concrete implementation details). This separation allows changes to one part of the
 *         system to have minimal impact on the other, promoting flexibility and maintainability.</li>
 *         <li><strong><em>Multiple Variations:</em></strong> It enables the creation of multiple abstractions and implementations
 *         that can be combined independently, providing a high degree of flexibility and
 *         adaptability to changing requirements.</li>
 *     </ul>
 *     </li>
 *     <li><strong><em>Usage:</em></strong>
 *     <ul>
 *         <li><strong><em>Complex Hierarchies:</em></strong> The Bridge pattern is particularly useful when you have a
 *         complex class hierarchy with multiple dimensions of variation. For example, when you
 *         have multiple platforms (e.g., Windows, Linux, macOS) and multiple device types
 *         (e.g., desktop, mobile) that need to work together.</li>
 *         <li><strong><em>Avoiding a Cartesian Product Explosion:</em></strong> Without the Bridge pattern, you might
 *         end up with a "Cartesian product explosion" of classes, where you have to create
 *         a subclass for each combination of variations. The Bridge pattern helps avoid this issue.</li>
 *         <li><strong><em>Interface and Implementation Independence:</em></strong> When you want to change or extend
 *         the abstraction or implementation independently without affecting the other side.
 *         For example, you can add new features to an abstraction or support new platforms without
 *         altering the existing code.</li>
 *     </ul>
 *     </li>
 *     <li><strong><em>Flexibility:</em></strong>
 *     <ul>
 *         <li><strong><em>Dynamic Binding:</em></strong> The Bridge pattern allows for dynamic binding
 *         between the abstraction and implementation at runtime. This means you can change the
 *         implementation of an abstraction on the fly, providing great flexibility.</li>
 *         <li><strong><em>Extensibility:</em></strong> Adding new abstractions or implementations is
 *         relatively easy. You can create new subclasses of the abstraction or implementation without
 *         modifying the existing code.</li>
 *         <li><strong><em>Reuse:</em></strong> Existing abstractions and implementations can be reused
 *         in various combinations, reducing code duplication and promoting maintainability.</li>
 *         <li><strong><em>Testing:</em></strong> The separation of abstraction and implementation makes
 *         it easier to test each component independently, leading to better testing strategies.</li>
 *     </ul>
 *     </li>
 * </ul>
 * Here are a few real-world use cases where the Bridge pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>GUI Systems</em></strong>:
 *         The Bridge pattern can be used in graphical user interface (GUI) systems to
 *         separate the platform-specific implementation details (like rendering and interaction)
 *         from the higher-level user interface components.
 *     </li>
 *     <li>
 *         <strong><em>Database Drivers</em></strong>:
 *         When implementing database drivers, the Bridge pattern can be used to separate
 *         the generic database API from the specific database vendor's implementation details.
 *     </li>
 *     <li>
 *         <strong><em>Drawing/Graphics Libraries</em></strong>:
 *         Drawing and graphics libraries can use the Bridge pattern to separate the drawing
 *         functionality from the rendering engines, allowing different graphics backends to be
 *         used without changing the higher-level code.
 *     </li>
 *     <li>
 *         <strong><em>Remote Controls</em></strong>:In scenarios where you have remote
 *         control devices interacting with different types of devices (TVs, DVD players, etc.),
 *         the Bridge pattern can be used to separate the abstraction of the remote control
 *         from the actual device control.
 *     </li>
 *     <li>
 *         <strong><em>Audio/Video Playback</em></strong>:Media player applications can use
 *         the Bridge pattern to separate the high-level playback controls (play, pause, stop)
 *         from the actual audio or video decoding and rendering.
 *     </li>
 *     <li>
 *         <strong><em>Operating System Abstractions</em></strong>:The Bridge pattern can be
 *         applied to create a separation between higher-level operating system abstractions
 *         (file systems, network communication) and the platform-specific implementations.
 *     </li>
 *     <li>
 *         <strong><em>Messaging Systems</em></strong>:Messaging systems, such as those used in
 *         real-time communication applications, can utilize the Bridge pattern to decouple the
 *         messaging protocols from the user interface.
 *     </li>
 *     <li>
 *         <strong><em>Resource Management</em></strong>:The Bridge pattern can help manage
 *         resources like printers, where the high-level printer interface is separated from
 *         the specific printer models and their implementations.
 *     </li>
 *     <li>
 *         <strong><em>Vehicle Management</em></strong>:In a transportation system, the Bridge
 *         pattern can separate vehicle types (cars, buses, trains) from their specific
 *         implementations, such as engine types or fuel sources.
 *     </li>
 *     <li>
 *         <strong><em>Shape and Color Combinations</em></strong>:When dealing with graphics
 *         or drawing applications, the Bridge pattern can be used to combine different shapes
 *         and colors independently, preventing the need for a class explosion in a traditional
 *         inheritance hierarchy.
 *     </li>
 *     <li>
 *         <strong><em>Multiple Platforms or Frameworks</em></strong>:When developing
 *         software that needs to run on multiple platforms or frameworks, the Bridge
 *         pattern can help manage the differences between these platforms without duplicating code.
 *     </li>
 * </ul>
 */
public class BridgeExample {

    public static void main(String[] args) {

        // real world sample
        VectorDrawingEngine vectorDrawingEngine = new VectorDrawingEngine();
        CircleShape circleShape = new CircleShape(10, 10, 5, vectorDrawingEngine);
        circleShape.draw();

        RasterDrawingEngine rasterDrawingEngine = new RasterDrawingEngine();
        RectangleShape rectangleShape = new RectangleShape(0, 0, 20, 10, rasterDrawingEngine);
        rectangleShape.draw();
    }
}
