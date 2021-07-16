package com.GreenJon902.TrashMC.graphics;


import com.GreenJon902.TrashMC.Logger.Logger;
import com.GreenJon902.TrashMC.TrashMC;

import javax.swing.*;

public class Window extends JFrame {
    private final static Logger LOGGER = new Logger(Window.class.getName());


    int fps = 1;

    public Window() {
        super("TrashMC");

        LOGGER.logDebug("Initializing Window");
        setSize(1080, 720);

        build();
        LOGGER.logInfo("Initialized Window");
    }

    private void build() {
        this.add(BlockRenderer.canvas);
        LOGGER.logDebug("Built");
    }

    public void open() {
        LOGGER.logDebug("Opening Window");
        setVisible(true);
        this.mainLoop();
    }

    public void mainLoop() {
        long fpns = fps * 1000000000L;

        long lastTime = System.nanoTime();
        long time;
        long dTime;

        //noinspection InfiniteLoopStatement
        while (true) {
            time = System.nanoTime();
            dTime = time - lastTime;

            if (dTime > fpns) {
                lastTime = time;
                BlockRenderer.draw();
            }
        }
    }
}
