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
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderWerWoolf extends Render
{
 private ModelCubeWorld head;
 private ModelCubeWorld body;
 private ModelCubeWorld werewolf_left_hand;
 private ModelCubeWorld werewolf_right_hand;
 private ModelCubeWorld foot;
 private static final ResourceLocation Texture = new ResourceLocation("/modjam13/textures/items/1911.png");
 
 public RenderWerWoolf ()
 {
	 head = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werewolf-head.cub"));
	 body = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werewolf-body.cub"));
	 werewolf_left_hand = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werewolf-hand.cub"));
	 werewolf_right_hand = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werewolf-right-hand.cub"));
	 foot = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/werewolf-foot.cub"));

 }
 
 public void renderHead(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + 0.0f, (float)y + 0.5f, (float)z + 0.5f);
     GL11.glScalef(0.85f, 0.85f, 0.85f);
	 head.render();
	 GL11.glPopMatrix();
     
 }
 public void renderBody(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	/* GL11.glPushMatrix();
	 GL11.glTranslatef(0.0f, -0.6f, -0.3f);
     GL11.glScalef(1f, 1f, 1f);
	 model.render();
	 GL11.glPopMatrix();*/
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + 0.0f, (float)y + 0.05f, (float)z + 0.4f);
     GL11.glScalef(1f, 1f, 1f);
	 body.render();
	 GL11.glPopMatrix();
 }
 public void renderHandLeft(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + -0.3f, (float)y + 0.5f, (float)z + 0.1f);
     GL11.glRotatef(-50f, 0f, 0f, 1f);
     GL11.glScalef(0.65f, 0.65f, 0.65f);
	 werewolf_left_hand.render();
	 GL11.glPopMatrix();
 }
 
 public void renderFootLeft(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + 0.0f, (float)y + 0.0f, (float)z + 0.25f);
     GL11.glScalef(0.85f, 0.85f, 0.85f);
	 foot.render();
	 GL11.glPopMatrix();
     
 }
 public void renderFootRight(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + 0.35f, (float)y + 0.0f, (float)z + 0.25f);
     GL11.glScalef(0.85f, 0.85f, 0.85f);
	 foot.render();
	 GL11.glPopMatrix();
     
 }
 public void renderHandRight(NPCWerWoolfWoofWoof par1EntityBullet, double x, double y, double z, float par8, float par9)
 {
	 GL11.glPushMatrix();
     GL11.glTranslatef((float)x + 0.7f, (float)y + 0.25f, (float)z + 0.1f);
     GL11.glRotatef(50f, 0f, 0f, 1f);
     GL11.glScalef(0.65f, 0.65f, 0.65f);
	 werewolf_right_hand.render();
	 GL11.glPopMatrix();
     
 }

 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
 {
     this.renderHead((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
     this.renderBody((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
     this.renderHandLeft((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
     this.renderHandRight((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
     this.renderFootLeft((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
     this.renderFootRight((NPCWerWoolfWoofWoof)par1Entity, par2, par4, par6, par8, par9);
 }

@Override
protected ResourceLocation func_110775_a(Entity entity) {
	// TODO Auto-generated method stub
	return null;
}
}