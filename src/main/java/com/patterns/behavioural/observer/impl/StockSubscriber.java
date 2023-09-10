package com.patterns.behavioural.observer.impl;

import java.util.UUID;

/**
 *
 */
public abstract class StockSubscriber {

    private String title;
    private String id;

    /**
     *
     */
    public StockSubscriber() {
        this.setId(UUID.randomUUID().toString());
    }

    /**
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param stock
     */
    public abstract void update(Stock stock);

}
