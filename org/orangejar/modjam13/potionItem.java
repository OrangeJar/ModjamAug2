package org.orangejar.modjam13;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class potionItem extends ItemBucketMilk {

	private int duration; 
	
	
	
	public potionItem(int par1,int mark) {
		super(par1);
		// TODO Auto-generated constructor stub
		setCreativeTab(CreativeTabs.tabBrewing);
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
	
}
