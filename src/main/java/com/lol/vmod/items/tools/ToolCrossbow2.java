package com.lol.vmod.items.tools;

import com.lol.vmod.Main;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;



public class ToolCrossbow2 extends TooleCrossbow2 implements IHasModel, Modeled {

	public ToolCrossbow2(String name, ToolMaterial material)
	{
		super();
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.MODELED.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}