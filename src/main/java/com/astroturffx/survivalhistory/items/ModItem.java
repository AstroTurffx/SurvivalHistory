package com.astroturffx.survivalhistory.items;

import com.astroturffx.survivalhistory.SurvivalHistory;
import net.minecraft.item.Item;

public class ModItem extends Item {
    public ModItem() {
        super(new Item.Properties().group(SurvivalHistory.TAB));
    }
}
