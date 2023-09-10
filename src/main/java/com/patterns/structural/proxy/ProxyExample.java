package com.patterns.structural.proxy;

import com.patterns.structural.proxy.impl.Proxy;
import com.patterns.structural.proxy.impl.Subject;

/**
 * <p>
 * <strong>Proxy</strong> is a structural design pattern that lets you provide a substitute or
 * placeholder for another object. A proxy controls access to the original object,
 * allowing you to perform something either before or after the request gets through to the original object.
 * </p>
 * <ul>
 *     <li><strong><em>Intent:</em></strong>The Proxy Pattern is a structural design pattern that provides a surrogate or
 *     placeholder for another object to control access to it. It is used to add an extra level
 *     of control over the interaction with the real object, enabling actions such as lazy loading,
 *     access control, logging, or monitoring without altering the actual object's interface.</li>
 *     <li><strong><em>Usage:</em></strong>The Proxy Pattern serves as a structural design pattern used to
 *     control access to an object, referred to as the "real object," while also enabling additional functionality
 *     without altering the real object's interface. It is commonly applied in scenarios involving lazy loading,
 *     access control, logging, monitoring, caching, and more. By introducing a proxy object, developers can manage
 *     resource utilization, enhance security, and add features like remote access or smart behaviors seamlessly,
 *     ultimately improving the flexibility and performance of software systems.</li>
 *     <li><strong><em>Flexibility:</em></strong>The Proxy Pattern enhances flexibility by allowing you to make changes or
 *     introduce new functionality to the real object or its interactions without modifying the
 *     client code. You can swap proxies or real objects without impacting the client's usage.</li>
 * </ul>
 * Here are a few real-world use cases where the Proxy pattern can be applied effectively:
 * <ul>
 *     <li><strong><em>Virtual Proxy:</em></strong> Load and display large images or videos only when they are needed,
 *     not all at once.</li>
 *     <li><strong><em>Remote Proxy:</em></strong> Access and control remote objects or services over a network,
 *     like distributed systems or cloud resources.</li>
 *     <li><strong><em>Access Control Proxy:</em></strong> Implement role-based access control to restrict certain
 *     users from accessing specific resources.</li>
 *     <li><strong><em>Logging Proxy:</em></strong> Log method calls, parameters, and results for debugging or
 *     auditing purposes.</li>
 *     <li><strong><em>Caching Proxy:</em></strong> Cache frequently requested data to reduce latency and improve
 *     performance.</li>
 *     <li><strong><em>Smart Proxy:</em></strong> Implement reference counting to manage the lifetime of objects
 *     or perform additional optimizations.</li>
 *     <li><strong><em>Lazy Initialization:</em></strong> Delay the creation of expensive objects until they are
 *     actually needed, improving startup time or resource usage.</li>
 * </ul>
 */
public class ProxyExample {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        // Client code interacts with the proxy
        proxy.request();
    }
}
