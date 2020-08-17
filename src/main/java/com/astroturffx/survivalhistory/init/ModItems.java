package com.astroturffx.survivalhistory.init;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.items.ModBlockItem;
import com.astroturffx.survivalhistory.items.ModFood;
import com.astroturffx.survivalhistory.items.ModItem;
import com.astroturffx.survivalhistory.items.ModJarItem;
import com.astroturffx.survivalhistory.materials.ModArmourMaterial;
import com.astroturffx.survivalhistory.materials.ModToolMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SurvivalHistory.MOD_ID);

    // Items
    public static final RegistryObject<Item> JAR = ITEMS.register("jar", ModItem::new);

    // Foods
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register("sliced_bread", () -> new ModFood(1, 2));
    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new ModJarItem(3, 0.5f));
    public static final RegistryObject<Item> STRAWBERRY_JAM_SANDWICH = ITEMS.register("strawberry_jam_sandwich", () -> new ModFood(4, 5));
    public static final RegistryObject<Item> SWEETBERRY_JAM = ITEMS.register("sweetberry_jam", () -> new ModJarItem(3, 0.5f));
    public static final RegistryObject<Item> SWEETBERRY_JAM_SANDWICH = ITEMS.register("sweetberry_jam_sandwich", () -> new ModFood(4, 6));

    // --- Block Items ---
    // Marble
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () -> new ModBlockItem(ModBlocks.MARBLE.get()));
    public static final RegistryObject<Item> MARBLE_ENGRAVED_ITEM = ITEMS.register("marble_engraved", () -> new ModBlockItem(ModBlocks.MARBLE_ENGRAVED.get()));
    public static final RegistryObject<Item> MARBLE_RUNED_ITEM = ITEMS.register("marble_runed", () -> new ModBlockItem(ModBlocks.MARBLE_RUNED.get()));
    public static final RegistryObject<Item> MARBLE_BRICKS_ITEM = ITEMS.register("marble_bricks", () -> new ModBlockItem(ModBlocks.MARBLE_BRICKS.get()));
    public static final RegistryObject<Item> MARBLE_PILLAR_ITEM = ITEMS.register("marble_pillar", () -> new ModBlockItem(ModBlocks.MARBLE_PILLAR.get()));
    public static final RegistryObject<Item> MARBLE_PILLAR_TOP_ITEM = ITEMS.register("marble_pillar_top", () -> new ModBlockItem(ModBlocks.MARBLE_PILLAR_TOP.get()));
    public static final RegistryObject<Item> MARBLE_PILLAR_BOTTOM_ITEM = ITEMS.register("marble_pillar_bottom", () -> new ModBlockItem(ModBlocks.MARBLE_PILLAR_BOTTOM.get()));
    // Black Marble
    public static final RegistryObject<Item> BLACK_MARBLE_ITEM = ITEMS.register("black_marble", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE.get()));
public static final RegistryObject<Item> BLACK_MARBLE_ENGRAVED_ITEM = ITEMS.register("black_marble_engraved", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_ENGRAVED.get()));
    public static final RegistryObject<Item> BLACK_MARBLE_RUNED_ITEM = ITEMS.register("black_marble_runed", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_RUNED.get()));
    public static final RegistryObject<Item> BLACK_MARBLE_BRICKS_ITEM = ITEMS.register("black_marble_bricks", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_BRICKS.get()));
    public static final RegistryObject<Item> BLACK_MARBLE_PILLAR_ITEM = ITEMS.register("black_marble_pillar", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_PILLAR.get()));
    public static final RegistryObject<Item> BLACK_MARBLE_PILLAR_TOP_ITEM = ITEMS.register("black_marble_pillar_top", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_PILLAR_TOP.get()));
    public static final RegistryObject<Item> BLACK_MARBLE_PILLAR_BOTTOM_ITEM = ITEMS.register("black_marble_pillar_bottom", () -> new ModBlockItem(ModBlocks.BLACK_MARBLE_PILLAR_BOTTOM.get()));

    // Limestone
    public static final RegistryObject<Item> LIMESTONE_ITEM = ITEMS.register("limestone", () -> new ModBlockItem(ModBlocks.LIMESTONE.get()));
    public static final RegistryObject<Item> INDUSTRIAL_CONCRETE = ITEMS.register("industrial_concrete", () -> new ModBlockItem(ModBlocks.INDUSTRIAL_CONCRETE.get()));
    public static final RegistryObject<Item> REINFORCED_DOOR = ITEMS.register("reinforced_door", () -> new ModBlockItem(ModBlocks.REINFORCED_DOOR.get()));

    // Rubber
    public static final RegistryObject<Item> RUBBER_LOG_ITEM = ITEMS.register("rubber_log", () -> new ModBlockItem(ModBlocks.RUBBER_LOG.get()));
    public static final RegistryObject<Item> RUBBER_PLANK_ITEM = ITEMS.register("rubber_plank", () -> new ModBlockItem(ModBlocks.RUBBER_PLANK.get()));

    // Other
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new BlockNamedItem(ModBlocks.STRAWBERRY_BUSH.get(), new Item.Properties().group(SurvivalHistory.TAB).food(new Food.Builder().hunger(1).saturation(1).build())));
}
