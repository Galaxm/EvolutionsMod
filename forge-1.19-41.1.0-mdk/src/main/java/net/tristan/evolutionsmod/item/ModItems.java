package net.tristan.evolutionsmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.tristan.evolutionsmod.EvolutionsMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EvolutionsMod.MOD_ID);

    public static final RegistryObject<Item> DNA = ITEMS.register("dnacid",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.EVOLUTIONS_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
