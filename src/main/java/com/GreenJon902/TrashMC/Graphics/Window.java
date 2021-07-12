package com.GreenJon902.TrashMC.Graphics;

import javax.swing.*;

public class Window extends JFrame {
    int fps = 1;

    BlockRenderer blockRenderer = new BlockRenderer();


    public Window() {
        super("TrashMC");
        setSize(300, 80);

        build();
    }

    private void build() {
        add(blockRenderer);
    }

    public void open() {
        setVisible(true);
        mainLoop();
    }

    public void mainLoop() {
        long fpns = fps * 1000000000L;

        long lastTime = System.nanoTime();
        long time;
        long dTime;

        while (true) {
            time = System.nanoTime();
            dTime = time - lastTime;

            if (dTime > fpns) {
                lastTime = time;
                blockRenderer.repaint();
            }
        }
    }
}
