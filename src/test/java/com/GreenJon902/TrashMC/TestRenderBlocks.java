package com.GreenJon902.TrashMC;

import com.GreenJon902.TrashMC.Graphics.BlockRenderer;
import com.GreenJon902.TrashMC.Graphics.Window;
import com.hackoeur.jglm.Vec4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestRenderBlocks {
    @Test
    public void testRenderBlocks() {
        System.out.println("hi");
        Window window = new Window();
        System.out.println("hi5");
        BlockRenderer.blocks.add(new Vec4(100, 50, 30, 1));
        BlockRenderer.blocks.add(new Vec4(200, 50, 30, 1));
        BlockRenderer.blocks.add(new Vec4(300, 50, 30, 1));
        window.open();
    }
}