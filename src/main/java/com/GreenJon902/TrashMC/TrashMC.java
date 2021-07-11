package com.GreenJon902.TrashMC;


import java.util.logging.Logger;

public class TrashMC {
    private static final Logger LOGGER = Logger.getLogger(TrashMC.class.getName());

    static void setup() {
        System.setProperty("java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-7s] %5$s %n");
    }


    public static void main(String[] args) {
        LOGGER.info("TrashMC Setting up");

        setup();

        LOGGER.info("TrashMC Starting");
        LOGGER.info("TrashMC Finished");
    }
}
