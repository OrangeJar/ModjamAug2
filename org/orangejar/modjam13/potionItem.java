package org.orangejar.modjam13;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class potionItem extends Item{

	private int duration; 
	
	
	
	public potionItem(int par1,int mark) {
		super(par1);
		// TODO Auto-generated constructor stub
		setCreativeTab(ModJam13.creativeTab);
		this.setMaxStackSize(3);
		setUnlocalizedName("ultrapotion" + mark);
	}
	
	
	public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer player)
    {
        if (!player.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            //par3EntityPlayer.curePotionEffects(par1ItemStack);
        	
        	player.addPotionEffect(getRandomEff(duration));
        }

        return par1ItemStack.stackSize <= 0 ? new ItemStack(Item.bucketEmpty) : par1ItemStack;
    }
	
	private PotionEffect getRandomEff(int Duration){
		Random rnd = new Random();
		PotionEffect eff = new PotionEffect(rnd.nextInt(21), Duration);  //1-potion id, 2 - duration
		return eff;
	}
	
	public void setDuration(int Duration)
	{
		this.duration = Duration;
	}
	

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
	
}
