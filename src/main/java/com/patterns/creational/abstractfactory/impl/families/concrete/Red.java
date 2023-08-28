package com.patterns.creational.abstractfactory.impl.families.concrete;

import com.patterns.creational.abstractfactory.impl.families.Color;

/**
 * All products families have the same varieties (RoundedShape/StraightShape).
 * This is a variant of a color.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Filling with red color");
    }
}