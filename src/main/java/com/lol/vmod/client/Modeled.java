package com.lol.vmod.client;

import com.lol.vmod.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public interface Modeled {
    @SideOnly(Side.CLIENT)
    default void model() {
        ModelLoader.setCustomModelResourceLocation((Item) this, 0, new ModelResourceLocation(((Item) this).getRegistryName(), "inventory"));
    }

    default void addModel() {
        ModItems.MODELED.add(this);
    }
}
