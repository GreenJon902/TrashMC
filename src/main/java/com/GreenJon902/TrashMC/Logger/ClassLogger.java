package com.GreenJon902.TrashMC.Logger;


public class ClassLogger {
    private static final BaseLogger baseLogger = new BaseLogger(ClassLogger.class.getName());


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
