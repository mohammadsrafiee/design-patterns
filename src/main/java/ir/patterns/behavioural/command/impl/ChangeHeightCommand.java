package ir.patterns.behavioural.command.impl;

import java.util.Random;

/**
 * ChangeHeightCommand is a specific implementation of the {@link ICommand}
 * which changes the height of the {@link Shape} object.
 */
public class ChangeHeightCommand implements ICommand {

	private Shape shape;
	private int previuos;

	public ChangeHeightCommand(Shape shape) {
		this.shape = shape;
		this.previuos = this.shape.getHeight();
	}

	@Override
	public void execute() {
		Random random = new Random();
		this.shape.setHeight(random.nextInt(1000));
	}

	@Override
	public void undo() {
		this.shape.setHeight(this.previuos);
	}

	@Override
	public String getTitle() {
		return "Change Height";
	}

}
