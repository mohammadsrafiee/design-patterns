package ir.patterns.behavioral.strategy.impl;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<OrderItem> items;
	private double price;

	public Order() {
	}

	public void addOrder(OrderItem item) {
		if (getItems() == null)
			setItems(new ArrayList<>());
		getItems().add(item);
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	public double getPrice() {
		this.price = 0;
		if (getItems() != null) {
			for (OrderItem orderItem : items) {
				price += orderItem.getPrice();
			}
		}
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
