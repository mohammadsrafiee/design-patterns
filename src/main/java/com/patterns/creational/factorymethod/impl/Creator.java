package com.patterns.creational.factorymethod.impl;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public interface Creator { // or abstract class to implement core creation object business

    Color factoryMethod(); // if Factory will be an abstract class, this method will be a abstract method

}
