package ir.patterns.behavioral.memento.impl;

import java.util.Stack;

/**
 * It is a simple class which stores a list of already executed commands
 * {@link ICommand} and provides methods to add a new command to the command
 * history list {@link CommandHistory#add(ICommand)} and undo the last command
 * from that list {@link CommandHistory#undo()}
 */
public class CommandHistory {

	private Stack<ICommand> commands;

	public CommandHistory() {
		this.commands = new Stack<>();
	}

	public void add(ICommand command) {
		this.commands.push(command);
	}

	public void undo() {
		if (this.commands.size() > 0) {
			ICommand command = this.commands.pop();
			command.undo();
		}
	}

	public boolean isEmpty() {
		return !(this.commands.size() > 0);
	}

}
