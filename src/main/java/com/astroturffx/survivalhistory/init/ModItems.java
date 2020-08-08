package com.astroturffx.survivalhistory.init;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.items.ModBlockItem;
import com.astroturffx.survivalhistory.items.ModFood;
import com.astroturffx.survivalhistory.items.ModItem;
import com.astroturffx.survivalhistory.items.ModJarItem;
import com.astroturffx.survivalhistory.materials.ModToolMaterial;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SurvivalHistory.MOD_ID);

    // Items
    public static final RegistryObject<Item> JAR = ITEMS.register("jar", ModItem::new);
    public static final RegistryObject<Item> COPPER_NUGGET = ITEMS.register("copper_nugget", ModItem::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ModItem::new);

    ///          --- Tools ---
    // Copper
    public static final RegistryObject<SwordItem> COPPER_SWORD = ITEMS.register("copper_sword", () -> new SwordItem(ModToolMaterial.COPPER, 2, -2.4f, new Item.Properties().group(SurvivalHistory.TAB)));
    public static final RegistryObject<PickaxeItem> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", () -> new PickaxeItem(ModToolMaterial.COPPER, 0, -2.8f, new Item.Properties().group(SurvivalHistory.TAB)));
    public static final RegistryObject<ShovelItem> COPPER_SHOVEL = ITEMS.register("copper_shovel", () -> new ShovelItem(ModToolMaterial.COPPER, 1, -3.0f, new Item.Properties().group(SurvivalHistory.TAB)));
    public static final RegistryObject<AxeItem> COPPER_AXE = ITEMS.register("copper_axe", () -> new AxeItem(ModToolMaterial.COPPER, 4, -3.0f, new Item.Properties().group(SurvivalHistory.TAB)));
    public static final RegistryObject<HoeItem> COPPER_HOE = ITEMS.register("copper_hoe", () -> new HoeItem(ModToolMaterial.COPPER, 0, -2.0f, new Item.Properties().group(SurvivalHistory.TAB)));

    // Foods
    public static final RegistryObject<Item> SLICED_BREAD = ITEMS.register("sliced_bread", () -> new ModFood(1, 2));
    public static final RegistryObject<Item> STRAWBERRY = ITEMS.register("strawberry", () -> new ModFood(1, 1));
    public static final RegistryObject<Item> STRAWBERRY_JAM = ITEMS.register("strawberry_jam", () -> new ModJarItem(3, 0.5f));
    public static final RegistryObject<Item> STRAWBERRY_JAM_SANDWICH = ITEMS.register("strawberry_jam_sandwich", () -> new ModFood(4, 5));
    public static final RegistryObject<Item> SWEETBERRY_JAM = ITEMS.register("sweetberry_jam", () -> new ModJarItem(3, 0.5f));
    public static final RegistryObject<Item> SWEETBERRY_JAM_SANDWICH = ITEMS.register("sweetberry_jam_sandwich", () -> new ModFood(4, 6));

    // Block Items
    public static final RegistryObject<Item> LIMESTONE_ITEM = ITEMS.register("limestone", () -> new ModBlockItem(ModBlocks.LIMESTONE.get()));
    public static final RegistryObject<Item> MARBLE_ITEM = ITEMS.register("marble", () -> new ModBlockItem(ModBlocks.MARBLE.get()));
    public static final RegistryObject<Item> POLISHED_MARBLE_ITEM = ITEMS.register("polished_marble", () -> new ModBlockItem(ModBlocks.POLISHED_MARBLE.get()));
    public static final RegistryObject<Item> INDUSTRIAL_CONCRETE = ITEMS.register("industrial_concrete", () -> new ModBlockItem(ModBlocks.INDUSTRIAL_CONCRETE.get()));

    public static final RegistryObject<Item> REINFORCED_DOOR = ITEMS.register("reinforced_door", () -> new ModBlockItem(ModBlocks.REINFORCED_DOOR.get()));

    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block_item", () -> new ModBlockItem(ModBlocks.COPPER_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore_item", () -> new ModBlockItem(ModBlocks.COPPER_ORE.get()));


    public static final RegistryObject<Item> STRAWBERRY_BUSH_ITEM = ITEMS.register("strawberry_bush", () -> new ModBlockItem(ModBlocks.STRAWBERRY_BUSH  .get()));
}
