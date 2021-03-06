package com.astroturffx.survivalhistory;

import com.astroturffx.survivalhistory.init.ModBlocks;
import com.astroturffx.survivalhistory.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("survivalhistory")
public class SurvivalHistory
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "survivalhistory";

    public SurvivalHistory() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(ModBlocks.STRAWBERRY_BUSH.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.REINFORCED_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MARBLE_PILLAR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MARBLE_PILLAR_TOP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.MARBLE_PILLAR_BOTTOM.get(), RenderType.getCutout());
    }

    public static final ItemGroup TAB = new ItemGroup("survivalhistorytab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.APPLE);
        }
    };
}
