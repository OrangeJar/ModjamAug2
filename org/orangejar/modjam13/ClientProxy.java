package org.orangejar.modjam13;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void InitRendering()
	{
		 MinecraftForgeClient.registerItemRenderer(ModJam13.item1911.itemID, new Item1911Renderer());
		 RenderingRegistry.registerEntityRenderingHandler(EntityBullet1911.class,new RenderRay(false));
	}
}
