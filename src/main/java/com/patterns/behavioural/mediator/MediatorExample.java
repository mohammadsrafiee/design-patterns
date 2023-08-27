package com.patterns.behavioural.mediator;

import com.patterns.behavioural.mediator.impl.Admin;
import com.patterns.behavioural.mediator.impl.Developer;
import com.patterns.behavioural.mediator.impl.TeamNotificationHub;
import com.patterns.behavioural.mediator.impl.Tester;

/**
 * Mediator is a behavioral design pattern that reduces coupling between
 * components of a program by making them communicate indirectly, through a special mediator object.
 * The Mediator makes it easy to modify, extend and reuse individual components because
 * they’re no longer dependent on the dozens of other classes.
 */
public class MediatorExample {

	public static void main(String[] args) {

		TeamNotificationHub notificationHub = new TeamNotificationHub();
		Admin admin = new Admin(notificationHub, "God");
		notificationHub.register(new Developer(notificationHub, "Sea Sharp"));
		notificationHub.register(new Developer(notificationHub, "Jan Assembler"));
		notificationHub.register(new Developer(notificationHub, "Dove Dart"));
		notificationHub.register(new Tester(notificationHub, "Cori Debugger"));
		notificationHub.register(new Tester(notificationHub, "Tania Mocha"));
		notificationHub.register(admin);

		admin.send("Hello!");
		admin.sendTo("BUG!", Tester.class);
		admin.sendTo("Hello, World!", Developer.class);

	}
}
