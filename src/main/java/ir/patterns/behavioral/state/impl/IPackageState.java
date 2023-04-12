package ir.patterns.behavioral.state.impl;

/**
 * allow an object to alter its behavior when its internal state changes.
 * The object will appear to change its class.
 */
public interface IPackageState {
	
	void next(IPackage obj);
	void previous(IPackage obj);
	String getState();
}
