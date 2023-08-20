package ir.patterns.behavioral.observer.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import ir.patterns.behavioral.observer.impl.Stock.StockChangeDirection;
import ir.patterns.behavioral.observer.impl.Stock.StockTickerSymbol;

/**
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependents are notified and updated automatically.
 */
public abstract class StockTicker {

    private Stock stock;
    private String title;
    private List<StockSubscriber> subscribers;

    public StockTicker() {

    }

    /**
     * subscribe to the stock ticker.
     */
    public void subscribe(StockSubscriber subscriber) {
        if (subscribers == null)
            this.subscribers = new ArrayList<>();
        this.subscribers.add(subscriber);
    }

    /**
     * unsubscribe from the stock ticker.
     */
    public void unsubscribe(StockSubscriber subscriber) {
        StockSubscriber stockSubscriber = null;
        for (StockSubscriber sub : subscribers) {
            if (Objects.equals(sub.getId(), subscriber.getId())) {
                stockSubscriber = sub;
            }
        }

        if (stockSubscriber != null) {
            this.subscribers.remove(stockSubscriber);
        }
    }

    /**
     * notifies subscribers about the stock change
     */
    public void notifySubscribers() {
        for (StockSubscriber stockSubscriber : subscribers) {
            stockSubscriber.update(stock);
        }
    }

    ;

    /**
     * sets stock value
     */
    public void setStock(StockTickerSymbol symbol, int min, int max) {
        Stock lastStock = stock;
        Random rand = new Random();
        double price = (rand.nextInt(max - min + 1) + min) / 100;
        double changeAmount = price - (lastStock != null ? lastStock.getPrice() : 0);
        this.stock = new Stock(symbol, price, Math.abs(changeAmount),
                (changeAmount >= 0 ? StockChangeDirection.growing : StockChangeDirection.falling));
    }

    ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

}
