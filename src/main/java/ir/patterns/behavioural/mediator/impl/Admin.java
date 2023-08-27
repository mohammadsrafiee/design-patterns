package ir.patterns.behavioural.mediator.impl;

public class Admin extends TeamMember {

	public Admin(INotificationHub notificationHub, String name) {
		super(notificationHub);
		setName(name);
	}

	@Override
	public String toString() {
		return String.format("%10s", getName()).concat(" (Admin)");
	}

}
