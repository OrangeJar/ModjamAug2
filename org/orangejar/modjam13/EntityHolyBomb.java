package org.orangejar.modjam13;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityHolyBomb extends EntityPotion {

	
	public static World world;
	private int i = 0; //counter for exp
	
	public EntityHolyBomb(World par1World,
			EntityLivingBase par2EntityLivingBase, ItemStack par3ItemStack) {
		super(par1World, par2EntityLivingBase, par3ItemStack);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onImpact(MovingObjectPosition mop)
    { 
		if(i == 0){
		EntityTNTPrimed tnt = new EntityTNTPrimed(world,(double) mop.blockX, (double)mop.blockY, (double)mop.blockZ, (EntityLivingBase)null);
		tnt.fuse = 1;
		world.spawnEntityInWorld(tnt);
		}
		
		
		
    }

}
