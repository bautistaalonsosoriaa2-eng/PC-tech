package com.techcraft.registry;

import com.techcraft.TechCraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TechCraft.MOD_ID);

    // Componentes de PC
    public static final RegistryObject<Item> RAM_10 = basic("ram_10gb");
    public static final RegistryObject<Item> RAM_32 = basic("ram_32gb");
    public static final RegistryObject<Item> RAM_100 = basic("ram_100gb");
    public static final RegistryObject<Item> STORAGE_200 = basic("storage_200gb");
    public static final RegistryObject<Item> STORAGE_500 = basic("storage_500gb");
    public static final RegistryObject<Item> STORAGE_1TB = basic("storage_1tb");
    public static final RegistryObject<Item> MOTHERBOARD_BASIC = basic("motherboard_basic");
    public static final RegistryObject<Item> MOTHERBOARD_GAMER = basic("motherboard_gamer");
    public static final RegistryObject<Item> MOTHERBOARD_CARDBOARD = basic("motherboard_cardboard");
    public static final RegistryObject<Item> CPU_BASIC = basic("cpu_basic");
    public static final RegistryObject<Item> CPU_GAMER = basic("cpu_gamer");
    public static final RegistryObject<Item> CPU_CARDBOARD = basic("cpu_cardboard");

    // Periféricos por nivel
    public static final RegistryObject<Item> KEYBOARD_GAMER = basic("keyboard_gamer");
    public static final RegistryObject<Item> KEYBOARD_NORMAL = basic("keyboard_normal");
    public static final RegistryObject<Item> KEYBOARD_CARDBOARD = basic("keyboard_cardboard");
    public static final RegistryObject<Item> MOUSE_GAMER = basic("mouse_gamer");
    public static final RegistryObject<Item> MOUSE_NORMAL = basic("mouse_normal");
    public static final RegistryObject<Item> MOUSE_CARDBOARD = basic("mouse_cardboard");
    public static final RegistryObject<Item> MONITOR_GAMER = basic("monitor_gamer");
    public static final RegistryObject<Item> MONITOR_NORMAL = basic("monitor_normal");
    public static final RegistryObject<Item> MONITOR_CARDBOARD = basic("monitor_cardboard");
    public static final RegistryObject<Item> ROUTER_GAMER = basic("router_gamer");
    public static final RegistryObject<Item> ROUTER_NORMAL = basic("router_normal");
    public static final RegistryObject<Item> ROUTER_CARDBOARD = basic("router_cardboard");

    // Móviles y cargadores magnéticos
    public static final RegistryObject<Item> PHONE_CASE_GAMER = basic("phone_case_gamer");
    public static final RegistryObject<Item> PHONE_CASE_NORMAL = basic("phone_case_normal");
    public static final RegistryObject<Item> PHONE_CASE_CARDBOARD = basic("phone_case_cardboard");
    public static final RegistryObject<Item> TABLET_CASE_GAMER = basic("tablet_case_gamer");
    public static final RegistryObject<Item> TABLET_CASE_NORMAL = basic("tablet_case_normal");
    public static final RegistryObject<Item> TABLET_CASE_CARDBOARD = basic("tablet_case_cardboard");
    public static final RegistryObject<Item> MAGNETIC_CHARGER = basic("magnetic_charger");

    private static RegistryObject<Item> basic(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }
}
