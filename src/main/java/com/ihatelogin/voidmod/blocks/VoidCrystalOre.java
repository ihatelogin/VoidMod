package com.ihatelogin.voidmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VoidCrystalOre extends Block {
    public VoidCrystalOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 133.0f)
                .sound(SoundType.STONE)
                .harvestLevel(3)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
