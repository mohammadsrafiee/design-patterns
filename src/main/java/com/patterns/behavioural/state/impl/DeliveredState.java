package com.patterns.behavioural.state.impl;

public class DeliveredState implements IPackageState {

    @Override
    public void next(IPackage obj) {
        obj.setState(new RecivedState());
    }

    @Override
    public void previous(IPackage obj) {
        obj.setState(new OrderedState());
    }

    @Override
    public String getState() {
        return DeliveredState.class.getSimpleName();
    }

}
