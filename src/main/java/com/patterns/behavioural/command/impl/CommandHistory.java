package com.patterns.behavioural.command.impl;

import java.util.Stack;

/**
 * CommandHistory is a simple class which stores a list of already executed
 * commands (commandList) and provides methods to add a new command to the
 * command history list (add()) and undo the last command from that list
 * (undo()).
 */
public class CommandHistory {

    private final Stack<ICommand> history;

    /**
     *
     */
    public CommandHistory() {
        this.history = new Stack<>();
    }

    /**
     * @param command
     */
    public void add(ICommand command) {
        this.history.push(command);
    }

    /**
     *
     */
    public void undo() {
        if (!this.history.isEmpty()) {
            ICommand command = this.history.pop();
            command.undo();
        }
    }

    /**
     * @return
     */
    public int getCommandCount() {
        return history.size();
    }
}
