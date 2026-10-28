package com.techcraft.registry;

import com.techcraft.TechCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TechCraft.MOD_ID);

    public static final RegistryObject<Block> PC_TOWER_GAMER = register("pc_tower_gamer",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(2.0F).sound(SoundType.METAL));
    public static final RegistryObject<Block> PC_TOWER_NORMAL = register("pc_tower_normal",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).strength(1.5F).sound(SoundType.METAL));
    public static final RegistryObject<Block> PC_TOWER_CARDBOARD = register("pc_tower_cardboard",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(0.7F).sound(SoundType.WOOD));
    public static final RegistryObject<Block> MONITOR_STAND = register("monitor_stand",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).strength(1.2F).sound(SoundType.METAL));
    public static final RegistryObject<Block> GAMING_DESK = register("gaming_desk",
            BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).strength(1.5F).sound(SoundType.WOOD));
    public static final RegistryObject<Block> GAMING_CHAIR = register("gaming_chair",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED).strength(1.2F).sound(SoundType.WOOL));
    public static final RegistryObject<Block> ELECTRIC_UPGRADE_TABLE = register("electric_upgrade_table",
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_BLUE).strength(2.0F).sound(SoundType.METAL));

    private static RegistryObject<Block> register(String name, BlockBehaviour.Properties properties) {
        RegistryObject<Block> block = BLOCKS.register(name, () -> new Block(properties));
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }
}
