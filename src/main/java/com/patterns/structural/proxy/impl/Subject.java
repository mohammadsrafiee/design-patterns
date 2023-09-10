package com.patterns.structural.proxy.impl;

/**
 * Interface representing the subject that both the RealSubject and Proxy implement.
 */
public interface Subject {
    /**
     * Performs a request.
     */
    void request();
}