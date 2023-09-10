package com.patterns.structural.proxy.impl;

/**
 * Proxy controls access to the RealSubject.
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    /**
     * Performs a request.
     */
    @Override
    public void request() {
        // Lazy initialization of the RealSubject
        if (realSubject == null) {
            realSubject = new RealSubject();
        }

        // Additional behavior or checks can be added here
        System.out.println("Proxy: Performing pre-processing.");

        // Delegating the request to the RealSubject
        realSubject.request();

        // Additional behavior or checks can be added here
        System.out.println("Proxy: Performing post-processing.");
    }
}