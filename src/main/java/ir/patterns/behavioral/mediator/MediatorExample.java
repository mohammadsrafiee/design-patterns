package ir.patterns.behavioral.mediator;

import ir.patterns.behavioral.mediator.impl.Admin;
import ir.patterns.behavioral.mediator.impl.Developer;
import ir.patterns.behavioral.mediator.impl.TeamNotificationHub;
import ir.patterns.behavioral.mediator.impl.Tester;

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
