package ir.patterns.behavioural.state.impl;

public class RecivedState implements IPackageState {

	@Override
	public void next(IPackage obj) {
		System.out.println("This package is already received by a client.");
	}

	@Override
	public void previous(IPackage obj) {
		obj.setState(new DeliveredState());
	}

	@Override
	public String getState() {
		return RecivedState.class.getSimpleName();
	}
}
