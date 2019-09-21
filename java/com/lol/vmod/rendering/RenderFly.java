package com.lol.vmod.rendering;

import javax.annotation.Nonnull;

import com.lol.vmod.Reference;
import com.lol.vmod.entity.BeeEntity;
import com.lol.vmod.rendering.models.entities.ModelBee;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFly extends RenderLiving<BeeEntity> {

	  private static final ResourceLocation BEE_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/bee.png");
	  private static final ResourceLocation TAMED_BEE_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/bee.png");
	   
	    private static final ResourceLocation ANRGY_BEE_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/bee_angry.png");

    public static final Factory FACTORY = new Factory();

    public RenderFly(RenderManager rendermanagerIn) {

        super(rendermanagerIn, new ModelBee(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull BeeEntity entity) {
    	 {
    	        if (entity.isTamed())
    	        {
    	            return TAMED_BEE_TEXTURES;
    	        }
    	        else
    	        {
    	            return entity.isAngry() ? ANRGY_BEE_TEXTURES : BEE_TEXTURES;
    	        }
    	    }
    	}

    public static class Factory implements IRenderFactory<BeeEntity> {

        @Override
        public Render<? super BeeEntity> createRenderFor(RenderManager manager) {
            return new RenderFly(manager);
        }

    }}
  