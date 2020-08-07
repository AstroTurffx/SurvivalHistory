package com.astroturffx.survivalhistory.items;

import com.astroturffx.survivalhistory.SurvivalHistory;
import com.astroturffx.survivalhistory.init.ModItems;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModJarItem extends Item {
    public ModJarItem(int hunger, float saturation) {
        super(new Item.Properties().group(SurvivalHistory.TAB).food(new Food.Builder()
                .hunger(hunger)
                .saturation(saturation)
                .build()));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        return new ItemStack(ModItems.JAR.get(), 1);
    }
}
