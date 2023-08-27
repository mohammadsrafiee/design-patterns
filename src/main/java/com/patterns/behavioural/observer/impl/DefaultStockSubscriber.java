package com.patterns.behavioural.observer.impl;

public class DefaultStockSubscriber extends StockSubscriber {

	public DefaultStockSubscriber() {
		this.setTitle("All Stock Subscriber");
	}

	@Override
	public void update(Stock stock) {
		if (stock != null) {
			System.out.println(stock.toString());
		}
	}

}
