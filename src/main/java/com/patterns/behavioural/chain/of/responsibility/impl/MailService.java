package com.patterns.behavioural.chain.of.responsibility.impl;

public class MailService {
	private LogBloc logBloc;

	public MailService(LogBloc logBloc) {
		this.logBloc = logBloc;
	}

	public void sendErrorMail(LogMessage.LogLevel logLevel, String message) {
		LogMessage logMessage = new LogMessage(logLevel, message);
		// Send error mail
		// Log message
		logBloc.log(logMessage);
	}
}
