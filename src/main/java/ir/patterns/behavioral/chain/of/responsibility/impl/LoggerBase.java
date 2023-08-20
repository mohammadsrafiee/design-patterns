package ir.patterns.behavioral.chain.of.responsibility.impl;

import ir.patterns.behavioral.chain.of.responsibility.impl.LogMessage.LogLevel;

/**
 * {@link LoggerBase} is an abstract class which is used as a base class for all
 * the specific loggers. Also, the LoggerBase contains a reference to the next
 * logger (nextLogger) and logger's log level (logLevel).
 * 
 * {@link DebugLogger}, {@link InfoLogger} and {@link ErrorLogger} are concrete
 * logger classes which extend the LoggerBase class and implement the abstract
 * log() method. InfoLogger uses the {@link ExternalLoggingService} to log
 * messages, {@link ErrorLogger} - the {@link MailService}.
 */
public abstract class LoggerBase {

	protected final LogLevel logLevel;
	protected final LoggerBase nextLogger;

	public LoggerBase(LogLevel logLevel, LoggerBase nextLogger) {
		this.logLevel = logLevel;
		this.nextLogger = nextLogger;
	}

	/**
	 * logMessage() logs message using the log() method and passes the request along
	 * the chain
	 * 
	 * @param level
	 * @param message
	 */
	protected void logMessage(LogLevel level, String message) {
		if (logLevel.ordinal() <= level.ordinal()) {
			log(message);
		}
		if (this.nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	/**
	 * logDebug() logs the message with a log level of Debug
	 * 
	 * @param message
	 */
	public void logDebug(String message) {
		logMessage(LogLevel.DEBUG, message);
	}

	/**
	 * logInfo() logs the message with a log level of Info
	 * 
	 * @param message
	 */
	public void logInfo(String message) {
		logMessage(LogLevel.INFO, message);
	}

	/**
	 * logError() logs the message with a log level of Error.
	 * 
	 * @param message
	 */
	public void logError(String message) {
		logMessage(LogLevel.ERROR, message);
	}

	/**
	 * log() is an abstract method to log the message (must be implemented by
	 * specific logger)
	 * 
	 * @param message
	 */
	public abstract void log(String message);

}
