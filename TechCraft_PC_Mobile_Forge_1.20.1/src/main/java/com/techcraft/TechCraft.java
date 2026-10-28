package com.techcraft;

import com.techcraft.registry.ModBlocks;
import com.techcraft.registry.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TechCraft.MOD_ID)
public class TechCraft {
    public static final String MOD_ID = "techcraft";

    public TechCraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
    }
}
