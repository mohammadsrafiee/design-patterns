package ir.patterns.behavioral.chain.of.responsibility.impl;

import ir.patterns.behavioral.chain.of.responsibility.impl.LogMessage.LogLevel;

public class InfoLogger extends LoggerBase {

	private final ExternalLoggingService loggingService;

	public InfoLogger(LogBloc logBloc, LoggerBase nextLogger) {
		super(LogLevel.INFO, nextLogger);
		this.loggingService = new ExternalLoggingService(logBloc);
	}

	@Override
	public void log(String message) {
		this.loggingService.logMessage(logLevel, message);
	}

}
