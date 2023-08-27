package com.patterns.behavioural.chain.of.responsibility.impl;

public class DebugLogger extends LoggerBase {

	private final LogBloc logBloc;

	public DebugLogger(LogBloc logBloc, LoggerBase nextLogger) {
		super(LogMessage.LogLevel.DEBUG, nextLogger);
		this.logBloc = logBloc;
	}

	@Override
	public void log(String message) {
		this.logBloc.log(new LogMessage(logLevel, message));
	}

}
