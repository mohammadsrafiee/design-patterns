package com.patterns.behavioural.chain.of.responsibility.impl;

public class ExternalLoggingService {

	private final LogBloc logBloc;

	public ExternalLoggingService(LogBloc logBloc) {
		this.logBloc = logBloc;
	}

	public void logMessage(LogMessage.LogLevel logLevel, String message) {
		LogMessage logMessage = new LogMessage(logLevel, message);
		// Send log message to the external logging service
		// Log message
		this.logBloc.log(logMessage);
	}
}
