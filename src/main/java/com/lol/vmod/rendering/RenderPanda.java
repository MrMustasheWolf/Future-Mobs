package com.lol.vmod.rendering;

import javax.annotation.Nonnull;

import com.lol.vmod.Reference;
import com.lol.vmod.entity.EntityPanda2;
import com.lol.vmod.rendering.models.entities.ModelPanda;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderPanda extends RenderLiving<EntityPanda2> {

	private ResourceLocation mobTexture = new ResourceLocation(Reference.MODID + ":textures/entity/panda.png");

    public static final Factory FACTORY = new Factory();

    public RenderPanda(RenderManager rendermanagerIn) {
       
        super(rendermanagerIn, new ModelPanda(), 0.5F);
    }	

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityPanda2 entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityPanda2> {

        @Override
        public Render<? super EntityPanda2> createRenderFor(RenderManager manager) {
            return new RenderPanda(manager);
        }

    }

}