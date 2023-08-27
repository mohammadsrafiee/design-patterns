package ir.patterns.behavioural.memento.impl;

/**
 * This class is a simple class which contains its internal state and stores the
 * snapshot of it to the Memento object using the
 * {@link Originator#createMemento()} method. Also, the originator's state could
 * be restored from the provided Memento object using the
 * {@link Originator#restoreMemento(IMemento)} method.
 */
public class Originator {

	private Shape state;

	public Originator() {
		this.setState(new Shape());
	}

	/**
	 * create a backup from current state
	 * 
	 * @return {@link Memento} has a backup of state
	 */
	public IMemento createMemento() {
		return new Memento(this.getState());
	}

	/**
	 * restore of previous shape state
	 * 
	 * @param memento
	 */
	public void restoreMemento(IMemento memento) {
		setState(memento.getState());
	}

	public Shape getState() {
		return state;
	}

	public void setState(Shape state) {
		this.state = state;
	};
}
