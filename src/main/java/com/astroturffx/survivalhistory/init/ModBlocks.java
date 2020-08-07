package com.astroturffx.survivalhistory.init;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.blocks.ModStoneBlock;
import com.astroturffx.survivalhistory.blocks.StrawberryBush;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SurvivalHistory.MOD_ID);

    public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", ModStoneBlock::new);
    public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", ModStoneBlock::new);
    public static final RegistryObject<Block> POLISHED_MARBLE = BLOCKS.register("polished_marble", ModStoneBlock::new);
    public static final RegistryObject<Block> INDUSTRIAL_CONCRETE = BLOCKS.register("industrial_concrete", ModStoneBlock::new);

    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", () -> new StrawberryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));
}
