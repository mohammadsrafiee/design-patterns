package ir.patterns.bihavioral.memento;

import ir.patterns.bihavioral.memento.impl.CommandHistory;
import ir.patterns.bihavioral.memento.impl.Originator;
import ir.patterns.bihavioral.memento.impl.RandomisePropertiesCommand;

public class MementoExamle {

	public static void main(String[] args) {
		CommandHistory commandHistory = new CommandHistory();
		Originator originator = new Originator();
		System.out.println(originator.getState().toString());

		{
			RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
			command.execute();
			System.out.println(originator.getState().toString());
			commandHistory.add(command);
		}
		{
			RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
			command.execute();
			System.out.println(originator.getState().toString());
			commandHistory.add(command);
		}
		{
			RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
			command.execute();
			System.out.println(originator.getState().toString());
			commandHistory.add(command);
		}
		{
			RandomisePropertiesCommand command = new RandomisePropertiesCommand(originator);
			command.execute();
			System.out.println(originator.getState().toString());
			commandHistory.add(command);
		}

		System.out.println("------------------------------");

		commandHistory.undo();
		System.out.println(originator.getState().toString());
		commandHistory.undo();
		System.out.println(originator.getState().toString());
		commandHistory.undo();
		System.out.println(originator.getState().toString());
		commandHistory.undo();
		System.out.println(originator.getState().toString());
		commandHistory.undo();
		System.out.println(originator.getState().toString());
	}
}
