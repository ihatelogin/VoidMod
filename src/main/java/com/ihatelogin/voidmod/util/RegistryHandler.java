package com.ihatelogin.voidmod.util;

import com.ihatelogin.voidmod.VoidMod;
import com.ihatelogin.voidmod.armor.ModArmorMaterial;
import com.ihatelogin.voidmod.blocks.BlockItemBase;
import com.ihatelogin.voidmod.blocks.VoidCrystalBlock;
import com.ihatelogin.voidmod.blocks.VoidCrystalOre;
import com.ihatelogin.voidmod.items.ItemBase;
import com.ihatelogin.voidmod.reference.Reference;
import com.ihatelogin.voidmod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.lwjgl.system.CallbackI;

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
    public static final RegistryObject<Block> VOID_CRYSTAL_ORE = BLOCKS.register("void_crystal_ore", VoidCrystalOre::new);

    //Block Items
    public static final RegistryObject<Item> VOID_CRYSTAL_BLOCK_ITEM = ITEMS.register("void_crystal_block", () -> new BlockItemBase(VOID_CRYSTAL_BLOCK.get()));
    public static final RegistryObject<Item> VOID_CRYSTAL_ORE_ITEM = ITEMS.register("void_crystal_ore", () -> new BlockItemBase(VOID_CRYSTAL_ORE.get()));

    //Tools
    public static final RegistryObject<SwordItem> VOID_CRYSTAL_SWORD = ITEMS.register("void_crystal_sword", () -> new SwordItem(ModItemTier.VOID_CRYSTAL, 5, -1.0F, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<PickaxeItem> VOID_CRYSTAL_PICKAXE = ITEMS.register("void_crystal_pickaxe", () -> new PickaxeItem(ModItemTier.VOID_CRYSTAL, 0, -3.0F, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<AxeItem> VOID_CRYSTAL_AXE = ITEMS.register("void_crystal_axe", () -> new AxeItem(ModItemTier.VOID_CRYSTAL, 6, -1.9F, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<ShovelItem> VOID_CRYSTAL_SHOVEL = ITEMS.register("void_crystal_shovel", () -> new ShovelItem(ModItemTier.VOID_CRYSTAL, 0, -3.0F, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<HoeItem> VOID_CRYSTAL_HOE = ITEMS.register("void_crystal_hoe", () -> new HoeItem(ModItemTier.VOID_CRYSTAL, 0, -3.0F, new Item.Properties().group(VoidMod.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> VOID_CRYSTAL_HELMET = ITEMS.register("void_crystal_helmet", () -> new ArmorItem(ModArmorMaterial.VOID_CRYSTAL, EquipmentSlotType.HEAD, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<ArmorItem> VOID_CRYSTAL_CHESTPLATE = ITEMS.register("void_crystal_chestplate", () -> new ArmorItem(ModArmorMaterial.VOID_CRYSTAL, EquipmentSlotType.CHEST, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<ArmorItem> VOID_CRYSTAL_LEGGINGS = ITEMS.register("void_crystal_leggings", () -> new ArmorItem(ModArmorMaterial.VOID_CRYSTAL, EquipmentSlotType.LEGS, new Item.Properties().group(VoidMod.TAB)));
    public static final RegistryObject<ArmorItem> VOID_CRYSTAL_BOOTS = ITEMS.register("void_crystal_boots", () -> new ArmorItem(ModArmorMaterial.VOID_CRYSTAL, EquipmentSlotType.FEET, new Item.Properties().group(VoidMod.TAB)));
}
