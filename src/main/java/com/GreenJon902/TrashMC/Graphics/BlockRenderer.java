package com.GreenJon902.TrashMC.Graphics;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BlockRenderer extends Canvas {
    public static ArrayList<int[]> blocks = new ArrayList<>();

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(0, 255, 0));

        int[] block;

        for (int block_number = 0; block_number < blocks.size(); block_number++) {
            block = blocks.get(block_number);
            g.fillPolygon(new int[]{block[0], block[0]+100, block[0]+100, block[0]}, new int[]{block[1], block[1], block[1]+100, block[1]+100}, 4);
        }
    }

}