package ir.patterns.behavioral.chain.of.responsibility.impl;

import ir.patterns.behavioral.chain.of.responsibility.impl.LogMessage.LogLevel;

public class ExternalLoggingService {

	private LogBloc logBloc;

	public ExternalLoggingService(LogBloc logBloc) {
		this.logBloc = logBloc;
	}

	public void logMessage(LogLevel logLevel, String message) {
		LogMessage logMessage = new LogMessage(logLevel, message);
		// Send log message to the external logging service
		// Log message
		this.logBloc.log(logMessage);
	}
}
