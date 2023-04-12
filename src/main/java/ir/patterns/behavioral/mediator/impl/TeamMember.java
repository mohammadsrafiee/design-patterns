package ir.patterns.behavioral.mediator.impl;

import java.util.StringJoiner;

/**
 * TeamMember is an abstract class that is used as a base class for all the
 * specific team member classes. The class contains name, lastNotification and
 * notificationHub properties, provides several methods.
 */
public class TeamMember {

	private String name;
	private String lastNotification;
	private INotificationHub notificationHub;

	public TeamMember(INotificationHub notificationHub) {
		this.setNotificationHub(notificationHub);
	}

	/**
	 * Receives the notification from the notification hub
	 * 
	 * @param from
	 * @param message
	 */
	public void recive(String from, String message) {
		StringJoiner joiner = new StringJoiner(" -> ");
		joiner.add(String.format("Recieved : (%10s) %15s", this.getClass().getSimpleName(), getName()));
		joiner.add(String.format("From : %10s", from));
		joiner.add(String.format("Message : %50s", message));
		this.setLastNotification(joiner.toString());
		// You can use Observer pattern for attach a printer listener
		System.out.println(this.lastNotification);
	}

	/**
	 * Sends a notification
	 * 
	 * @param message
	 */
	public void send(String message) {
		this.notificationHub.send(this, message);
	}

	/**
	 * Sends a notification to specific team members.
	 * 
	 * @param <T>     {@link TeamMember}
	 * @param message {@link String}
	 * @param type    receiver class type
	 */
	public <T extends TeamMember> void sendTo(String message, Class<T> type) {
		this.notificationHub.send(this, message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastNotification() {
		return lastNotification;
	}

	public void setLastNotification(String lastNotification) {
		this.lastNotification = lastNotification;
	}

	public INotificationHub getNotificationHub() {
		return notificationHub;
	}

	public void setNotificationHub(INotificationHub notificationHub) {
		this.notificationHub = notificationHub;
	}
}
