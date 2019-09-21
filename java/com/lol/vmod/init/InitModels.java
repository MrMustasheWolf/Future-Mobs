package com.lol.vmod.init;

import com.lol.vmod.client.Modeled;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public final class InitModels {
    public static void initModel() {
        for(Modeled modeled : ModItems.MODELED) {
            if(modeled instanceof Item) {
                if(ForgeRegistries.ITEMS.getValue(((Item) modeled).getRegistryName()) != null) {
                    modeled.model();
                }
            } else {
                if(ForgeRegistries.BLOCKS.getValue(((Block) modeled).getRegistryName()) != null) {
                    modeled.model();
                }
            }}}}
        
     
      
      