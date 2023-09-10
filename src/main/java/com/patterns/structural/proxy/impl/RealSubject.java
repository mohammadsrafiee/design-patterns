package com.patterns.structural.proxy.impl;

/**
 * RealSubject represents the real object whose behavior is
 * being controlled by the proxy.
 */
public class RealSubject implements Subject {

    /**
     * Performs a request.
     */
    @Override
    public void request() {
        System.out.println("RealSubject: Handling the request.");
    }
}