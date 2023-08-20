package ir.patterns.behavioral.chain.of.responsibility.impl;

import ir.patterns.behavioral.chain.of.responsibility.impl.LogMessage.LogLevel;

public class ErrorLogger extends LoggerBase {

    private final MailService mailService;

    public ErrorLogger(LogBloc logBloc, LoggerBase nextLogger) {
        super(LogLevel.ERROR, nextLogger);
        this.mailService = new MailService(logBloc);
    }

    @Override
    public void log(String message) {
        this.mailService.sendErrorMail(logLevel, message);
    }

}
