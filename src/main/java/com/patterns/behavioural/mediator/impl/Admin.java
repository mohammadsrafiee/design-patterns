package com.patterns.behavioural.mediator.impl;

/**
 *
 */
public class Admin extends TeamMember {

	/**
	 *
	 * @param notificationHub
	 * @param name
	 */
	public Admin(INotificationHub notificationHub, String name) {
		super(notificationHub);
		setName(name);
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public String toString() {
		return String.format("%10s", getName()).concat(" (Admin)");
	}

}
