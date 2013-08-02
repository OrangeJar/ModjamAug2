package org.orangejar.modjam13;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import buildcraft.core.DefaultProps;
import buildcraft.core.Version;
import buildcraft.core.network.PacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;


@Mod(name = "OrangeJar-Modjam13", version = "0.0.1", useMetadata = false, modid = "OrangeJar-ModJam13|Core", dependencies = "required-after:Forge@[7.7.2.682,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ModJam13  {
		
	public potionItem unrlPotionmk1,unrlPotionmk2,unrlPotionmk3;   /// mark 1 = 10 sec, mark 2 = 17 sec, mark 3 = 30 sec
	public holyBombBlock holyBombBlock;
	
	
	public static modJam13CreativeTab creativeTab = new modJam13CreativeTab("OrangeJar-ModJam13");
	
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
            
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
         
    	
    	 unrlPotionmk1  = new potionItem(997,1);
         unrlPotionmk1.setDuration(30 * 10);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk1, "UnRealPotion M1");
         
         unrlPotionmk2  = new potionItem(998,2);
         unrlPotionmk2.setDuration(30 * 10);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk2, "UnRealPotion M2");
         
         unrlPotionmk3  = new potionItem(999,3);
         unrlPotionmk3.setDuration(30 * 15);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk3, "UnRealPotion M3");
         
         holyBombBlock = new holyBombBlock(996);
         LanguageRegistry.addName(holyBombBlock, "HolyBomb");
         
         
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            
    }
	

}
