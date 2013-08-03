package org.orangejar.modjam13;

import org.orangejar.modjam13.items.Item1911;
import org.orangejar.modjam13.core.proxy.CommonProxy;
import org.orangejar.modjam13.items.ItemUltraPotion;
import org.orangejar.modjam13.blocks.holyBombBlock;
import org.orangejar.modjam13.entity.*;
import org.orangejar.modjam13.client.tile.*;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemPotion;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraftforge.common.MinecraftForge;


@Mod(name = "OrangeJar-Modjam13", version = "0.0.1", useMetadata = false, modid = "OrangeJar-ModJam13|Core", dependencies = "required-after:Forge@[7.7.2.682,)")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)
public class ModJam13  {
	public static ModJam13 instance;
	
	@SidedProxy(clientSide = "org.orangejar.modjam13.core.proxy.ClientProxy", serverSide = "org.orangejar.modjam13.core.proxy.CommonProxy")
	public static CommonProxy Proxy;
		
	//public potionItem unrlPotionmk1,unrlPotionmk2,unrlPotionmk3;   /// mark 1 = 10 sec, mark 2 = 17 sec, mark 3 = 30 sec
	public final static int potionItemid = 16666;
	public final static int potionItem2id = 16667;
	public final static int potionItem3id = 16668;
	public static ItemUltraPotion potionItem = new ItemUltraPotion(potionItemid, 1);
	public static ItemUltraPotion potionItem2 = new ItemUltraPotion(potionItem2id, 2);
	public static ItemUltraPotion potionItem3 = new ItemUltraPotion(potionItem3id, 3);
	public holyBombBlock holyBombBlock;
	public final static int item1911id = 16555;
	public static Item item1911 = new Item1911(item1911id);
	static int startEntityId = 300;
	
	
	public static modJam13CreativeTab creativeTab = new modJam13CreativeTab("OrangeJar-ModJam13");
	
	
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
   	 Proxy.InitRendering();
   	 MinecraftForge.EVENT_BUS.register(new org.orangejar.modjam13.core.handlers.SoundHandler());
    }
    
    @EventHandler
    public void load(FMLInitializationEvent event) {
    	 item1911 = new Item1911(item1911id);
    	 potionItem = new ItemUltraPotion(potionItemid, 1);
    	 potionItem2 = new ItemUltraPotion(potionItem2id, 2);
    	 potionItem3 = new ItemUltraPotion(potionItem3id, 3);
    	
    	/* unrlPotionmk1  = new potionItem(997,1);
         unrlPotionmk1.setDuration(30 * 10);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk1, "UnRealPotion M1");
         
         unrlPotionmk2  = new potionItem(998,2);
         unrlPotionmk2.setDuration(30 * 10);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk2, "UnRealPotion M2");
         
         unrlPotionmk3  = new potionItem(999,3);
         unrlPotionmk3.setDuration(30 * 15);   // 30 = 1 sec 
         LanguageRegistry.addName(unrlPotionmk3, "UnRealPotion M3");*/
    	 potionItem.setDuration(30 * 10);
    	 potionItem2.setDuration(30 * 10);
    	 potionItem3.setDuration(30 * 15);
    	 
         
         holyBombBlock = new holyBombBlock(996);
         LanguageRegistry.addName(holyBombBlock, "HolyBomb");
         
         GameRegistry.registerItem(item1911, "item1911");
 		 GameRegistry.registerTileEntity(TileEntityItem1911.class, "tileEntityItem1911");
 		 LanguageRegistry.addName(item1911, "1911");
 		 //EntityRegistry.registerModEntity(EntityBullet1911.class, "bullet1911", 10, this.instance, 32, 3, true);
 		 EntityRegistry.registerModEntity(NPCWerWoolfWoofWoof.class, "Werich", 17, this, 80, 3, true);
 		 EntityRegistry.registerGlobalEntityID(NPCWerWoolfWoofWoof.class, "WerWoolf", 929);
 		 registerEntityEgg(NPCWerWoolfWoofWoof.class, 0xffffff, 0x000010);
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
            
    }
	
    public static int getUniqueEntityId() 
    {
     do 
     {
      startEntityId++;
     } 
     while (EntityList.getStringFromID(startEntityId) != null);

      return startEntityId;
    }
    
    public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
    {
     int id = getUniqueEntityId();
     EntityList.IDtoClassMapping.put(id, entity);
     EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
    
    
}
