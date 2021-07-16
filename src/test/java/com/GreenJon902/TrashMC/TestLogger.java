package com.GreenJon902.TrashMC;

import com.GreenJon902.TrashMC.Logger.Logger;
import com.GreenJon902.TrashMC.Logger.StaticLogger;
import org.junit.jupiter.api.Test;

public class TestLogger {
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
    public void testLogger() {
        Logger l = new Logger();

        l.logInfo("Logger here");
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
    public void testLoggerWithName() {
        Logger l = new Logger("Dave");

        l.logInfo("Logger with a name here");
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

}
