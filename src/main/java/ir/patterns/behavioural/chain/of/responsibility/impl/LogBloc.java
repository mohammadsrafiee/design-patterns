package ir.patterns.behavioural.chain.of.responsibility.impl;

/**
 * {@link LogBloc} stores a list of logs and exposes them through the stream
 * outLogStream. Also, it defines the log() method to add a new log to the list
 * and notify outLogStream subscribers with an updated log entries list.
 * 
 * A Business Logic component (BLoC) class to store log messages and provide
 * them to the UI through a public stream. New log entries are added to the logs
 * list via the log() method while all the logs could be accessed through the
 * public outLogStream.
 */
public class LogBloc {

	void log(LogMessage message) {
		String buffer = "[" + message.getLogLevel().name() + "] : " +
				message.getMessage();
		System.out.println(buffer);
	}
}
