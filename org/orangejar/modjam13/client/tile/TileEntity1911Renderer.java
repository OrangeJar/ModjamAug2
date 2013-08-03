package org.orangejar.modjam13.client.tile;

import org.orangejar.modjam13.client.model.Model1911;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

public class TileEntity1911Renderer extends TileEntitySpecialRenderer
{
	private Model1911 model1911 = new Model1911();
	
	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
	{
		model1911.render((TileEntityItem1911)tileEntity, x, y, z);
	}
}
