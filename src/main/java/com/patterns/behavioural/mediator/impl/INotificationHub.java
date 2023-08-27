package com.patterns.behavioural.mediator.impl;

import java.util.List;

/**
 * Define an Object that capsulates how a set of objects interact. Mediator
 * promotes loose coupling by keeping objects from referring to each other
 * explicitly, and it lets you vary their interaction independently.
 * 
 * NotificationHub is an abstract class that is used as a base class for all the
 * specific notification hubs and defines several abstract methods
 * 
 */
public interface INotificationHub {

	/**
	 * 
	 * @return {@link TeamMember}
	 */
	List<TeamMember> getTeamMembers();

	/**
	 * registers a team member to the hub
	 * 
	 * @param member {@link TeamMember}
	 */
	void register(TeamMember member);

	/**
	 * sends a notification to registered team members
	 * 
	 * @param sender  {@link TeamMember}
	 * @param message {@link String}
	 */
	void send(TeamMember sender, String message);

	/**
	 * sends a notification to specific registered team members
	 * 
	 * @param <T>     {@link TeamMember}
	 * @param sender  {@link TeamMember}
	 * @param message {@link String}
	 * @param clazz   type of receiver message
	 */
	<T extends TeamMember> void sendTo(TeamMember sender, String message, Class<T> clazz);
}
