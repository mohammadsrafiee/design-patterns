package com.patterns.behavioural.memento.impl;

/**
 * Without violate encapsulation, capture and externalize an object's internal
 * state so that the object can be restored to this state.
 * 
 */
public abstract class IMemento {
	/**
	 * an abstract method which returns the snapshot of the internal originator's
	 * state
	 * 
	 * @return 
	 */
	public abstract Shape getState();
}