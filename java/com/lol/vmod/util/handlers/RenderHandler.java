package com.lol.vmod.util.handlers;


import com.lol.vmod.entity.EntityPanda2;
import com.lol.vmod.entity.EntityRavanger;
import com.lol.vmod.entity.EntitymodArrow;
import com.lol.vmod.entity.BeeEntity;
import com.lol.vmod.rendering.RenderFly;
import com.lol.vmod.rendering.RenderPanda;
import com.lol.vmod.rendering.RenderRavanger;
import com.lol.vmod.rendering.RendermodArrow;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {

	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityRavanger.class, new IRenderFactory<EntityRavanger>()
		{
			@Override
			public Render<? super EntityRavanger> createRenderFor(RenderManager manager) 
			{
				return new RenderRavanger(manager);
			}
		});
	
		{
			RenderingRegistry.registerEntityRenderingHandler(EntityPanda2.class, new IRenderFactory<EntityPanda2>()
			{
				@Override
				public Render<? super EntityPanda2> createRenderFor(RenderManager manager) 
				{
					return new RenderPanda(manager);
				}});
			{
				RenderingRegistry.registerEntityRenderingHandler(BeeEntity.class, new IRenderFactory<BeeEntity>()
				{
					@Override
					public Render<? super BeeEntity> createRenderFor(RenderManager manager) 
					{
						return new RenderFly(manager);
					
					}});
				
						
						}};
		;}{
			RenderingRegistry.registerEntityRenderingHandler(EntitymodArrow.class, new IRenderFactory<EntitymodArrow>() 
			{
				@Override
				public Render<? super EntitymodArrow> createRenderFor(RenderManager manager) 
				{
					return new RendermodArrow(manager);
				}
			});
		}
	}
	

	

		


