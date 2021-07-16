package com.GreenJon902.TrashMC;

import com.GreenJon902.TrashMC.Logger.BaseLogger;
import com.GreenJon902.TrashMC.Logger.ClassLogger;
import com.GreenJon902.TrashMC.Logger.StaticLogger;
import org.junit.jupiter.api.Test;

public class TestLogger extends ClassLogger {
    @Test
    public void testStaticLogger() {
        StaticLogger.logInfo("Static logger here");
        StaticLogger.logInfo("Lets join some objects");
        StaticLogger.logInfo("This should output 1, 2, true, \"hello\"");
        StaticLogger.logInfo(1, 2, true, "hello");

        StaticLogger.logInfo("Alright, now to try levels");
        StaticLogger.logDebug("debug");
        StaticLogger.logInfo("info");
        StaticLogger.logWarning("warning");
        StaticLogger.logError("error");
        StaticLogger.logCritical("critical");

        StaticLogger.logInfo("Well I hope that worked");
    }

    @Test
    public void testBaseLogger() {
        BaseLogger l = new BaseLogger();

        l.logInfo("Base logger here");
        l.logInfo("Lets join some objects");
        l.logInfo("This should output 1, 2, true, \"hello\"");
        l.logInfo(1, 2, true, "hello");

        l.logInfo("Alright, now to try levels");
        l.logDebug("debug");
        l.logInfo("info");
        l.logWarning("warning");
        l.logError("error");
        l.logCritical("critical");

        l.logInfo("Well I hope that worked");
    }

    @Test
    public void testBaseLoggerWithName() {
        BaseLogger l = new BaseLogger("Dave");

        l.logInfo("Base logger with a name here");
        l.logInfo("I'm called Dave");
        l.logInfo("Lets join some objects");
        l.logInfo("This should output 1, 2, true, \"hello\"");
        l.logInfo(1, 2, true, "hello");

        l.logInfo("Alright, now to try levels");
        l.logDebug("debug");
        l.logInfo("info");
        l.logWarning("warning");
        l.logError("error");
        l.logCritical("critical");

        l.logInfo("Well I hope that worked");
    }

    @Test
    public void testClassLogger() {
            logInfo("Class logger here");
        logInfo("Lets join some objects");
        logInfo("This should output 1, 2, true, \"hello\"");
        logInfo(1, 2, true, "hello");

        logInfo("Alright, now to try levels");
        logDebug("debug");
        logInfo("info");
        logWarning("warning");
        logError("error");
        logCritical("critical");

        logInfo("Well I hope that worked");
    }
}
