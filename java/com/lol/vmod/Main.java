package com.lol.vmod;

import java.io.File;


import com.lol.vmod.creativetabs.TutorialTab;
import com.lol.vmod.init.ModItems;
import com.lol.vmod.proxy.CommonProxy;
import com.lol.vmod.util.handlers.RegistryHandler;
import net.minecraft.block.BlockDispenser;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorProjectileDispense;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.SERVER)
	public static CommonProxy proxy;
	
	public static final CreativeTabs VERSION = new TutorialTab();
	
	public static File config;
	
	static { FluidRegistry.enableUniversalBucket(); }
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		RegistryHandler.preInitRegistries(e);

		
		    proxy.preInit(e);
	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
       
	}
		       
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		RegistryHandler.postInitRegistries(event);
	}
	
	@EventHandler
	public void serverInit(FMLServerStartingEvent event)
	{
		RegistryHandler.serverRegistries(event);
	}






   



   
        
    ;}
