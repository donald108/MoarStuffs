package MoarStuffs.blocks;

import MoarStuffs.lib.id.BlockIds;
import MoarStuffs.lib.name.BNames;
import net.minecraft.block.Block;

/*
 *Author: Glassesofdoom (Anthony Anderson)
 *Last edit: 7/12/2013 By: Glassesofdoom (Anthony Anderson)
 *
 */
public class MSBlock {
	
	public static Block copperOre;

	public static void init() {
		
		copperOre = new BlockcopperOre(BlockIds.ORECOPPER).setUnlocalizedName(BNames.copperOre);
		
	}

}
