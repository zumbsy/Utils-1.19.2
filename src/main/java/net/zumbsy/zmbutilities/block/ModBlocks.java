package net.zumbsy.zmbutilities.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.zumbsy.zmbutilities.ZmbUtilities;
import net.zumbsy.zmbutilities.item.ModItemGroup;

public class ModBlocks {
    //Blocks
    public static final Block RUBY_BLOCK = registerBlock(
            "ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()),
            ModItemGroup.UTILITIES);

    public static final Block RUBY_ORE = registerBlock(
            "ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),
            ModItemGroup.UTILITIES);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock(
            "deepslate_ruby_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)),
            ModItemGroup.UTILITIES);




    //Constructor Block
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ZmbUtilities.MOD_ID, name), block);
    }

    //Constructor Block Item
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ZmbUtilities.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    //Register Mod Blocks
    public static void registerModBlocks() {
        ZmbUtilities.LOGGER.debug("Registering ModBlocks for " + ZmbUtilities.MOD_ID);
    }
}
