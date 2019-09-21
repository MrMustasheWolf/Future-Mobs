package com.lol.vmod.init;

import com.lol.vmod.Main;
import com.lol.vmod.Reference;
import com.lol.vmod.entity.EntityPanda2;
import com.lol.vmod.entity.EntityRavanger;
import com.lol.vmod.entity.EntitymodArrow;
import com.lol.vmod.entity.BeeEntity;
import com.lol.vmod.util.ModConfiguration;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("panda", EntityPanda2.class, ModConfiguration.ENTITY_PANDA_ID, 50, 11437176, 000000);
		registerEntity("ravanger", EntityRavanger.class, ModConfiguration.ENTITY_RAVANGER_ID, 50, 11437146, 000000);
		registerEntity("fly", BeeEntity.class, ModConfiguration.ENTITY_FLY_ID, 50, 11437146, 000000);
		registerArrow("newarrow", EntitymodArrow.class, ModConfiguration.ENTITY_MOD_ID);
	
	}
	
	private static void registerArrow(String name, Class<? extends Entity> entity, int id)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, 64, 20, true);
	}

	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
