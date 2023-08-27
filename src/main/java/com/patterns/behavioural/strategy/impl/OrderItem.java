package com.patterns.behavioural.strategy.impl;

import java.nio.charset.Charset;
import java.util.Random;

public class OrderItem {

	private String title;
	private double price;
	private PackageSize packageSize;

	public enum PackageSize {
		S, M, L, XL,
	}

	public OrderItem() {
		byte[] name = new byte[10];
		Random rand = new Random();
		rand.nextBytes(name);
		this.setTitle(new String(name, Charset.defaultCharset()));
		this.setPrice(rand.nextInt(101));
		this.setPackageSize(PackageSize.values()[rand.nextInt(4)]);
	}

	public OrderItem(String title, double price, PackageSize packageSize) {
		this.setTitle(title);
		this.setPrice(price);
		this.setPackageSize(packageSize);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PackageSize getPackageSize() {
		return packageSize;

	}

	public void setPackageSize(PackageSize packageSize) {
		this.packageSize = packageSize;

	}
}
