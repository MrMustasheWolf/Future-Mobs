package com.lol.vmod.util.handlers;

import com.lol.vmod.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler 
{
	public static final ResourceLocation CENTAUR = LootTableList.register(new ResourceLocation(Reference.MODID, "centaur"));
}
