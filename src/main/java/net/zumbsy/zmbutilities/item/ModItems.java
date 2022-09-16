package net.zumbsy.zmbutilities.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.zumbsy.zmbutilities.ZmbUtilities;

public class ModItems {

    //ITEMS
    public static final Item RUBY_SHARD =  registerItem("ruby_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.UTILITIES)));


    public static final Item RUBY =  registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.UTILITIES)));




    //ITEM Constructor
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ZmbUtilities.MOD_ID, name), item);
    }



    //Register ITEMS
    public static void registerModItems() {
        ZmbUtilities.LOGGER.debug("Registering Mod Items for " + ZmbUtilities.MOD_ID);
    }
}
