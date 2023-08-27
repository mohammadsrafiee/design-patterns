package com.patterns.behavioural.state.impl;

public class OrderedState implements IPackageState {

    @Override
    public void next(IPackage obj) {
        obj.setState(new DeliveredState());
    }

    @Override
    public void previous(IPackage obj) {
        System.out.println("The package is in its root state.");
    }

    @Override
    public String getState() {
        return OrderedState.class.getSimpleName();
    }

}
