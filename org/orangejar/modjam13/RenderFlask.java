package org.orangejar.modjam13;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;


public class RenderFlask implements IItemRenderer {

    ModelCubeWorld model;

    public RenderFlask() {
        model = new ModelCubeWorld(ModJam13.class.getResourceAsStream("/assets/modjam13/models/life-potion.cub"));
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
            GL11.glTranslatef(0F, 0F, -0.3F);
            GL11.glRotatef(25F, 1F, 0F, 0F);
            GL11.glRotatef(-15F, 0F, 1F, 0F);
        }

        model.render();
        GL11.glPopMatrix();
    }
}