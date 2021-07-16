package com.GreenJon902.TrashMC;


import com.GreenJon902.TrashMC.Logger.Logger;
import com.GreenJon902.TrashMC.graphics.Window;


public class TrashMC {
    private final static Logger LOGGER = new Logger(TrashMC.class.getName());


    public static Boolean running = false;

    private static Window window;

    public static void setup() {
        LOGGER.logInfo("TrashMC Setting up");
        window = new Window();
        LOGGER.logInfo("TrashMC Set up");
    }


    public static void start() {
        if (running) {
            throw new RuntimeException("Cannot start TrashMC if it is already running");
        }

        running = true;

        setup();

        LOGGER.logInfo("TrashMC Starting");
        window.open();
        LOGGER.logInfo("TrashMC Finished");
    }

    public static void main(String[] args) {
        setup();
        start();
    }
}
