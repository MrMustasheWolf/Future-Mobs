package com.lol.vmod.items.tools;

import com.lol.vmod.Main;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.entity.EntitymodArrow;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NewArrow extends ItemArrow implements IHasModel, Modeled
{
	public NewArrow(String name, Object object) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);

		
		ModItems.MODELED.add(this);
	}
	
	@Override
	public EntityArrow createArrow(World worldIn, ItemStack stack, EntityLivingBase shooter) 
	{
		EntitymodArrow entityDiamondArrow = new EntitymodArrow(worldIn, shooter);
		return entityDiamondArrow;
	}

@Override
public void registerModels() 
{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
}
}