package ir.patterns.behavioral.state;

import ir.patterns.behavioral.state.impl.Package;

/**
 * State is a behavioral design pattern that allows an object to change the behavior
 * when its internal state changes.
 * The pattern extracts state-related behaviors into separate state classes and forces
 * the original object to delegate the work to an instance of these classes, instead of acting on its own.
 */
public class StateExample {

    public static void main(String[] args) {
        Package obj = new Package();
        System.out.println(obj.showState());
        obj.next();
        System.out.println(obj.showState());
        obj.next();
        System.out.println(obj.showState());
        obj.next();
        System.out.println(obj.showState());
        obj.next();
        System.out.println(obj.showState());
    }
}
