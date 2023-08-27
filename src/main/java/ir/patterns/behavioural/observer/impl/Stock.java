package ir.patterns.behavioural.observer.impl;

public class Stock {

	private StockTickerSymbol symbol;
	private double price;
	private double changeAmount;
	private StockChangeDirection changeDirection;

	public enum StockChangeDirection {
		growing, falling,;
	}

	public enum StockTickerSymbol {
		GME, GOOGL, TSLA,;
	}

	public Stock() {

	}

	public Stock(StockTickerSymbol symbol, double price, double changeAmount, StockChangeDirection changeDirection) {
		this.setSymbol(symbol);
		this.setPrice(price);
		this.setChangeAmount(changeAmount);
		this.setChangeDirection(changeDirection);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getChangeAmount() {
		return changeAmount;
	}

	public void setChangeAmount(double changeAmount) {
		this.changeAmount = changeAmount;
	}

	public StockChangeDirection getChangeDirection() {
		return changeDirection;

	}

	public void setChangeDirection(StockChangeDirection changeDirection) {
		this.changeDirection = changeDirection;

	}

	public StockTickerSymbol getSymbol() {
		return symbol;

	}

	public void setSymbol(StockTickerSymbol symbol) {
		this.symbol = symbol;

	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Symbol: ");
		buffer.append(this.getSymbol().name());
		buffer.append(" - ");
		buffer.append("direction: ");
		buffer.append(this.getChangeDirection().name());
		buffer.append(" - ");
		buffer.append("change-amount: ");
		buffer.append(this.getChangeAmount());
		buffer.append(" - ");
		buffer.append("price: ");
		buffer.append(this.getPrice());
		return buffer.toString();
	}
}
