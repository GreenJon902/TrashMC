package com.GreenJon902.TrashMC.Graphics;

import javax.swing.*;

public class Window extends JFrame {
    public Window() {
        super("TrashMC");
        setSize(300, 80);

        build();
    }

    private void build() {
        add(new BlockRenderer());
    }

    public void open() {
        setVisible(true);
        while (true) {

        }
    }
}
