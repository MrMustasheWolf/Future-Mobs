package com.lol.vmod.rendering;

import com.lol.vmod.Reference;
import com.lol.vmod.entity.EntitymodArrow;

import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RendermodArrow extends RenderArrow<EntitymodArrow>
{
	public RendermodArrow(RenderManager manager) 
	{
		super(manager);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntitymodArrow entity) 
	{
		return new ResourceLocation(Reference.MODID + ":textures/entity/arrows/diamond_arrow.png");
	}
}
