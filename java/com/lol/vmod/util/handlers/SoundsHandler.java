package com.lol.vmod.util.handlers;

import com.lol.vmod.Main;
import com.lol.vmod.Reference;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBow;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler 
{
	public static SoundEvent ENTITY_CENTAUR_AMBIENT, ENTITY_CENTAUR_HURT, ENTITY_CENTAUR_DEATH;
	
	public static void registerSounds()
	{
		ENTITY_CENTAUR_AMBIENT = registerSound("entity.centaur.ambient");
		ENTITY_CENTAUR_HURT = registerSound("entity.centaur.hurt");
		ENTITY_CENTAUR_DEATH = registerSound("entity.centaur.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}










