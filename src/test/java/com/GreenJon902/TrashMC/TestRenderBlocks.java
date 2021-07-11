package com.GreenJon902.TrashMC;

import com.GreenJon902.TrashMC.Graphics.BlockRenderer;
import com.GreenJon902.TrashMC.Graphics.Window;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestRenderBlocks {
    @Test
    public void testRenderBlocks() {
        Window window = new Window();
        BlockRenderer.blocks.add(new int[]{0, 0, 0});
        window.open();
    }
}