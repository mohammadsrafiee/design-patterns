package ir.patterns.behavioural.observer.impl;

import java.util.UUID;

public abstract class StockSubscriber {

	private String title;
	private String id;

	public StockSubscriber() {
		this.setId(UUID.randomUUID().toString());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public abstract void update(Stock stock);

}
