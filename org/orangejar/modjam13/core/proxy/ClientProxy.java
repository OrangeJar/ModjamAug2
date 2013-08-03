package org.orangejar.modjam13.core.proxy;

import org.orangejar.modjam13.ModJam13;
import org.orangejar.modjam13.client.render.Item1911Renderer;
import org.orangejar.modjam13.client.render.RenderPotionmk1;
import org.orangejar.modjam13.client.render.RenderPotionmk2;
import org.orangejar.modjam13.client.render.RenderPotionmk3;
import org.orangejar.modjam13.client.render.RenderRay;
import org.orangejar.modjam13.client.render.RenderWerWoolf;
import org.orangejar.modjam13.core.handlers.SoundHandler;
import org.orangejar.modjam13.entity.EntityBullet1911;
import org.orangejar.modjam13.entity.NPCWerWoolfWoofWoof;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void InitRendering()
	{
		 MinecraftForgeClient.registerItemRenderer(ModJam13.item1911.itemID, new Item1911Renderer());
		 MinecraftForgeClient.registerItemRenderer(ModJam13.potionItem.itemID, new RenderPotionmk1());
		 MinecraftForgeClient.registerItemRenderer(ModJam13.potionItem2.itemID, new RenderPotionmk2());
		 MinecraftForgeClient.registerItemRenderer(ModJam13.potionItem3.itemID, new RenderPotionmk3());
		 RenderingRegistry.registerEntityRenderingHandler(EntityBullet1911.class,new RenderRay(false));
		 RenderingRegistry.registerEntityRenderingHandler(NPCWerWoolfWoofWoof.class, new RenderWerWoolf());
	}
	public void registerEvent() {
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
}
