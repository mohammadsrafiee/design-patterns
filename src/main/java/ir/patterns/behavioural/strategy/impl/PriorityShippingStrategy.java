package ir.patterns.behavioural.strategy.impl;

public class PriorityShippingStrategy extends IShippingCostsStrategy {

	public PriorityShippingStrategy() {
		super.setTitle("Priority-Shipping");
	}

	@Override
	public double calculate(Order order) {
		return 9.9;
	}

}
