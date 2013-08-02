package org.orangejar.modjam13;

import org.lwjgl.opengl.GL11;




import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Vec3;

public class RenderRay extends RenderEntity {

	public static double WIDTH = 0.05F;
	private static Tessellator tessellator = Tessellator.instance;
	protected boolean renderColor;
	 private static final ResourceLocation Texture = new ResourceLocation("/modjam13/textures/items/1911.png");

	public RenderRay(boolean hasColor) {
		this.renderColor = hasColor;
	}

	protected ResourceLocation Render(EntityBullet1911 par1EntityBullet1911)
    {
        return Texture;
    }
	@Override
	public void doRender(Entity par1Entity, double par2, double par4,
			double par6, float par8, float par9) {

		
		
		tessellator = Tessellator.instance;

		GL11.glPushMatrix();


		// Translations and rotations
		// Translations and rotations
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		GL11.glTranslatef((float) par2, (float) par4, (float) par6);
		GL11.glDepthMask(true);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glDisable(GL11.GL_LIGHTING);
		GL11.glTranslatef(0, 0.4F, 0);
		GL11.glRotatef(7.5F, -1.0F, 0.0F, 0.0F);
		GL11.glTranslatef(0, -0.4F, 0);
		
		// drawing>)
		OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240f, 240f);
		tessellator.startDrawingQuads();
		tessellator.setBrightness(15728880);
		

		tessellator.draw();

		GL11.glEnable(GL11.GL_LIGHTING);
		GL11.glEnable(GL11.GL_TEXTURE_2D);
		GL11.glPopMatrix();
	}


	protected void addVertex(Vec3 vec3, double texU, double texV) {
		tessellator.addVertexWithUV(vec3.xCoord, vec3.yCoord, vec3.zCoord,
				texU, texV);
	}
	

}
