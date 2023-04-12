package ir.patterns.behavioral.observer;

import ir.patterns.behavioral.observer.impl.DefaultStockSubscriber;
import ir.patterns.behavioral.observer.impl.GameStopStockTicker;
import ir.patterns.behavioral.observer.impl.GoogleStockTicker;
import ir.patterns.behavioral.observer.impl.GrowingStockSubscriber;
import ir.patterns.behavioral.observer.impl.TeslaStockTiker;

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