package ir.patterns.behavioural.mediator.impl;

public class Developer extends TeamMember {

	public Developer(INotificationHub notificationHub, String name) {
		super(notificationHub);
		setName(name);
	}

	@Override
	public String toString() {
		return String.format("%10s", getName()).concat(" (Developer)");
	}
}
