package com.GreenJon902.TrashMC.Graphics;


import com.hackoeur.jglm.Mat4;
import com.hackoeur.jglm.Matrices;
import com.hackoeur.jglm.Vec3;
import com.hackoeur.jglm.Vec4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BlockRenderer extends Canvas {
    public static ArrayList<Vec4> blocks = new ArrayList<>();

    public static Vec4 camera = new Vec4(12, 3, 18, 1);

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(0, 255, 0));

        double pos1_x;
        double pos2_x;
        double pos3_x;
        double pos4_x;
        double pos1_y;
        double pos2_y;
        double pos3_y;
        double pos4_y;

        Mat4 proj = Matrices.perspective(45, 1, 0.1f, 100).multiply(Matrices.lookAt(new Vec3(4, 3, 3), new Vec3(0, 0, 0), new Vec3(0, 1, 0)));
        Mat4 model;

        for (Vec4 block : blocks) {
            model = new Mat4(block.getX(), 0, 0, 0,
                                  0, block.getY(), 0, 0,
                                  0, 0, block.getZ(), 0,
                                  0, 0, 0, block.getW());
            pos1_x = ((Vec4)proj.multiply(model).getColumn(1)).getX();
            pos1_y = ((Vec4)proj.multiply(model).getColumn(1)).getY();


            model = new Mat4(block.getX() + 100, 0, 0, 0,
                    0, block.getY(), 0, 0,
                    0, 0, block.getZ(), 0,
                    0, 0, 0, block.getW());
            pos2_x = ((Vec4)proj.multiply(model).getColumn(1)).getX();
            pos2_y = ((Vec4)proj.multiply(model).getColumn(1)).getY();


            model = new Mat4(block.getX() + 100, 0, 0, 0,
                    0, block.getY() + 100, 0, 0,
                    0, 0, block.getZ(), 0,
                    0, 0, 0, block.getW());
            pos3_x = ((Vec4)proj.multiply(model).getColumn(1)).getX();
            pos3_y = ((Vec4)proj.multiply(model).getColumn(1)).getY();


            model = new Mat4(block.getX(), 0, 0, 0,
                    0, block.getY() + 100, 0, 0,
                    0, 0, block.getZ(), 0,
                    0, 0, 0, block.getW());
            pos4_x = ((Vec4)proj.multiply(model).getColumn(1)).getZ();
            pos4_y = ((Vec4)proj.multiply(model).getColumn(1)).getY();

            g.fillPolygon(new int[]{(int) pos1_x, (int) pos2_x, (int) pos3_x, (int) pos4_x}, new int[]{(int) pos1_y, (int) pos2_y, (int) pos3_y, (int) pos4_y}, 4);
            System.out.println(Arrays.toString(new int[]{(int) pos1_x, (int) pos2_x, (int) pos3_x, (int) pos4_x}) + " " + Arrays.toString(new int[]{(int) pos1_y, (int) pos2_y, (int) pos3_y, (int) pos4_y}));
        }
    }


}