package MoarStuffs.configuration;

import java.io.File;
import java.util.logging.Level;

import MoarStuffs.lib.Reference;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;
/*
 *Author: Glassesofdoom (Anthony Anderson)
 *Last edit: 7/12/2013 By: Glassesofdoom (Anthony Anderson)
 *
 *Handles the configuration file
 */
public class ConfigurationHandler {
    
    public static Configuration configuration;

    public static void init(File configFile) {

        configuration = new Configuration(configFile);
        
        try{
            configuration.load();
            
            /*Block Config*/
            
            
        } catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " had a problem loading its config");
        }finally{
            configuration.save();
        }
        
    }

}