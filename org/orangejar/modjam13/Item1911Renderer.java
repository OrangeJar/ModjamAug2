package org.orangejar.modjam13;

import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.client.FMLClientHandler;

public class Item1911Renderer implements IItemRenderer
{
	private Model1911 model1911;
	private static final ResourceLocation textur = new ResourceLocation("/modjam13/textures/items/1911.png");
	
	public Item1911Renderer()
	{
		model1911 = new Model1911();
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type)
	{
		return true;
	}
	
	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper)
	{
		return true;
	}
	
	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data)
	{
		
		switch(type)
		{
			case ENTITY:{
				render1911(0f, 0f, 0f, 0.07f);
				return;
			}
			
			case EQUIPPED:{
				render1911(0.3f, 1f, 0.5f, 0.04f);
				return;
			}
				
			case INVENTORY:{
				render1911(0f, 0f, 0f, 0.01f);
				return;
			}
			case EQUIPPED_FIRST_PERSON:{
				renderInv(1f, 0.5f, 0.1f, 0.04f);
				return;
			}
			
			default:return;
		}
		
	}
	
	
	private void render1911(float x, float y, float z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		
		GL11.glTranslatef(x,  y,  z);
		GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(220F, 0F, 1F, 0F);
		
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(textur);
		
		model1911.render();
		
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}
	
	private void renderInv(float x, float y, float z, float scale)
	{
		GL11.glPushMatrix();
		GL11.glDisable(GL11.GL_LIGHTING);
		
		GL11.glTranslatef(x,  y,  z);
		GL11.glScalef(scale, scale, scale);
        GL11.glRotatef(120F, 0F, 1F, 0F);

		
		FMLClientHandler.instance().getClient().renderEngine.func_110577_a(textur);
		
		model1911.render();
		
		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glPopMatrix();
	}

}
