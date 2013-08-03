package org.orangejar.modjam13.core.proxy;

import org.orangejar.modjam13.core.handlers.SoundHandler;

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
