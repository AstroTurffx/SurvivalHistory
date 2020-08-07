package com.astroturffx.survivalhistory.world.gen;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.init.ModBlocks;
import com.astroturffx.survivalhistory.world.feature.StrawberryBush;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.*;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SurvivalHistory.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModGenaration {
    @SubscribeEvent
    public static void genarateOres(FMLLoadCompleteEvent event){

        // Ores
        for (Biome biome : ForgeRegistries.BIOMES){
            genOre(biome, 52, 8, 15, 60, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.MARBLE.get().getDefaultState(), 9);
            genOre(biome, 60, 5, 5, 60, OreFeatureConfig.FillerBlockType.NATURAL_STONE, ModBlocks.LIMESTONE.get().getDefaultState(), 13);
        }

        // Strawberry Bushes
        Biome strawberryBushSpawnBiomes[] = {Biomes.PLAINS, Biomes.FOREST};
        for (Biome biome : strawberryBushSpawnBiomes) {
            biome.addFeature(
                    GenerationStage.Decoration.VEGETAL_DECORATION,
                    Feature.RANDOM_PATCH.withConfiguration(StrawberryBush.STRAWBERRY_BUSH_CONFIG)
                            .withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(5))));
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defualtBlockState, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defualtBlockState, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
