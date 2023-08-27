package ir.patterns.behavioural.observer;

import ir.patterns.behavioural.observer.impl.*;

/**
 * Observer is a behavioral design pattern that allows some objects to
 * notify other objects about changes in their state.
 * The Observer pattern provides a way to subscribe and unsubscribe to and
 * from these events for any object that implements a subscriber interface.
 */
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