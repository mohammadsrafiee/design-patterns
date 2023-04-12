package ir.patterns.behavioral.chain.of.responsibility;

import ir.patterns.behavioral.chain.of.responsibility.impl.DebugLogger;
import ir.patterns.behavioral.chain.of.responsibility.impl.ErrorLogger;
import ir.patterns.behavioral.chain.of.responsibility.impl.InfoLogger;
import ir.patterns.behavioral.chain.of.responsibility.impl.LogBloc;
import ir.patterns.behavioral.chain.of.responsibility.impl.LoggerBase;

public class ChainOfResponsibilityExample {

	public static void main(String[] args) {
		LogBloc logBloc = new LogBloc();
		LoggerBase logger = new DebugLogger(logBloc, //
				new InfoLogger(logBloc, //
						new ErrorLogger(logBloc, //
								null)));

		logger.logDebug("This is a debug message");
		System.out.println("---------------------------------");
		logger.logInfo("This is a info message");
		System.out.println("---------------------------------");
		logger.logDebug("This is a debug message");
		System.out.println("---------------------------------");
		logger.logError("This is a error message");
		System.out.println("---------------------------------");
	}
}
