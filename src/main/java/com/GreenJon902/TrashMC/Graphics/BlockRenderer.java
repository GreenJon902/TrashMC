package com.GreenJon902.TrashMC.Graphics;


import com.hackoeur.jglm.Mat4;
import com.hackoeur.jglm.Matrices;
import com.hackoeur.jglm.Vec3;
import com.hackoeur.jglm.Vec4;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hackoeur.jglm.Vec4;

import java.util.ArrayList;

public class BlockRenderer {
    public static ArrayList<Vec4> blocks = new ArrayList<>();

    public static Vec4 camera = new Vec4(0, 0, -100, 1);

    public static void draw(Graphics g) {
        g.setColor(Color.red);

        int[] xPoints = new int[4];
        int[] yPoints = new int[4];

        int[] current;

        for (Vec4 block : blocks) {
            // Front --------------------------------------------------------------------------------------------O = FTL
            current = projectPlain(block.getX(), block.getY(), block.getZ(), block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ(), block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ(), block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ(), block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            g.drawPolyline(xPoints, yPoints, 4);


            // Top ----------------------------------------------------------------------------------------------O = FTL
            current = projectPlain(block.getX(), block.getY(), block.getZ(), block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX(), block.getY(), block.getZ() + 100, block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ() + 100, block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ(), block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            g.drawPolyline(xPoints, yPoints, 4);


            // Left ---------------------------------------------------------------------------------------------O = FTL
            current = projectPlain(block.getX(), block.getY(), block.getZ(), block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ(), block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX(), block.getY(), block.getZ() + 100, block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            g.drawPolyline(xPoints, yPoints, 4);


            // Right --------------------------------------------------------------------------------------------O = BBR
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ(), block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ(), block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ() + 100, block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            g.drawPolyline(xPoints, yPoints, 4);


            // Bottom -------------------------------------------------------------------------------------------O = BBR
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ(), block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ(), block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            g.drawPolyline(xPoints, yPoints, 4);


            // Back -------------------------------------------------------------------------------------------O = BBR
            current = projectPlain(block.getX() + 100, block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[0] = current[0];
            yPoints[0] = current[1];
            current = projectPlain(block.getX(), block.getY() + 100, block.getZ() + 100, block.getW());
            xPoints[1] = current[0];
            yPoints[1] = current[1];
            current = projectPlain(block.getX(), block.getY(), block.getZ() + 100, block.getW());
            xPoints[2] = current[0];
            yPoints[2] = current[1];
            current = projectPlain(block.getX() + 100, block.getY(), block.getZ() + 100, block.getW());
            xPoints[3] = current[0];
            yPoints[3] = current[1];

            System.out.println(Arrays.toString(xPoints) + " " + Arrays.toString(yPoints));
            System.out.println();
            g.drawPolyline(xPoints, yPoints, 4);
        }
    }


    private static int[] projectPlain(float x, float y, float z, float w) {
        Mat4 cameraMatrix = Matrices.lookAt(new Vec3(camera.getX(), camera.getY(), camera.getZ()), new Vec3(0, 0, 0), new Vec3(0, 1, 0));
        Mat4 projectionMatrix = Matrices.perspective(45, 1, 0.1f, 1000).multiply(cameraMatrix);
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

        return new int[]{(int) nx, (int) ny};
    }
}