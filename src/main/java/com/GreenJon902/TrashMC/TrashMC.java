package com.GreenJon902.TrashMC;


import com.GreenJon902.TrashMC.Logger.ClassLogger;
import com.GreenJon902.TrashMC.graphics.Window;


public class TrashMC extends ClassLogger {

    public static Boolean running = false;

    private static Window window;

    public static void setup() {
        logInfo("TrashMC Setting up");
        window = new Window();
        logInfo("TrashMC Set up");
    }


    public static void start() {
        if (running) {
            throw new RuntimeException("Cannot start TrashMC if it is already running");
        }

        running = true;

        setup();

        logInfo("TrashMC Starting");
        window.open();
        logInfo("TrashMC Finished");
    }

    public static void main(String[] args) {
        setup();
        start();
    }
}
