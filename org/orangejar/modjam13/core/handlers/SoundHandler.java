package org.orangejar.modjam13.core.handlers;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.sound.PlaySoundEffectEvent;
import net.minecraftforge.client.event.sound.PlaySoundEvent;
import net.minecraftforge.client.event.sound.PlayStreamingEvent;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler{
	@ForgeSubscribe
public void onSound(SoundLoadEvent event) {
// You add them the same way as you add blocks.
//event.manager.addSound("modjam13:bang");
			event.manager.soundPoolSounds.addSound("modjam13:plgunc.ogg");


}
}