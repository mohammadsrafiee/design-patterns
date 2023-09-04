package com.patterns.creational.sigleton;

import com.patterns.creational.sigleton.impl.NotThreadSafeSingleton;
import com.patterns.creational.sigleton.impl.ThreadSafeSingleton;

/**
 * <p>
 * <strong>Singleton</strong> is a creational design pattern that lets you ensure that a class has only one
 * instance, while providing a global access point to this instance.
 * </p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The primary intent of the Singleton pattern is to control the
 *         instantiation process of a class to ensure that only one instance exists, and
 *         to provide a way to access that instance globally.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>: While Singleton enforces a single instance, it can be implemented
 *         in various ways, such as lazy initialization, eager initialization, or through the use of a registry
 *         or container. This flexibility allows developers to choose the most suitable approach for their
 *         specific use case.
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>: Singletons are often used when you need to manage a
 *         single point of control for resources or services that should have a single instance.
 *     </li>
 * </ul>
 * <p>
 * Here are a few real-world use cases where the Singleton pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Database Connections</em></strong>: Ensuring there is only one database connection throughout
 *         the application to avoid resource contention and improve performance.
 *     </li>
 *     <li>
 *         <strong><em>Logging</em></strong>: Centralizing logging functionality to maintain a single log file and
 *         control log levels and formats.
 *     </li>
 *     <li>
 *         <strong><em>Caching</em></strong>: Managing a single cache instance to store frequently used data,
 *         improving application performance by reducing redundant data retrieval.
 *     </li>
 *     <li>
 *         <strong><em>Configuration Management</em></strong>: Ensuring there's only one instance responsible
 *         for loading and managing application configurations.
 *     </li>
 *     <li>
 *         <strong><em>Thread Pools</em></strong>: Managing a thread pool to control the number of concurrent
 *         threads and efficiently handle tasks in a multithreaded environment.
 *     </li>
 *     <li>
 *         <strong><em>Device Drivers</em></strong>: In scenarios where multiple components or services need to
 *         communicate with a hardware device, a Singleton can manage access and prevent conflicts.
 *     </li>
 *     <li>
 *         <strong><em>State Management</em></strong>: When managing the global state of an application, such as
 *         user authentication, session management, or game state in a video game.
 *     </li>
 *     <li>
 *         <strong><em>GUI Components</em></strong>: Creating a single instance for GUI components like dialog
 *         boxes, system tray icons, or context menus to ensure consistent behavior.
 *     </li>
 * </ul>
 */
public class SingletonExample extends ThreadSafeSingleton {
    public static void main(String[] args) {

        // Thread-Safe Singleton
        ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getInstance();
        System.out.println("Thread-Safe Singleton:");
        System.out.println("Instance 1 Hash Code: " + threadSafeInstance1.hashCode());
        System.out.println("Instance 2 Hash Code: " + threadSafeInstance2.hashCode());
        System.out.println("Are instances equal? " + (threadSafeInstance1 == threadSafeInstance2));

        // Not Thread-Safe Singleton
        NotThreadSafeSingleton notThreadSafeInstance1 = NotThreadSafeSingleton.getInstance();
        NotThreadSafeSingleton notThreadSafeInstance2 = NotThreadSafeSingleton.getInstance();

        System.out.println("\nNot Thread-Safe Singleton:");
        System.out.println("Instance 1 Hash Code: " + notThreadSafeInstance1.hashCode());
        System.out.println("Instance 2 Hash Code: " + notThreadSafeInstance2.hashCode());
        System.out.println("Are instances equal? " + (notThreadSafeInstance1 == notThreadSafeInstance2));
    }
}
