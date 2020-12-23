package com.ihatelogin.voidmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class VoidCrystalBlock extends Block {

    public VoidCrystalBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(17.0f, 133.0f)
                .sound(SoundType.METAL)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
