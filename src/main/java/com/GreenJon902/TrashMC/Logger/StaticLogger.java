package com.GreenJon902.TrashMC.Logger;

public class StaticLogger {
    private static final Logger baseLogger = new Logger();


    @SafeVarargs
    public static <T>void logDebug(T... items) {
        baseLogger.logDebug(items);
    }

    @SafeVarargs
    public static <T>void logInfo(T... items) {
        baseLogger.logDebug(items);
    }

    @SafeVarargs
    public static <T>void logWarning(T... items) {
        baseLogger.logDebug(items);
    }

    @SafeVarargs
    public static <T>void logError(T... items) {
        baseLogger.logDebug(items);
    }

    @SafeVarargs
    public static <T>void logCritical(T... items) {
        baseLogger.logDebug(items);
    }
}
