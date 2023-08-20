package ir.patterns.behavioral.command;

import ir.patterns.behavioral.command.impl.*;

/**
 * Command is behavioral design pattern that converts requests or simple operations into objects.
 * The conversion allows deferred or remote execution of commands, storing command history, etc.
 */
public class CommandExample {
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        Shape shape = new Shape();
        System.out.println("--------------------------- Execute Command ---------------------------");
        {
            ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
            changeWidthCommand.execute();
            System.out.println(shape);
            history.add(changeWidthCommand);
        }

        {
            ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
            changeColorCommand.execute();
            System.out.println(shape);
            history.add(changeColorCommand);
        }

        {
            ChangeHeightCommand changeHeightCommand = new ChangeHeightCommand(shape);
            changeHeightCommand.execute();
            System.out.println(shape);
            history.add(changeHeightCommand);
        }

        {
            ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
            changeColorCommand.execute();
            System.out.println(shape);
            history.add(changeColorCommand);
        }

        {
            ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
            changeWidthCommand.execute();
            System.out.println(shape);
            history.add(changeWidthCommand);
        }

        {
            ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
            changeColorCommand.execute();
            System.out.println(shape);
            history.add(changeColorCommand);
        }

        {
            ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
            changeWidthCommand.execute();
            System.out.println(shape);
            history.add(changeWidthCommand);
        }

        {
            ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
            changeWidthCommand.execute();
            System.out.println(shape);
            history.add(changeWidthCommand);
        }

        {
            ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
            changeColorCommand.execute();
            System.out.println(shape);
            history.add(changeColorCommand);
        }

        {
            ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
            changeColorCommand.execute();
            System.out.println(shape);
            history.add(changeColorCommand);
        }

        System.out.println("--------------------------- Undo Command ---------------------------");

        int commandCount = history.getCommandCount();
        for (int index = commandCount; index > 1; --index) {
            history.undo();
            System.out.println(shape);
        }
    }

}
