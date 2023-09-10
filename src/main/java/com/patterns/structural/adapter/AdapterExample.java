package com.patterns.structural.adapter;

import com.patterns.structural.adapter.impl.adapter.LegacyWeatherAdapter;
import com.patterns.structural.adapter.impl.services.LegacyWeatherService;
import com.patterns.structural.adapter.impl.services.LegacyWeatherServiceImpl;
import com.patterns.structural.adapter.impl.services.ModernWeatherService;
import com.patterns.structural.adapter.impl.services.ModernWeatherServiceImpl;

/**
 * <p>
 * <strong> Adapter </strong> design pattern is a structural pattern that allows two incompatible interfaces to work
 * together. It acts as a bridge between two classes or interfaces that have different methods or
 * expectations, enabling them to collaborate without needing to modify their source code. This pattern
 * is particularly useful when integrating new functionalities or components into an existing system.
 * </p>
 * <ul>
 *     <li>
 *         <strong><em>Intent</em></strong>: The primary purpose of the Adapter design pattern is to
 *         facilitate the compatibility between two interfaces that are inherently incompatible,
 *         enabling them to collaborate harmoniously. It serves as an intermediary that translates one
 *         interface into another, guaranteeing the effective cooperation of objects belonging to
 *         distinct classes.
 *     </li>
 *     <li>
 *         <strong><em>Usage</em></strong>:
 *         <ul>
 *             <li>When you want to integrate a new component or library into your existing
 *             system without changing the existing codebase.</li>
 *             <li>To provide a consistent interface for a set of classes with different interfaces.</li>
 *             <li>When you need to adapt legacy code to work with modern components or vice versa.</li>
 *             <li>Facilitating communication between different systems or modules with incompatible interfaces.</li>
 *         </ul>
 *     </li>
 *     <li>
 *         <strong><em>Flexibility</em></strong>:
 *         <ul>
 *             <li>The Adapter pattern promotes flexibility by allowing the integration of new components
 *             or classes without modifying existing code. This reduces the risk of introducing bugs in the
 *             existing system.</li>
 *             <li>It enables the reuse of existing classes or components in new contexts, improving code
 *             maintainability and reducing redundancy.</li>
 *             <li>Multiple adapters can be created to adapt the same class to different interfaces, offering
 *             flexibility in how the class can be used.</li>
 *         </ul>
 *     </li>
 * </ul>
 * Here are a few real-world use cases where the Adapter pattern can be applied effectively:
 * <ul>
 *     <li>
 *         <strong><em>Integration of External Libraries</em></strong>: When you need to incorporate external
 *         libraries or frameworks into your application, and their interfaces are incompatible with your
 *         existing codebase, you can create adapters to make them work seamlessly together.
 *     </li>
 *     <li>
 *         <strong><em>Legacy System Integration</em></strong>: When dealing with legacy systems that have
 *         outdated interfaces, you can use adapters to connect them with modern systems or components without
 *         the need for extensive refactoring.
 *     </li>
 *     <li>
 *         <strong><em>Database Compatibility</em></strong>: If you have different database systems
 *         with varying interfaces, adapters can provide a unified interface for database operations,
 *         making it easier to switch between databases or use multiple databases within the same application.
 *     </li>
 *     <li>
 *         <strong><em>Third-party API Integration</em></strong>: When interacting with third-party APIs
 *         that do not conform to your application's interface standards, adapters can be employed to translate
 *         the API calls into a format your application understands.
 *     </li>
 *     <li>
 *         <strong><em>UI Component Compatibility</em></strong>: Adapters can be used in graphical user
 *         interfaces (GUIs) to adapt diverse UI components or widgets, ensuring a consistent look and
 *         behavior across the interface.
 *     </li>
 *     <li>
 *         <strong><em>Hardware Abstraction</em></strong>: Adapters are beneficial for creating a hardware
 *         abstraction layer in embedded systems, allowing different hardware components with unique interfaces
 *         to be interchangeable without altering the core logic.
 *     </li>
 *     <li>
 *         <strong><em>Logging Frameworks</em></strong>: When integrating different logging frameworks or
 *         services into an application, adapters can be used to standardize log entries and send them to the
 *         chosen logging service.
 *     </li>
 *     <li>
 *         <strong><em>Language Interoperability</em></strong>: In multilingual software projects, adapters can
 *         help bridge the gap between components written in different programming languages or platforms.
 *     </li>
 *     <li>
 *         <strong><em>Protocol Conversion</em></strong>: Adapters can be employed to convert between communication
 *         protocols, such as converting data from XML to JSON format or between different versions of a protocol.
 *     </li>
 *     <li>
 *         <strong><em>Mocking for Testing</em></strong>: In unit testing, adapters can be used to create mock
 *         objects that simulate the behavior of real objects, allowing you to test components independently.
 *     </li>
 *     <li>
 *         <strong><em>Internationalization (i18n)</em></strong>: Adapters can assist in adapting the user
 *         interface and content to different languages or regions by providing a standardized way to interact
 *         with localization and internationalization libraries.
 *     </li>
 * </ul>
 */
public class AdapterExample {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Modern weather service
        ModernWeatherService modernService = new ModernWeatherServiceImpl();
        System.out.printf("%40s [%s] \n", "Modern Weather Service->", modernService.getCurrentWeather());


        // Legacy weather service
        LegacyWeatherService legacyService = new LegacyWeatherServiceImpl();
        // Modern weather application using the Adapter for the legacy service
        ModernWeatherService legacyAdapter = new LegacyWeatherAdapter(legacyService);
        System.out.printf("%40s [%s] \n", "Legacy Weather Service (via Adapter)->", legacyAdapter.getCurrentWeather());

    }
}
