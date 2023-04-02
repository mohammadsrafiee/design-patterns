package ir.patterns.bihavioral.strategy;

import ir.patterns.bihavioral.strategy.impl.InStorePickupStrategy;
import ir.patterns.bihavioral.strategy.impl.Order;
import ir.patterns.bihavioral.strategy.impl.OrderItem;
import ir.patterns.bihavioral.strategy.impl.ParcelTerminalShippingStrategy;
import ir.patterns.bihavioral.strategy.impl.PriorityShippingStrategy;

public class StrategyExample {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
		order.addOrder(new OrderItem());
	
		double orderPrice = order.getPrice();
		System.out.println(orderPrice+ (new ParcelTerminalShippingStrategy()).calculate(order));
		System.out.println(orderPrice+ (new InStorePickupStrategy()).calculate(order));
		System.out.println(orderPrice+ (new PriorityShippingStrategy()).calculate(order));
		

	}
}
