package com.GreenJon902.TrashMC;


import javax.swing.*;
import java.awt.*;

public class Renderer extends Canvas {


    public void start() {
        JFrame frame = new JFrame("TrashMC");
        Canvas canvas = new Renderer();
        canvas.setSize(300, 60);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);

        while (true) {

        }
    }

    public void paint(Graphics g) {
        Font font = new Font("Serif", Font.PLAIN, 30);
        g.setFont(font);

        g.fillPolygon(new int[]{10, 20, 40, 50, 50, 40, 20, 10}, new int[]{20, 10, 10, 20, 40, 50, 50, 40}, 8);
        g.drawString("TrashMC is pog", 100, 40);
    }

}