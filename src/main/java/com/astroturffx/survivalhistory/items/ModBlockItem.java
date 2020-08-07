package com.astroturffx.survivalhistory.items;

import com.astroturffx.survivalhistory.SurvivalHistory;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ModBlockItem extends BlockItem{
    public ModBlockItem(Block blockIn) {
        super(blockIn, new Item.Properties().group(SurvivalHistory.TAB));
    }
}
