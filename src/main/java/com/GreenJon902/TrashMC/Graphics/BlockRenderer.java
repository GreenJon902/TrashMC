package com.GreenJon902.TrashMC.Graphics;


import javax.swing.*;
import java.awt.*;

public class BlockRenderer extends Canvas {
    public void paint(Graphics g) {
        Font font = new Font("Serif", Font.PLAIN, 30);
        g.setFont(font);

        g.fillPolygon(new int[]{10, 20, 40, 50, 50, 40, 20, 10}, new int[]{20, 10, 10, 20, 40, 50, 50, 40}, 8);
        g.drawString("TrashMC is pog", 100, 40);
    }

}