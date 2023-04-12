package ir.patterns.behavioral.observer.impl;

import java.util.Timer;
import java.util.TimerTask;

import ir.patterns.behavioral.observer.impl.Stock.StockTickerSymbol;

public class GameStopStockTicker extends StockTicker {
	public GameStopStockTicker() {
		super.setTitle(StockTickerSymbol.GME.name());
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				GameStopStockTicker.super.setStock(StockTickerSymbol.GME, 9000, 10000);
				GameStopStockTicker.super.notifySubscribers();
			}
		}, 2000, 3000);
	}
}
