package com.ihatelogin.voidmod.world.gen;

import com.ihatelogin.voidmod.reference.Reference;
import com.ihatelogin.voidmod.util.RegistryHandler;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModOreGen {

    private static final ArrayList<ConfiguredFeature<?,?>> endOres = new ArrayList<ConfiguredFeature<?,?>>();

    public static void registerOre(){
        endOres.add(register("air_block", Feature.ORE.withConfiguration(new OreFeatureConfig(
                new BlockMatchRuleTest(Blocks.END_STONE), RegistryHandler.VOID_CRYSTAL_ORE.get().getDefaultState(), 20)) //Vein Size
                .range(128).square() //Spawn height start
                .func_242731_b(64))); //Chunk spawn frequency
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void gen(BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        if(event.getCategory().equals(Biome.Category.THEEND)){
            for(ConfiguredFeature<?, ?> ore : endOres){
                if (ore != null) generation.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, ore);
            }
        }
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature){
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, Reference.MOD_ID + ":" + name, configuredFeature);
    }

}
