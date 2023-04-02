package ir.patterns.bihavioral.observer;

import ir.patterns.bihavioral.observer.impl.DefaultStockSubscriber;
import ir.patterns.bihavioral.observer.impl.GameStopStockTicker;
import ir.patterns.bihavioral.observer.impl.GoogleStockTicker;
import ir.patterns.bihavioral.observer.impl.GrowingStockSubscriber;
import ir.patterns.bihavioral.observer.impl.TeslaStockTiker;

public class ObserverExample {

	public static void main(String[] args) {

		DefaultStockSubscriber defaultStockSubscriber = new DefaultStockSubscriber();
		GrowingStockSubscriber growingStockSubscriber = new GrowingStockSubscriber();

		GameStopStockTicker gameStopStockTicker = new GameStopStockTicker();
		TeslaStockTiker teslaStockTiker = new TeslaStockTiker();
		GoogleStockTicker googleStockTicker = new GoogleStockTicker();
		
		gameStopStockTicker.subscribe(growingStockSubscriber);
		teslaStockTiker.subscribe(growingStockSubscriber);
		googleStockTicker.subscribe(growingStockSubscriber);
		
		gameStopStockTicker.subscribe(defaultStockSubscriber);
		teslaStockTiker.subscribe(defaultStockSubscriber);
		googleStockTicker.subscribe(defaultStockSubscriber);
	}

}