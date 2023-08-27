package ir.patterns.behavioural.state.impl;

public interface IPackage {

	void next();

	void previous();

	String showState();

	IPackageState getState();

	void setState(IPackageState state);
}
