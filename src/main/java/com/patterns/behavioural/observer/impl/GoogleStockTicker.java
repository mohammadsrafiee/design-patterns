package com.patterns.behavioural.observer.impl;

import java.util.Timer;
import java.util.TimerTask;

import com.patterns.behavioural.observer.impl.Stock.StockTickerSymbol;

public class GoogleStockTicker extends StockTicker {
	public GoogleStockTicker() {
		super.setTitle(StockTickerSymbol.GOOGL.name());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				GoogleStockTicker.super.setStock(StockTickerSymbol.GOOGL, 10000, 12000);
				GoogleStockTicker.super.notifySubscribers();
			}
		}, 2000, 2000);
	}
}