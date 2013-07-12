package MoarStuff.gen

/*
*Author: donald108 (Paul Graham)
*Last edit: 12/7/13 By donald108 (Paul Graham)
*
*ALL WORLD GEN IN HERE
*bit messay - but will do
*turn on/off copperOre Gen!
**Code from FE2 - by a friend of donald108.
*/

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import MoarStuff.MoarStuffMain;
import MoarStuffs.lib.id.BlockIds;
import MoarStuffs.lib.name.BNames;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public final class MSWorldGen implements IWorldGenerator{

  @Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider){
		if(MoarStuffMain.GEN){
			switch(world.provider.dimensionId)
			{
			case -1:
				generateNether(world, rand, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, rand, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd(world, rand, chunkX * 16, chunkZ * 16);
				break;
			}
		}
	}

	public static void addBiomes(){
		//ADD BIMOES HERE
	}

	private void addOreGen(int maxYLevel, int blockID, int rarity, int veinSize, int blockX, int blockZ, Random rand, World world){
		for(int i = 0; i < rarity; i++){
			int xCoord = blockX + rand.nextInt(16);
			int yCoord = rand.nextInt(maxYLevel);
			int zCoord = blockZ + rand.nextInt(16);

			(new WorldGenMinable(blockID, veinSize)).generate(world, rand, xCoord, yCoord, zCoord);
		}
	}

	private void generateSurface(World world, Random rand, int blockX, int blockZ){
		addOreGen(20, MSBlocks.copperOre.blockID, 50, 7, 10, 10, rand, world);
	}

	private boolean isBiome(BiomeGenBase biome, World world, int x, int z){
		return world.getBiomeGenForCoords(x, z) == biome;
	}

	private void generateNether(World world, Random rand, int blockX, int blockZ){	
		//NETHER GEN
	}

	private void generateEnd(World world, Random rand, int blockX, int blockZ){
		//END GEN
	}
}
