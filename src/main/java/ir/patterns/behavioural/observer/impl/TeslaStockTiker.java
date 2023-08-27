package ir.patterns.behavioural.observer.impl;

import java.util.Timer;
import java.util.TimerTask;

import ir.patterns.behavioural.observer.impl.Stock.StockTickerSymbol;

public class TeslaStockTiker extends StockTicker {
	public TeslaStockTiker() {
		super.setTitle(StockTickerSymbol.TSLA.name());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				TeslaStockTiker.super.setStock(StockTickerSymbol.TSLA, 7000, 7500);
				TeslaStockTiker.super.notifySubscribers();
			}
		}, 2000, 5000);
	}
}
