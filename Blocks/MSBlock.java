package MoarStuffs.blocks;

import MoarStuffs.lib.id.BlockIds;
import MoarStuffs.lib.name.BNames;
import net.minecraft.block.Block;

/*
 *Author: Glassesofdoom (Anthony Anderson)
 *Last edit: 7/12/2013 By: donald108 {Paul Graham}
 *
 */
public class MSBlock {
	//Declare the blocks/items
	public static Block copperOre;

	public static void init() {
		//Init the block/Items add crafting
		copperOre = new BlockcopperOre(BlockIds.ORECOPPER).setUnlocalizedName(BNames.copperOre);
		
	}
	//Regester the block
	GameRegistry.registerBlock(BlockcopperOre, BNames.copperOre);
	
	//Regester the block/item
	LanaguageLegistry.addName(BlockcopperOre, BNames.copperOre);
	
	//Add the localistation
	 LanguageRegistry.instance().addStringLocalization("itemGroup.MSBlocks", "en_US", "MS Blocks");
	 
	 //Add the harvest values
	 MinecraftForge.setBlockHarvestLevel(copperOre, "pickaxe", 2);

}
