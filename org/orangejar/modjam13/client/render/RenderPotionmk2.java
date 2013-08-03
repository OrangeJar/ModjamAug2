package org.orangejar.modjam13.client.render;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;
import org.orangejar.modjam13.ModJam13;
import org.orangejar.modjam13.client.model.ModelCubeWorld;

public class RenderPotionmk2 implements IItemRenderer {

    ModelCubeWorld model;

    public RenderPotionmk2() {
        model = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/mana-potion.cub"));
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return type == ItemRenderType.EQUIPPED || type == ItemRenderType.EQUIPPED_FIRST_PERSON;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        GL11.glPushMatrix();
        GL11.glRotatef(90F, 0F, 0F, 1F);
        GL11.glRotatef(90F, 0F, 1F, 0F);
        GL11.glScalef(0.75F, 0.75F, 0.75F);
        GL11.glTranslatef(-0.45F, -1.5F, 0.4F);
        GL11.glRotatef(25F, 1F, 0F, 0F);

        if (type == ItemRenderType.EQUIPPED_FIRST_PERSON) {
            //GL11.glTranslatef(1.5F, 1.0F, 0);
        	GL11.glScalef(1.8F, 1.8F, 1.8F);
        	//GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
            GL11.glRotatef(40F, 1F, 0F, 0F);
            GL11.glRotatef(-15F, 0F, 1F, 0F);
           // float f6 = 1.5F;
            //GL11.glScalef(f6, f6, f6);
            //GL11.glRotatef(40.0F, 0.0F, 1.0F, 0.0F);
           // GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
            //GL11.glTranslatef(-0.9375F, -0.0625F, -0.3F);
        }

        model.render();
        GL11.glPopMatrix();
    }
}
