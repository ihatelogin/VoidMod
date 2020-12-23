package com.ihatelogin.voidmod.blocks;

import com.ihatelogin.voidmod.VoidMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block blockIn) {
        super(blockIn, new Item.Properties().group(VoidMod.TAB));
    }
}
