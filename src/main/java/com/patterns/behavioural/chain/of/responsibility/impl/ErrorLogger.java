package com.patterns.behavioural.chain.of.responsibility.impl;

public class ErrorLogger extends LoggerBase {

    private final MailService mailService;

    public ErrorLogger(LogBloc logBloc, LoggerBase nextLogger) {
        super(LogMessage.LogLevel.ERROR, nextLogger);
        this.mailService = new MailService(logBloc);
    }

    @Override
    public void log(String message) {
        this.mailService.sendErrorMail(logLevel, message);
    }

}
