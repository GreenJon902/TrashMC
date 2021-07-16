package com.GreenJon902.TrashMC.graphics;


import javax.swing.*;

public class Window extends JFrame {
    int fps = 1;

    public Window() {
        super("TrashMC");
        setSize(1080, 720);

        build();
    }

    private void build() {
        this.add(BlockRenderer.canvas);
    }

    public void open() {
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
