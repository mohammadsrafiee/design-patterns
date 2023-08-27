package com.patterns.behavioural.command;

import com.patterns.behavioural.command.impl.*;
import ir.patterns.behavioural.command.impl.*;

import java.util.Random;

/**
 * Command is behavioral design pattern that converts requests or simple operations into objects.
 * The conversion allows deferred or remote execution of commands, storing command history, etc.
 */
public class CommandExample {
    public static void main(String[] args) {
        CommandHistory history = new CommandHistory();
        Shape shape = new Shape();

        ICommand[] commands = new ICommand[]{
                new ChangeHeightCommand(shape),
                new ChangeWidthCommand(shape),
                new ChangeColorCommand(shape)};

        System.out.println("--------------------------- Start Execute Command -------------------------");
        for (int index = 0; index < 10; ++index) {
            int i = new Random().nextInt(3);
            ICommand command = commands[i];
            command.execute();
            System.out.println(shape);
            history.add(command);
        }
        System.out.println("--------------------------- End Execute Command ---------------------------");

        System.out.println("--------------------------- Start Undo Command ----------------------------");
        int commandCount = history.getCommandCount();
        for (int index = commandCount; index > 1; --index) {
            history.undo();
            System.out.println(shape);
        }
        System.out.println("--------------------------- End Undo Command -------------------------------");
    }

}
