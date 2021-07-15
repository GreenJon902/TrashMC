package com.GreenJon902.TrashMC.Graphics;


import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class Window extends GLCanvas {
    int fps = 1;

    final JFrame frame = new JFrame();


    public Window() {
        System.out.println("yo2");
        build();
        System.out.println("Yo3");
    }

    private void build() {
        System.out.println("hi2");
        Window window = this;
        SwingUtilities.invokeLater(() -> {
            frame.getContentPane().add(window);
            System.out.println("hi3");
        });
        System.out.println("hi4");
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
