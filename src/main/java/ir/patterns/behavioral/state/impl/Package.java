package ir.patterns.behavioral.state.impl;

public class Package implements IPackage {

	private IPackageState state;

	public Package() {
		this.setState(new OrderedState());
	}

	public void next() {
		this.getState().next(this);
	}

	public void previous() {
		this.getState().previous(this);
	}

	public String showState() {
		return this.getState().getState();
	}

	public IPackageState getState() {
		return state;

	}

	public void setState(IPackageState state) {
		this.state = state;

	}
}