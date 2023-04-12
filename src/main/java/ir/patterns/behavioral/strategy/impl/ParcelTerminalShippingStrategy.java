package ir.patterns.behavioral.strategy.impl;

public class ParcelTerminalShippingStrategy extends IShippingCostsStrategy {

	public ParcelTerminalShippingStrategy() {
		super.setTitle("Parcel-Terminal-Shipping");
	}

	@Override
	public double calculate(Order order) {
		double result = 0d;
		if (order != null && order.getItems() != null) {
			for (OrderItem item : order.getItems()) {
				result += getOrderItemPrice(item);
			}
		}
		return result;
	}

	private double getOrderItemPrice(OrderItem item) {
		double result = 0;
		switch (item.getPackageSize()) {
			case S:
				result = 2.1;
				break;
			case M:
				result = 2.5;
				break;
			case L:
				result = 2.9;
				break;
			case XL:
				result = 3.5;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + item.getPackageSize());
		}
		return result;
	}


}
