package org.orangejar.modjam13;

import net.minecraft.entity.EntityLivingData;
import net.minecraft.entity.monster.EntityZombie;


public class NPCWerWoolfGroupData implements EntityLivingData {
	
	public boolean field_142048_a;
    public boolean field_142046_b;

    final NPCWerWoolfWoofWoof field_142047_c;
    
    private NPCWerWoolfGroupData(NPCWerWoolfWoofWoof par1EntityZombie, boolean par2, boolean par3)
    {
    	this.field_142047_c = par1EntityZombie;
        this.field_142048_a = false;
        this.field_142046_b = false;
        this.field_142048_a = par2;
        this.field_142046_b = par3;
    }
    
    
    NPCWerWoolfGroupData(NPCWerWoolfWoofWoof par1EntityZombie, boolean par2, boolean par3, NPCWerWoolfINNER1 par4EntityZombieINNER1)
    {
    	 this(par1EntityZombie, par2, par3);
    }
    
}
