package org.orangejar.modjam13.client.render;

import org.lwjgl.opengl.GL11;
import org.orangejar.modjam13.ModJam13;
import org.orangejar.modjam13.client.model.ModelCubeWorld;
import org.orangejar.modjam13.entity.NPCWerWoolfWoofWoof;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderWerWoolf extends Render
{
 private ModelCubeWorld model;
 private ModelCubeWorld model2;
 private static final ResourceLocation Texture = new ResourceLocation("/modjam13/textures/items/1911.png");
 
 public RenderWerWoolf ()
 {
	 model = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werwoolf.cub"));
	 model2 = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/life-potion.cub"));

 }
 
 public void doRenderLightningBlot(NPCWerWoolfWoofWoof par1EntityBullet, double par2, double par4, double par6, float par8, float par9)
 {
     GL11.glPushMatrix();
     
     GL11.glTranslatef((float)par2 + 0.5f, (float)par4 + 0.5f, (float)par6 + 0.5f);
     
     GL11.glScalef(1f, 1f, 1f);
    // FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Texture);
		model.render();
		this.doRenderLightningBlot2(par1EntityBullet, par2, par4, par6, par8, par9);

		GL11.glPopMatrix();
     
 }
 public void doRenderLightningBlot2(NPCWerWoolfWoofWoof par1EntityBullet, double par2, double par4, double par6, float par8, float par9)
 {
     GL11.glPushMatrix();
     
     GL11.glTranslatef((float)par2 + 0.5f, (float)par4 + 2f, (float)par6 + 0.5f);
     
     GL11.glScalef(1f, 1f, 1f);
    // FMLClientHandler.instance().getClient().renderEngine.func_110577_a(Texture);
		model2.render();

		GL11.glPopMatrix();
     
 }

 
 /**
  * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
  * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
  * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
  * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
  */
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
 {
     this.doRenderLightningBlot((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
 }

@Override
protected ResourceLocation func_110775_a(Entity entity) {
	// TODO Auto-generated method stub
	return null;
}
}