package ir.patterns.behavioral.chain.of.responsibility.impl;

/**
 * {@link LogMessage} class is used to store information about the log message:
 * its log level and the message text. It also provides a public
 * getFormattedMessage() method to format the log entry as a Widget object (for
 * that, a private helper method getLogEntryColor() and a getter logLevelString
 * are used).
 */
public class LogMessage {

    public enum LogLevel {
        DEBUG,
        INFO,
        ERROR,
        ;
    }

    private final LogLevel logLevel;
    private final String message;

    public LogMessage(LogLevel logLevel, String message) {
        this.logLevel = logLevel;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

}
