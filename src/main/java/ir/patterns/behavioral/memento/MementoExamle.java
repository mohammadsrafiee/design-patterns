package ir.patterns.behavioral.memento;

import ir.patterns.behavioral.memento.impl.CommandHistory;
import ir.patterns.behavioral.memento.impl.Originator;
import ir.patterns.behavioral.memento.impl.RandomisePropertiesCommand;

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
