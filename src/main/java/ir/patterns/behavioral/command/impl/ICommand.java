package ir.patterns.behavioral.command.impl;

/**
 * Encapsulate a request as an Object, thereby letting you parameterize clients
 * with different requests, queue or log requests, and support undoable
 * operations.
 * 
 * Command is a interface class which is used as an interface for all the
 * specific commands
 */
public interface ICommand {

	/**
	 * an abstract method which executes the command;
	 */
	void execute();

	/**
	 * an abstract method which undoes the command and returns the receiver to the
	 * previous state
	 */
	void undo();

	/**
	 * an abstract method which returns the command's title.
	 * 
	 * @return String
	 */
	String getTitle();

}
