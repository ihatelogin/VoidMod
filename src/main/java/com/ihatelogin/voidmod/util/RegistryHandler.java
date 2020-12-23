package com.ihatelogin.voidmod.util;

import com.ihatelogin.voidmod.blocks.BlockItemBase;
import com.ihatelogin.voidmod.blocks.VoidCrystalBlock;
import com.ihatelogin.voidmod.items.ItemBase;
import com.ihatelogin.voidmod.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Reference.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> VOID_CRYSTAL = ITEMS.register("void_crystal", ItemBase::new);

    //Blocks
    public static final RegistryObject<Block> VOID_CRYSTAL_BLOCK = BLOCKS.register("void_crystal_block", VoidCrystalBlock::new);

    //Block Items
    public static final RegistryObject<Item> VOID_CRYSTAL_BLOCK_ITEM = ITEMS.register("void_crystal_block", () -> new BlockItemBase(VOID_CRYSTAL_BLOCK.get()));

    //Tools

}
