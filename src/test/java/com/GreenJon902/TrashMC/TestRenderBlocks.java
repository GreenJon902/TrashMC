package com.GreenJon902.TrashMC;

import com.GreenJon902.TrashMC.Graphics.BlockRenderer;
import com.GreenJon902.TrashMC.Graphics.Window;
import com.hackoeur.jglm.Mat3;
import com.hackoeur.jglm.Mat4;
import com.hackoeur.jglm.Vec4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestRenderBlocks {
    @Test
    public void testRenderBlocks() {
        Window window = new Window();
        BlockRenderer.blocks.add(new Vec4(100, 50, 30, 1));
        BlockRenderer.blocks.add(new Vec4(200, 50, 30, 1));
        BlockRenderer.blocks.add(new Vec4(300, 50, 30, 1));
        window.open();
    }
}