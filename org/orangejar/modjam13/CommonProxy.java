package org.orangejar.modjam13;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy
{
	public void InitRendering()
	{
	}
	
	public void registerEvent() {
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
	}
}
