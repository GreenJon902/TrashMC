package com.GreenJon902.TrashMC;


import java.util.logging.Logger;

public class TrashMC {
    private static final Logger LOGGER = Logger.getLogger(TrashMC.class.getName());

    public static Boolean running = false;

    public static void setup() {
        Renderer r = new Renderer();
        r.start();
    }


    public static void start() {
        if (running) {
            throw new RuntimeException("Cannot start TrashMC if it is already running");
        }

        running = true;

        LOGGER.info("TrashMC Setting up");

        setup();

        LOGGER.info("TrashMC Starting");
        LOGGER.info("TrashMC Finished");
    }
}
