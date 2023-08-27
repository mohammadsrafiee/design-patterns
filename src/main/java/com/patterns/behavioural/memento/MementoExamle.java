package com.patterns.behavioural.memento;

import com.patterns.behavioural.memento.impl.CommandHistory;
import com.patterns.behavioural.memento.impl.Originator;
import com.patterns.behavioural.memento.impl.RandomisePropertiesCommand;

/**
 * Memento is a behavioral design pattern that allows making snapshots of an object’s
 * state and restoring it in the future.
 * The Memento doesn’t compromise the internal structure of the object it works
 * with, as well as data kept inside the snapshots.
 */
public class MementoExamle {

    public static void main(String[] args) {
        CommandHistory commandHistory = new CommandHistory();
        Originator originator = new Originator();
        System.out.println(originator.getState());

        {
            RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
            command.execute();
            System.out.println(originator.getState());
            commandHistory.add(command);
        }
        {
            RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
            command.execute();
            System.out.println(originator.getState());
            commandHistory.add(command);
        }
        {
            RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
            command.execute();
            System.out.println(originator.getState());
            commandHistory.add(command);
        }
        {
            RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
            command.execute();
            System.out.println(originator.getState());
            commandHistory.add(command);
        }

        System.out.println("------------------------------");

        while (!commandHistory.isEmpty()) {
            commandHistory.undo();
            System.out.println(originator.getState());
        }
    }
}
