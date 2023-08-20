package ir.patterns.behavioral.strategy.impl;

/**
 * Define a family of algorithms, encapsulate each one, and make them
 * interchangeable. Strategy lets the algorithms vary independently from clients
 * that use it.
 * 
 */
public abstract class IShippingCostsStrategy {

	private String title;

	abstract double calculate(Order order);

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
