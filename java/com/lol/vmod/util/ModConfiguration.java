package com.lol.vmod.util;

import java.io.File;

import com.lol.vmod.Main;
import com.lol.vmod.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ModConfiguration 
{
	public static Configuration config;
	
	public static int ENTITY_PANDA_ID = 201;
	public static int ENTITY_RAVANGER_ID = 202;
	public static int ENTITY_MOD_ID = 203;
	public static int ENTITY_FLY_ID = 204;
	
	public static int GUI_SINTERING_FURNACE_ID = 1;
	public static int GUI_COPPER_CHEST_ID = 2;
	public static int GUI_GLOWSTONE_GENERATOR_ID = 3;
	public static int GUI_ELECTRIC_SINTERING_FURNACE_ID = 4;
	public static int GUI_ENERGY_STORAGE_ID = 5;
	
	public static int DIMENSION_COPPER_ID = 2;
	
	public static boolean spawnCustomBiomesInOverworld = true;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Entity IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the entities to ensure that they don't clash with other mod's ids");
		ENTITY_PANDA_ID = config.getInt("ENTITY_BEAST_ID", category, 201, 201, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_RAVANGER_ID = config.getInt("ENTITY_Z_ID", category, 202, 202, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_MOD_ID = config.getInt("ENTITY_ZK_ID", category, 203, 203, 999, "Entity IDs below 201 are used by Minecraft");
		ENTITY_FLY_ID = config.getInt("ENTITY_FLY_ID", category, 204, 204, 999, "Entity IDs below 201 are used by Minecraft");
		
		
		category = "GUI IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		GUI_SINTERING_FURNACE_ID = config.getInt("GUI_SINTERING_FURNACE_ID", category, 1, 1, 999, "Set the ID for the Sintering Furnace (Non-Electric)");
		GUI_ELECTRIC_SINTERING_FURNACE_ID = config.getInt("GUI_ELECTRIC_SINTERING_FURNACE_ID", category, 4, 1, 999, "Set the ID for the Sintering Furnace (Electric)");
		GUI_COPPER_CHEST_ID = config.getInt("GUI_COPPER_CHEST_ID", category, 4, 1, 999, "Set the ID for the Copper Chest");
		GUI_GLOWSTONE_GENERATOR_ID = config.getInt("GUI_GLOWSTONE_GENERATOR_ID", category, 3, 1, 999, "Set the ID for the Glowstone Generator");
		GUI_ENERGY_STORAGE_ID = config.getInt("GUI_ENERGY_STORAGE_ID", category, 3, 1, 999, "Set the ID for the Energy Storage");
		
		category = "Dimension IDs";
		config.addCustomCategoryComment(category, "Set the ID's for the dimensions to ensure that they don't clash with other mod's ids");
		DIMENSION_COPPER_ID = config.getInt("DIMENSION_COPPER_ID", category, 2, 2, 999, "Set the ID for the Copper Dimension");
		
		category = "Biomes";
		config.addCustomCategoryComment(category, "Set the ID's for the GUI's to ensure that they don't clash with other mod's ids");
		spawnCustomBiomesInOverworld = config.getBoolean("spawnCustomBiomesInOverworld", category, true, "Decide whether the custom biomes should spawn in the overworld");	
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MODID + ".cfg"));
	}
} 
