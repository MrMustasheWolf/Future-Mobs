package com.lol.vmod.rendering;

import javax.annotation.Nonnull;

import com.lol.vmod.Reference;
import com.lol.vmod.entity.EntityRavanger;
import com.lol.vmod.rendering.models.entities.ModelBeast;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderRavanger extends RenderLiving<EntityRavanger> {

    private ResourceLocation mobTexture = new ResourceLocation(Reference.MODID + ":textures/entity/beast.png");

    public static final Factory FACTORY = new Factory();

    public RenderRavanger(RenderManager rendermanagerIn) {

        super(rendermanagerIn, new ModelBeast(), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityRavanger entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityRavanger> {

        @Override
        public Render<? super EntityRavanger> createRenderFor(RenderManager manager) {
            return new RenderRavanger(manager);
        }

    }

}