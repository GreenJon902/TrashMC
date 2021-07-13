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

        float pos1_x;
        float pos2_x;
        float pos3_x;
        float pos4_x;
        float pos1_y;
        float pos2_y;
        float pos3_y;
        float pos4_y;


        for (Vec4 block : blocks) {

            pos1_x = projectPlain(block.getX(), block.getY(), block.getZ(), block.getW())[0];
            pos1_y = projectPlain(block.getX(), block.getY(), block.getZ(), block.getW())[1];


            pos2_x = projectPlain(block.getX() + 100, block.getY(), block.getZ(), block.getW())[0];
            pos2_y = projectPlain(block.getX() + 100, block.getY(), block.getZ(), block.getW())[1];

            pos3_x = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ(), block.getW())[0];
            pos3_y = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ(), block.getW())[1];

            pos4_x = projectPlain(block.getX(), block.getY() + 100, block.getZ(), block.getW())[0];
            pos4_y = projectPlain(block.getX(), block.getY() + 100, block.getZ(), block.getW())[1];

            g.fillPolygon(new int[]{(int) pos1_x, (int) pos2_x, (int) pos3_x, (int) pos4_x}, new int[]{(int) pos1_y, (int) pos2_y, (int) pos3_y, (int) pos4_y}, 4);
            System.out.println(Arrays.toString(new int[]{(int) pos1_x, (int) pos2_x, (int) pos3_x, (int) pos4_x}) + " " + Arrays.toString(new int[]{(int) pos1_y, (int) pos2_y, (int) pos3_y, (int) pos4_y}));
        }
    }


    private float[] projectPlain(float x, float y, float z, float w) {
        Mat4 cameraMatrix = Matrices.lookAt(new Vec3(0, 0, 10), new Vec3(0, 0, 0), new Vec3(0, 1, 0));
        Mat4 projectionMatrix = Matrices.perspective(45, 1, 0.1f, 100).multiply(cameraMatrix);
        Mat4 modelMatrix = new Mat4(x, 0, 0, 0,
                          0, y, 0, 0,
                         0, 0, z, 0,
                         0, 0, 0, w);
        Mat4 modelProjectionMatrix = cameraMatrix.multiply(projectionMatrix).multiply(modelMatrix);

        float nx =
                ((Vec4)modelProjectionMatrix.getColumn(0)).getX() +
                ((Vec4)modelProjectionMatrix.getColumn(1)).getX() +
                ((Vec4)modelProjectionMatrix.getColumn(2)).getX() +
                ((Vec4)modelProjectionMatrix.getColumn(3)).getX();
        float ny =
                ((Vec4)modelProjectionMatrix.getColumn(0)).getY() +
                ((Vec4)modelProjectionMatrix.getColumn(1)).getY() +
                ((Vec4)modelProjectionMatrix.getColumn(2)).getY() +
                ((Vec4)modelProjectionMatrix.getColumn(3)).getY();

        return new float[]{nx, ny};
    }

}