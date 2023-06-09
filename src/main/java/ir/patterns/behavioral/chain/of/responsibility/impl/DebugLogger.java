package ir.patterns.behavioral.chain.of.responsibility.impl;

import ir.patterns.behavioral.chain.of.responsibility.impl.LogMessage.LogLevel;

public class DebugLogger extends LoggerBase {

	private LogBloc logBloc;

	public DebugLogger(LogBloc logBloc, LoggerBase nextLogger) {
		super(LogLevel.DEBUG, nextLogger);
		this.logBloc = logBloc;
	}

	@Override
	public void log(String message) {
		this.logBloc.log(new LogMessage(logLevel, message));
	}

}
