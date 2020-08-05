package com.astroturffx.survivalhistory.items;

import com.astroturffx.survivalhistory.SurvivalHistory;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ModFood extends Item {
    public ModFood(int hunger, float saturation) {
        super(new Item.Properties()
                .group(SurvivalHistory.TAB)
                .food(new Food.Builder()
                        .hunger(hunger)
                        .saturation(saturation)
                        .build()));
    }
}
