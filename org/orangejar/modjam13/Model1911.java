package org.orangejar.modjam13;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

import org.lwjgl.opengl.GL11;

import buildcraft.core.DefaultProps;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class Model1911 extends ModelBase
{
	private IModelCustom model1911;
	private static final ResourceLocation textur = new ResourceLocation("/assets/modjam13/textures/items/1911.png");
	
	public Model1911()
	{
		model1911 = AdvancedModelLoader.loadModel("/assets/modjam13/models/1911.obj");
	}
	
	public void render()
	{
		model1911.renderAll();
	}
	
	
	public void render(TileEntityItem1911 box, double x, double y, double z)
	{
		GL11.glPushMatrix();

		GL11.glTranslatef((float)x + 0.5f, (float)y + 0.5f, (float)z + 0.5f);
		
		GL11.glScalef(0.01f, 0.01f, 0.01f);
		
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(textur);

		this.render();

		GL11.glPopMatrix();
	}
}
