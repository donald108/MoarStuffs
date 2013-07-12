package MoarStuffs;

import java.io.File;

import MoarStuffs.blocks.MSBlock;
import MoarStuffs.configuration.ConfigurationHandler;
import MoarStuffs.core.CommonProxy;
import MoarStuffs.lib.Reference;
import MoarStuff.gen.MSWorldGen;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
/*
 *Author: Glassesofdoom (Anthony Anderson)
 *Last edit: 7/12/2013 By: donald108 (Paul Graham)
 */
 
 //Turn ON World Generation of Copper, and any other ores.
 bollean GEN = true;
 
@Mod(
	modid=Reference.MOD_ID, 
	name=Reference.MOD_NAME, 
	version=Reference.VERSiON
	)
@NetworkMod(
			clientSideRequired=true, 
			serverSideRequired=false
			)
public class MoarStuffsMain {
	
	@Instance(Reference.MOD_ID)
    public static MoarStuffsMain instance;
    
    @SidedProxy(clientSide=Reference.CLIENTPROXY, serverSide=Reference.COMMONPROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    
    	ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.MOD_NAME + File.separator + "MoarStuffs" + ".cfg"));
 
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	
    	MSBlock.init();
    	
    	//Decire WorldGeneration
    	GameRegistry.registerWorldGenerator(new MSWorldGen());
            
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            
    }
}
