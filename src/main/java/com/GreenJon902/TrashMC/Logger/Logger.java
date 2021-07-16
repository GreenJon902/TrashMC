package com.GreenJon902.TrashMC.Logger;

import java.util.Locale;

public class Logger {
    String name;

    public Logger(String name) {
        this.name = name;
    }

    public Logger() {
        this.name = "None";
    }

    @SafeVarargs
    public final <T>void logDebug(T... items) {
        log(Levels.DEBUG, items);
    }

    @SafeVarargs
    public final <T>void logInfo(T... items) {
        log(Levels.INFO, items);
    }

    @SafeVarargs
    public final <T>void logWarning(T... items) {
        log(Levels.WARNING, items);
    }

    @SafeVarargs
    public final <T>void logError(T... items) {
        log(Levels.ERROR, items);
    }

    @SafeVarargs
    public final <T>void logCritical(T... items) {
        log(Levels.CRITICAL, items);
    }


    private <T>void log(int levelNo, T[] items) {
        StringBuilder stringBuilder = new StringBuilder();

        for (T item : items) {
            stringBuilder.append(item.toString());
            stringBuilder.append(" ");
        }

        _log(levelNo, stringBuilder.toString());

    }

    private void _log(int levelNo, String string) {
        System.out.printf("[%-8s]  [%-64s]   %s%n", Levels.name(levelNo).toUpperCase(Locale.ROOT), name, string);
    }

}
