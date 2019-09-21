package com.lol.vmod.creativetabs;

import com.lol.vmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TutorialTab extends CreativeTabs
{
	public TutorialTab() 
	{
		super("version");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.CROSSBOW);

	}
}
