package com.patterns.behavioural.command.impl;

import java.util.Random;

/**
 * ChangeHeightCommand is a specific implementation of the {@link ICommand}
 * which changes the height of the {@link Shape} object.
 */
public class ChangeHeightCommand implements ICommand {

    private final Shape shape;
    private final int previous;

    /**
     * @param shape
     */
    public ChangeHeightCommand(Shape shape) {
        this.shape = shape;
        this.previous = this.shape.getHeight();
    }

    @Override
    public void execute() {
        Random random = new Random();
        this.shape.setHeight(random.nextInt(1000));
    }

    @Override
    public void undo() {
        this.shape.setHeight(this.previous);
    }

    @Override
    public String getTitle() {
        return "Change Height";
    }

}
