package net.zumbsy.zmbutilities;

import net.fabricmc.api.ModInitializer;
import net.zumbsy.zmbutilities.block.ModBlocks;
import net.zumbsy.zmbutilities.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZmbUtilities implements ModInitializer {
	public static final String MOD_ID = "zmbutilities";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
