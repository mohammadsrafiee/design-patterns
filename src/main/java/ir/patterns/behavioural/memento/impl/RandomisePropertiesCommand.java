package ir.patterns.behavioural.memento.impl;

import java.util.Random;

import ir.patterns.behavioural.memento.impl.Shape.Color;

/**
 * This is a concrete command that implement {@link ICommand} interface
 */
public class RandomisePropertiesCommand implements ICommand {

	private IMemento backup;
	private Originator originator;

	public RandomisePropertiesCommand(Originator originator) {
		this.originator = originator;
		this.backup = this.originator.createMemento();
	}

	@Override
	public void execute() {
		Random rand = new Random();
		Shape shape = new Shape(Color.values()[rand.nextInt(4)], rand.nextInt(100), rand.nextInt(500));
		this.originator.setState(shape);
	}

	@Override
	public void undo() {
		if (this.backup != null) {
			this.originator.restoreMemento(this.backup);
		}
	}

}
