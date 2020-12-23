package com.ihatelogin.voidmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class VoidCrystalOre extends OreBlock {
    public VoidCrystalOre() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 133.0f)
                .sound(SoundType.STONE)
                .harvestLevel(4)
                .harvestTool(ToolType.PICKAXE)
        );
    }

    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch){
        if(silktouch >=1){
            return 0;
        }
        return 1;
    }
}
