package ir.patterns.behavioral.command.impl;

import java.util.Random;

import ir.patterns.behavioral.command.impl.Shape.Color;

/**
 * ChangeColorCommand is a specific implementation of the {@link ICommand} which changes
 * the color of the {@link Shape} object.
 */
public class ChangeColorCommand implements ICommand {

	private Shape shape;
	private Color previuos;
	
	public ChangeColorCommand(Shape shape) {
		this.shape = shape;
		this.previuos = this.shape.getColor();
	}

	@Override
	public void execute() {
		Random random = new Random();
		this.shape.setColor(Color.values()[random.nextInt(4)]);
	}

	@Override
	public void undo() {
		this.shape.setColor(this.previuos);
	}

	@Override
	public String getTitle() {
		return "Change Color";
	}

}
