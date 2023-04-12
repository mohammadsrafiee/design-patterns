package ir.patterns.behavioral.strategy.impl;

public class InStorePickupStrategy extends IShippingCostsStrategy {

	public InStorePickupStrategy() {
		super.setTitle("In-Store Pickup");
	}

	@Override
	public double calculate(Order order) {
		return 0d;
	}

}
