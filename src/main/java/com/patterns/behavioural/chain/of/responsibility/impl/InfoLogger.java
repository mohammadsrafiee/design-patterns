package com.patterns.behavioural.chain.of.responsibility.impl;

public class InfoLogger extends LoggerBase {

	private final ExternalLoggingService loggingService;

	public InfoLogger(LogBloc logBloc, LoggerBase nextLogger) {
		super(LogMessage.LogLevel.INFO, nextLogger);
		this.loggingService = new ExternalLoggingService(logBloc);
	}

	@Override
	public void log(String message) {
		this.loggingService.logMessage(logLevel, message);
	}

}
