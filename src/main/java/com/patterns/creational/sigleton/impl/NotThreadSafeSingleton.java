package com.patterns.creational.sigleton.impl;

public class NotThreadSafeSingleton {
    private static NotThreadSafeSingleton instance;

    private NotThreadSafeSingleton() {
        // Private constructor to prevent instantiation.
    }

    public static NotThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new NotThreadSafeSingleton();
        }
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
