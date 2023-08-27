package ir.patterns.behavioural.command.impl;

import java.util.Random;

/**
 * ChangeWidthCommand is a specific implementation of the {@link ICommand} which
 * changes the width of the {@link Shape} object.
 */
public class ChangeWidthCommand implements ICommand {

	private Shape shape;
	private int previuos;

	public ChangeWidthCommand(Shape shape) {
		this.shape = shape;
		this.previuos = this.shape.getWidth();
	}

	@Override
	public void execute() {
		Random random = new Random();
		this.shape.setWidth(random.nextInt(2000));
	}

	@Override
	public void undo() {
		this.shape.setHeight(this.previuos);
	}

	@Override
	public String getTitle() {
		return "Change Width";
	}

}
