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
	
	public static Block copperOre;

	public static void init() {
		
		copperOre = new BlockcopperOre(BlockIds.ORECOPPER).setUnlocalizedName(BNames.copperOre);
		
	}
	
	GameRegistry.registerBlock(BlockcopperOre, BNames.COPPER);
	
	LanaguageLegistry.addName(BlockcopperOre, BNames.COPPER);
	
	 LanguageRegistry.instance().addStringLocalization("itemGroup.MSBlocks", "en_US", "MS Blocks");
	 
	 MinecraftForge.setBlockHarvestLevel(copperOre, "pickaxe", 2);

}
