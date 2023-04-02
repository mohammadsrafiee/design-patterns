package ir.patterns.bihavioral.command;

import ir.patterns.bihavioral.command.impl.ChangeColorCommand;
import ir.patterns.bihavioral.command.impl.ChangeHeightCommand;
import ir.patterns.bihavioral.command.impl.ChangeWidthCommand;
import ir.patterns.bihavioral.command.impl.CommandHistory;
import ir.patterns.bihavioral.command.impl.Shape;

public class CommandExample {
	public static void main(String[] args) {
		CommandHistory history = new CommandHistory();
		Shape shape = new Shape();

		System.out.println("--------------------------- Execute Command ---------------------------");
		{
			ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
			changeWidthCommand.execute();
			System.out.println(shape.toString());
			history.add(changeWidthCommand);
		}

		{
			ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
			changeColorCommand.execute();
			System.out.println(shape.toString());
			history.add(changeColorCommand);
		}

		{
			ChangeHeightCommand changeHeightCommand = new ChangeHeightCommand(shape);
			changeHeightCommand.execute();
			System.out.println(shape.toString());
			history.add(changeHeightCommand);
		}

		{
			ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
			changeColorCommand.execute();
			System.out.println(shape.toString());
			history.add(changeColorCommand);
		}
		
		{
			ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
			changeWidthCommand.execute();
			System.out.println(shape.toString());
			history.add(changeWidthCommand);
		}

		{
			ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
			changeColorCommand.execute();
			System.out.println(shape.toString());
			history.add(changeColorCommand);
		}

		{
			ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
			changeWidthCommand.execute();
			System.out.println(shape.toString());
			history.add(changeWidthCommand);
		}
		
		{
			ChangeWidthCommand changeWidthCommand = new ChangeWidthCommand(shape);
			changeWidthCommand.execute();
			System.out.println(shape.toString());
			history.add(changeWidthCommand);
		}

		{
			ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
			changeColorCommand.execute();
			System.out.println(shape.toString());
			history.add(changeColorCommand);
		}

		{
			ChangeColorCommand changeColorCommand = new ChangeColorCommand(shape);
			changeColorCommand.execute();
			System.out.println(shape.toString());
			history.add(changeColorCommand);
		}
		
		System.out.println("--------------------------- Undo Command ---------------------------");
		
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
		history.undo();
		System.out.println(shape.toString());
	}
	
}
