package com.patterns.structural.facade;


import com.patterns.structural.facade.impl.ComputerFacade;

/**
 * <p>
 * <strong>Facade</strong> is a structural design pattern that provides a simplified and unified interface
 * to a set of interfaces in a subsystem. It encapsulates the complexities of the subsystem and
 * presents a higher-level interface that makes it easier for clients to interact with the subsystem.
 * Essentially, it acts as a single entry point to a group of related interfaces, simplifying their usage.
 * </p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The intent of the Facade design pattern is to provide a simplified
 *         and unified interface to a complex system or subsystem. It promotes loose coupling between
 *         the client code and the subsystem by hiding the subsystem's complexity behind a single,
 *         well-defined interface. This simplification makes it easier for clients to use the subsystem
 *         without needing to understand its internal details.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: While Singleton enforces a single instance, it can be implemented
 *         in various ways, such as lazy initialization, eager initialization, or through the use of a registry
 *         or container. This flexibility allows developers to choose the most suitable approach for their
 *         specific use case.
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>: The Facade pattern can make a system more flexible in the
 *         following ways:
 *         <ul>
 *             <li>
 *                 <strong><em>Easy Maintenance:</em></strong> Because client code doesn't depend on the complex
 *                 subsystem directly, it's easier to modify and maintain the subsystem without affecting clients.
 *             </li>
 *             <li>
 *                 <strong><em>Enhanced Testability:</em></strong> You can write unit tests for the subsystem
 *                 independently since you have a well-defined facade interface.
 *             </li>
 *             <li><strong><em>Modularity:</em></strong> Subsystems can be developed and modified independently,
 *             promoting modularity and ease of development.
 *             </li>
 *         </ul>
 *     </li>
 * </ul>
 * Here are a few real-world use cases where the Facade pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Simplifying Complex APIs</em></strong>: When you have a complex API or library with many
 *         classes and methods, you can create a facade to provide a simplified and user-friendly interface.
 *     </li>
 *     <li>
 *         <strong><em>Legacy Code Integration</em></strong>: When working with legacy code that has a convoluted or
 *         outdated structure, a facade can be used to modernize and simplify interactions with it.
 *     </li>
 *     <li>
 *         <strong><em>Multi-Layered Subsystems</em></strong>: In multi-layered architectures, a facade can be
 *         created for each layer to hide the underlying complexities from higher-level layers.
 *     </li>
 *     <li>
 *         <strong><em>Library or Framework Wrappers</em></strong>: When you want to use an external library or
 *         framework but wish to provide a simpler and more consistent API for your application, a facade can wrap the library's functionality.
 *     </li>
 *     <li>
 *         <strong><em>Resource Management</em></strong>: When dealing with resource management, such as database
 *         connections, file handling, or network communication, a facade can handle resource allocation, deallocation, and error handling.
 *     </li>
 *     <li>
 *         <strong><em>UI Development</em></strong>: In graphical user interface (GUI) development, a facade can
 *         simplify the interaction between the application logic and the complex UI framework.
 *     </li>
 *     <li>
 *         <strong><em>Caching Systems</em></strong>: When working with caching systems like Redis or Memcached,
 *         a facade can provide a unified interface for storing, retrieving, and managing cached data.
 *     </li>
 * </ul>
 */
public class FacadeExample {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        // Starting the computer using the facade
        computer.start();
        // Performing some tasks (Client doesn't need to know subsystem details)
        System.out.println("Performing some tasks on the computer...");
        // Shutting down the computer using the facade
        computer.shutDown();
    }
}
