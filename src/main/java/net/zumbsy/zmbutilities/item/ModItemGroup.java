package net.zumbsy.zmbutilities.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.zumbsy.zmbutilities.ZmbUtilities;

public class ModItemGroup {

    public static final ItemGroup UTILITIES = FabricItemGroupBuilder.build(
            new Identifier(ZmbUtilities.MOD_ID, "utilities"), () -> new ItemStack(ModItems.RUBY));

}
