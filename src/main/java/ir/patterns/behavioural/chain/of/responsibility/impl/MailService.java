package ir.patterns.behavioural.chain.of.responsibility.impl;

import ir.patterns.behavioural.chain.of.responsibility.impl.LogMessage.LogLevel;

public class MailService {
	private LogBloc logBloc;

	public MailService(LogBloc logBloc) {
		this.logBloc = logBloc;
	}

	public void sendErrorMail(LogLevel logLevel, String message) {
		LogMessage logMessage = new LogMessage(logLevel, message);
		// Send error mail
		// Log message
		logBloc.log(logMessage);
	}
}
