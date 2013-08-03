package org.orangejar.modjam13.blocks;

import java.awt.SplashScreen;

import javax.swing.text.html.parser.Entity;

import org.orangejar.modjam13.ModJam13;
import org.orangejar.modjam13.entity.EntityHolyBomb;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class holyBombBlock extends ItemBucketMilk{

	public holyBombBlock(int par1) {
		super(par1);
		// TODO Auto-generated constructor stub
		setCreativeTab(ModJam13.creativeTab);
	}
	
	
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        
            if (!par3EntityPlayer.capabilities.isCreativeMode)
            {
                --par1ItemStack.stackSize;
            }

            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
            	EntityHolyBomb ehb = new EntityHolyBomb(par2World, par3EntityPlayer, par1ItemStack);
                ehb.world = par2World;
            	par2World.spawnEntityInWorld(ehb);
            }

            return par1ItemStack;
       
    }
	
	
	
}
