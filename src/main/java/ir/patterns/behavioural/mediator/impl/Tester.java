package ir.patterns.behavioural.mediator.impl;

public class Tester extends TeamMember {

	public Tester(INotificationHub notificationHub, String name) {
		super(notificationHub);
		setName(name);
	}

	@Override
	public String toString() {
		return String.format("%10s", getName()).concat(" (QA)");
	}

}
