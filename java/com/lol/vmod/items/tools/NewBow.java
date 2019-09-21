package com.lol.vmod.items.tools;

import javax.annotation.Nullable;

import com.lol.vmod.Main;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.util.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class NewBow extends ItemBow implements IHasModel, Modeled
{
	public NewBow(String name, ToolMaterial material)
	{	super();
		setUnlocalizedName(name);
		setRegistryName(name);

		setMaxDamage(800);
		setMaxStackSize(1);
		ModItems.MODELED.add(this);
		
		this.addPropertyOverride(new ResourceLocation("pull"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                if (entityIn == null)
                {
                    return 0.0F;
                }
                else
                {
                    return entityIn.getActiveItemStack().getItem() != ModItems.NEWBOW ? 0.0F : (float)(stack.getMaxItemUseDuration() - entityIn.getItemInUseCount()) / 20.0F;
                }
            }
        });
        this.addPropertyOverride(new ResourceLocation("pulling"), new IItemPropertyGetter()
        {
            @SideOnly(Side.CLIENT)
            public float apply(ItemStack stack, @Nullable World worldIn, @Nullable EntityLivingBase entityIn)
            {
                return entityIn != null && entityIn.isHandActive() && entityIn.getActiveItemStack() == stack ? 1.0F : 0.0F;
            }
        });
		
        ModItems.MODELED.add(this);
	}
	
	@Override
	public int getItemEnchantability() 
	{
		return 10;
	}
	
	@Override
	protected boolean isArrow(ItemStack stack) 
	{
		if(stack.getItem() == ModItems.NEWARROW)
		{
			return true;
		}
		return false;
	}

@Override
public void registerModels() 
{
	Main.proxy.registerItemRenderer(this, 0, "inventory");
}
}