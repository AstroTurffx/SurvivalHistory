package com.astroturffx.survivalhistory.init;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.blocks.*;
import net.minecraft.block.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SurvivalHistory.MOD_ID);

    // --- Marble ---
    // Marble
    public static final RegistryObject<Block> MARBLE = BLOCKS.register("marble", ModStoneBlock::new);
    public static final RegistryObject<Block> MARBLE_ENGRAVED = BLOCKS.register("marble_engraved", ModStoneBlock::new);
    public static final RegistryObject<Block> MARBLE_RUNED = BLOCKS.register("marble_runed", ModStoneBlock::new);
    public static final RegistryObject<Block> MARBLE_BRICKS = BLOCKS.register("marble_bricks", ModStoneBlock::new);
    public static final RegistryObject<Block> MARBLE_PILLAR = BLOCKS.register("marble_pillar", () -> new ModPillar(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));
    public static final RegistryObject<Block> MARBLE_PILLAR_TOP = BLOCKS.register("marble_pillar_top", () -> new ModPillarTop(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));
    public static final RegistryObject<Block> MARBLE_PILLAR_BOTTOM = BLOCKS.register("marble_pillar_bottom", () -> new ModPillarBottom(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));
    // Black Marble
    public static final RegistryObject<Block> BLACK_MARBLE = BLOCKS.register("black_marble", ModStoneBlock::new);
    public static final RegistryObject<Block> BLACK_MARBLE_ENGRAVED = BLOCKS.register("black_marble_engraved", ModStoneBlock::new);
    public static final RegistryObject<Block> BLACK_MARBLE_RUNED = BLOCKS.register("black_marble_runed", ModStoneBlock::new);
    public static final RegistryObject<Block> BLACK_MARBLE_BRICKS = BLOCKS.register("black_marble_bricks", ModStoneBlock::new);
    public static final RegistryObject<Block> BLACK_MARBLE_PILLAR = BLOCKS.register("black_marble_pillar", () -> new ModPillar(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));
    public static final RegistryObject<Block> BLACK_MARBLE_PILLAR_TOP = BLOCKS.register("black_marble_pillar_top", () -> new ModPillarTop(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));
    public static final RegistryObject<Block> BLACK_MARBLE_PILLAR_BOTTOM = BLOCKS.register("black_marble_pillar_bottom", () -> new ModPillarBottom(AbstractBlock.Properties.from(ModBlocks.MARBLE.get()).notSolid()));

    // --- Limestone ---
    public static final RegistryObject<Block> LIMESTONE = BLOCKS.register("limestone", ModStoneBlock::new);
    public static final RegistryObject<Block> INDUSTRIAL_CONCRETE = BLOCKS.register("industrial_concrete", ModStoneBlock::new);

    public static final RegistryObject<Block> REINFORCED_DOOR = BLOCKS.register("reinforced_door", () -> new DoorBlock(Block.Properties.from(Blocks.IRON_DOOR)));

    // --- Metals ---
    // Copper
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", ModMetalBlock::new);
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", ModStoneBlock::new);

    // --- Other ---
    // Rubber
    public static final RegistryObject<Block> RUBBER_LOG = BLOCKS.register("rubber_log", () -> new RotatedPillarBlock(Block.Properties.from(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> RUBBER_PLANK = BLOCKS.register("rubber_plank", () -> new Block(Block.Properties.from(Blocks.OAK_PLANKS)));
    // Other
    public static final RegistryObject<Block> STRAWBERRY_BUSH = BLOCKS.register("strawberry_bush", () -> new StrawberryBush(Block.Properties.from(Blocks.SWEET_BERRY_BUSH)));
}
