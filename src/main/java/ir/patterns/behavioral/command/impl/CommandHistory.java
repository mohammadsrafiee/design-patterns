package ir.patterns.behavioral.command.impl;

import java.util.Stack;

/**
 * CommandHistory is a simple class which stores a list of already executed
 * commands (commandList) and provides methods to add a new command to the
 * command history list (add()) and undo the last command from that list
 * (undo()).
 */
public class CommandHistory {

	private Stack<ICommand> history;

	public CommandHistory() {
		this.history = new Stack<>();
	}

	public void add(ICommand command) {
		this.history.push(command);
	}

	public void undo() {
		if (!this.history.isEmpty()) {
			ICommand command = this.history.pop();
			command.undo();
		}
	}
}
