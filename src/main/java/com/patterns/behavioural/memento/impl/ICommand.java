package com.patterns.behavioural.memento.impl;

public interface ICommand {

	/**
	 * an abstract method which execute the command
	 */
	void execute();

	/**
	 * an abstract method which undoes the command and returns the state to the
	 * previous snapshot of it.
	 */
	void undo();

}
