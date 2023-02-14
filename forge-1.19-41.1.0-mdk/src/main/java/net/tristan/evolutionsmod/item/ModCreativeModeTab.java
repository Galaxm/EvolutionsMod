package net.tristan.evolutionsmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab EVOLUTIONS_TAB = new CreativeModeTab("evolutionstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.DNA.get());
        }
    };
}
