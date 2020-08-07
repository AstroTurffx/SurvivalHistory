package com.astroturffx.survivalhistory.init;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.items.ModBlockItem;
import com.astroturffx.survivalhistory.items.ModFood;
import com.astroturffx.survivalhistory.items.ModItem;
import com.astroturffx.survivalhistory.items.ModJarItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SurvivalHistory.MOD_ID);

    // Items
    public static final RegistryObject<Item> JAR = ITEMS.register("jar", ModItem::new);

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
    public static final RegistryObject<Item> INDUSTRIAL_CONCRETE = ITEMS.register("industrial_concrete", () -> new ModBlockItem(ModBlocks.POLISHED_MARBLE.get()));

    public static final RegistryObject<Item> STRAWBERRY_BUSH_ITEM = ITEMS.register("strawberry_bush", () -> new ModBlockItem(ModBlocks.STRAWBERRY_BUSH  .get()));
}
