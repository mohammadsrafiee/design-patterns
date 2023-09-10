package com.patterns.behavioural.command.impl;

import java.util.Random;

/**
 * ChangeWidthCommand is a specific implementation of the {@link ICommand} which
 * changes the width of the {@link Shape} object.
 */
public class ChangeWidthCommand implements ICommand {

    private final Shape shape;
    private final int previous;

    /**
     * @param shape
     */
    public ChangeWidthCommand(Shape shape) {
        this.shape = shape;
        this.previous = this.shape.getWidth();
    }

    @Override
    public void execute() {
        Random random = new Random();
        this.shape.setWidth(random.nextInt(2000));
    }

    @Override
    public void undo() {
        this.shape.setHeight(this.previous);
    }

    @Override
    public String getTitle() {
        return "Change Width";
    }

}
