package org.orangejar.modjam13.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet1911 extends EntityThrowable
{

    public EntityBullet1911(World par1World, EntityLivingBase par2EntityLiving,
			ItemStack itemStack)
    {
        super(par1World, par2EntityLiving);
		double f1 = par1World.isRemote ? 0.06 : 0.3;
        
    }

    public EntityBullet1911(World par1World, EntityLivingBase par2EntityLivingBase)
    {
        super(par1World, par2EntityLivingBase);
    }

    public EntityBullet1911(World par1World, double par2, double par4, double par6)
    {
        super(par1World, par2, par4, par6);
    }
    
    protected float getGravityVelocity() {
		return 0.0F;
	}

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
    	/*if (par1MovingObjectPosition.entityHit != null)
        {
           byte b0 = 0;
            if (par1MovingObjectPosition.entityHit instanceof EntityBlaze)
            {
                b0 = 0;
            }
            par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), b0);
        }
        for (int i = 0; i < 0; ++i)
        {
            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
        }
        if (!this.worldObj.isRemote)
        {
            this.setDead();
        }*/
    	if (par1MovingObjectPosition.entityHit != null) {

			par1MovingObjectPosition.entityHit.attackEntityFrom(
					DamageSource.causeThrownDamage(this, this.getThrower()), 7);
		}

		if (!this.worldObj.isRemote) {
			this.setDead();
		}
    }
}
