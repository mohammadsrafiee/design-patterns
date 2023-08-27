package ir.patterns.behavioural.memento.impl;

/**
 * This is a class that acts as a snapshot of the originator's internal state
 * which is stored in the state property and returned via the getState()
 * {@link Memento#getState()} method.
 */
public class Memento extends IMemento {

	private Shape state;

	public Memento(Shape shape) {
		this.state = new Shape(shape.getColor(), shape.getHeight(), shape.getWidth());
	}

	public Shape getState() {
		return state;

	}

}
