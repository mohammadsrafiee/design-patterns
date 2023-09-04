package com.patterns.behavioural.chain.of.responsibility;

import com.patterns.behavioural.chain.of.responsibility.impl.*;

/**
 * Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of
 * handlers. Upon receiving a request, each handler decides either to process the request or to pass it to
 * the next handler in the chain.
 * The pattern allows multiple objects to handle the request without coupling sender class to the concrete
 * classes of the receivers. The chain can be composed dynamically at runtime with any handler that
 * follows a standard handler interface.
 */
public class ChainOfResponsibilityExample {

    public static void main(String[] args) {
        LogBloc logBloc = new LogBloc();
        LoggerBase logger = new DebugLogger(
                logBloc,
                new InfoLogger(
                        logBloc,
                        new ErrorLogger(
                                logBloc,
                                null)));

        logger.logDebug("This is a debug message");
        System.out.println("---------------------------------");
        logger.logInfo("This is a info message");
        System.out.println("---------------------------------");
        logger.logDebug("This is a debug message");
        System.out.println("---------------------------------");
        logger.logError("This is a error message");
        System.out.println("---------------------------------");
    }
}
