package com.patterns.creational.sigleton.impl;

public class ThreadSafeSingleton {
    private volatile static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // Private constructor to prevent instantiation.
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
