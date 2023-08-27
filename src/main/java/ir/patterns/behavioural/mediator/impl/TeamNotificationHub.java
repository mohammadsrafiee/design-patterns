package ir.patterns.behavioural.mediator.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * TeamNotificationHub is a concrete notification hub that extends the abstract
 * class NotificationHub and implements its abstract methods. Also, this class
 * contain a list of registered team members - teamMembers.
 */
public class TeamNotificationHub implements INotificationHub {

	private List<TeamMember> members;

	public TeamNotificationHub() {
		this.members = new ArrayList<>();
	}

	@Override
	public List<TeamMember> getTeamMembers() {
		return this.members;
	}

	@Override
	public void register(TeamMember member) {
		if (member != null) {
			this.members.add(member);
		}
	}

	@Override
	public void send(TeamMember sender, String message) {
		for (TeamMember member : members) {
			if (!Objects.equals(member, sender)) {
				member.recive(sender.toString(), message);
			}
		}
	}

	@Override
	public <T extends TeamMember> void sendTo(TeamMember sender, String message, Class<T> clazz) {
		for (TeamMember member : members) {
			if (member.getClass().equals(clazz)) {
				if (!Objects.equals(member, sender)) {
					member.recive(sender.toString(), message);
				}
			}
		}
	}

}
