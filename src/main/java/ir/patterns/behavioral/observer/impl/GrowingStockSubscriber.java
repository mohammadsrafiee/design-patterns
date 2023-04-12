package ir.patterns.behavioral.observer.impl;

import ir.patterns.behavioral.observer.impl.Stock.StockChangeDirection;

public class GrowingStockSubscriber extends StockSubscriber {

	public GrowingStockSubscriber() {
		this.setTitle("Growing Stock Subscriber");
	}

	@Override
	public void update(Stock stock) {
		if (stock != null && stock.getChangeDirection() == StockChangeDirection.growing) {
			System.out.println(stock.toString());
		}
	}

}
