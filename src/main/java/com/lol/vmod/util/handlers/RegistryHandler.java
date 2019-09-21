package com.lol.vmod.util.handlers;

import com.lol.vmod.Main;
import com.lol.vmod.client.Modeled;
import com.lol.vmod.init.EntityInit;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.util.IHasModel;
import com.lol.vmod.util.ModConfiguration;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber
public class RegistryHandler 
{
	public static final String MODELED = null;
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{

		event.getRegistry().registerAll(ModItems.MODELED.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event)
	{}
		
	
	@SubscribeEvent
	public static void registerEnchantment(RegistryEvent.Register<Enchantment> event)
	{
	
	}
	
	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void onModelRegister(ModelRegistryEvent event)
	{
		
	
		RenderHandler.registerEntityRenders();
		for(Modeled item : ModItems.MODELED)
		{
		Main.proxy.registerItemRenderer((Item) item, 0, "inventory");
		}
		
		
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{		
		
		
		for(Modeled item : ModItems.MODELED)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
	
		}
	
	
	public static void preInitRegistries(FMLPreInitializationEvent event)
	{
		
		
		
		EntityInit.registerEntities();
	
		ModConfiguration.registerConfig(event);
	}
	
	public static void initRegistries(FMLInitializationEvent event)
	{

		SoundsHandler.registerSounds();	
		Main.proxy.render();
	}
	
	public static void postInitRegistries(FMLPostInitializationEvent event)
	{
	
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{

	}


	

	   


			
		}
