/**
 * This class was created by <Vazkii>. It's distributed as
 * part of Vazkii's Magic Mod.
 * 
 * Vazkii's Magic Mod is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * https://github.com/Vazkii/MagicMod 
 *
 * File Created @ [25 Jul 2013, 15:27:39 (GMT)]
 */
package org.orangejar.modjam13;

import java.io.File;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
public class Item1911 extends Item {

    public Item1911(int par1) {
        super(par1);
        setCreativeTab(ModJam13.creativeTab);

    }
    

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }
        //par2World.playSoundAtEntity(par3EntityPlayer, "ironforge", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
        //par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1F, 1F);
        //par2World.playSoundAtEntity(par3EntityPlayer, "modjam13.bang", 1.0F, 1.0F);
        par3EntityPlayer.worldObj.playSoundAtEntity(par3EntityPlayer, "modjam13:plgunc", 1.0F, 1.0F);
        
        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntityBullet1911(par2World, par3EntityPlayer));
        }
        return par1ItemStack;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }
}
