package com.astroturffx.survivalhistory.world.feature;

import com.astroturffx.survivalhistory.init.ModBlocks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class StrawberryBush{
    public static BlockClusterFeatureConfig STRAWBERRY_BUSH_CONFIG = (
            new BlockClusterFeatureConfig.Builder(
                    new SimpleBlockStateProvider(
                            ModBlocks.STRAWBERRY_BUSH.get().getDefaultState()
                                    .with(com.astroturffx.survivalhistory.blocks.StrawberryBush.AGE, 3)),
                    new SimpleBlockPlacer()
            ).tries(10).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock()))
    ).func_227317_b_().build();
}
