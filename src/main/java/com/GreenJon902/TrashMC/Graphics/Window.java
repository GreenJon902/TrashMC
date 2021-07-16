package com.GreenJon902.TrashMC.Graphics;


import javax.swing.*;

public class Window extends JFrame {
    int fps = 1;

    final BlockRenderer blockRenderer = new BlockRenderer(); // Because i cant use a static version


    public Window() {
        super("TrashMC");
        setSize(1080, 720);

        build();
    }

    private void build() {
        this.add(this.blockRenderer);
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
                //BlockRenderer.draw(this.getGraphics());
            }
        }
    }
}
