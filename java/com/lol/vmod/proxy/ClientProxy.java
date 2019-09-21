package com.lol.vmod.proxy;



import com.lol.vmod.init.InitModels;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy
{


public void registerItemRenderer(Item item, int meta, String id) 
{
	ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), id));
}  
@SubscribeEvent
public static void registerModels(final ModelRegistryEvent event) {
    InitModels.initModel();
}
@Override
public void preInit(FMLPreInitializationEvent e) {

}
}
