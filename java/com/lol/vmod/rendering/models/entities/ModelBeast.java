package com.lol.vmod.rendering.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelCentaur - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBeast extends ModelBase {
    public ModelRenderer field_217173_i;
    public ModelRenderer field_217174_j;
    public ModelRenderer field_217171_g;
    public ModelRenderer field_217172_h;
    public ModelRenderer field_217170_f0;
    public ModelRenderer field_217170_f1;
    public ModelRenderer field_217175_k;
    public ModelRenderer field_217175_kChild0;
    public ModelRenderer field_217175_kChild1;
    public ModelRenderer field_217175_kChildChild;
    public ModelRenderer field_217175_kChildChild_1;
    public ModelRenderer field_217175_kChildChild_2;

    public ModelBeast() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.field_217174_j = new ModelRenderer(this, 64, 0);
        this.field_217174_j.mirror = true;
        this.field_217174_j.setRotationPoint(8.0F, -13.0F, -5.0F);
        this.field_217174_j.addBox(-4.0F, 0.0F, -4.0F, 8, 37, 8, 0.0F);
        this.field_217173_i = new ModelRenderer(this, 64, 0);
        this.field_217173_i.setRotationPoint(-8.0F, -13.0F, -5.0F);
        this.field_217173_i.addBox(-4.0F, 0.0F, -4.0F, 8, 37, 8, 0.0F);
        this.field_217171_g = new ModelRenderer(this, 96, 0);
        this.field_217171_g.setRotationPoint(-8.0F, -13.0F, 18.0F);
        this.field_217171_g.addBox(-4.0F, 0.0F, -4.0F, 8, 37, 8, 0.0F);
        this.field_217175_k = new ModelRenderer(this, 68, 73);
        this.field_217175_k.setRotationPoint(0.0F, -7.0F, -1.5F);
        this.field_217175_k.addBox(-5.0F, -1.0F, -18.0F, 10, 10, 18, 0.0F);
        this.field_217175_kChildChild = new ModelRenderer(this, 74, 55);
        this.field_217175_kChildChild.setRotationPoint(-10.0F, -14.0F, -8.0F);
        this.field_217175_kChildChild.addBox(0.0F, -14.0F, -2.0F, 2, 14, 4, 0.0F);
        this.setRotateAngle(field_217175_kChildChild, 1.0995573997497559F, 0.0F, 0.0F);
        this.field_217175_kChild0 = new ModelRenderer(this, 0, 0);
        this.field_217175_kChild0.setRotationPoint(0.0F, 16.1F, -10.5F);
        this.field_217175_kChild0.addBox(-8.0F, -20.0F, -14.0F, 16, 20, 16, 0.0F);
        this.field_217175_kChildChild_1 = new ModelRenderer(this, 74, 55);
        this.field_217175_kChildChild_1.mirror = true;
        this.field_217175_kChildChild_1.setRotationPoint(8.0F, -14.0F, -8.0F);
        this.field_217175_kChildChild_1.addBox(0.0F, -14.0F, -2.0F, 2, 14, 4, 0.0F);
        this.setRotateAngle(field_217175_kChildChild_1, 1.0995573997497559F, 0.0F, 0.0F);
        this.field_217170_f0 = new ModelRenderer(this, 0, 55);
        this.field_217170_f0.setRotationPoint(0.5F, 1.0F, 2.0F);
        this.field_217170_f0.addBox(-8.2F, -10.0F, -7.0F, 14, 16, 20, 0.1F);
        this.setRotateAngle(field_217170_f0, 1.5707963267948966F, 0.0F, 0.0F);
        this.field_217175_kChild1 = new ModelRenderer(this, 0, 0);
        this.field_217175_kChild1.setRotationPoint(0.0F, 16.0F, -10.4F);
        this.field_217175_kChild1.addBox(-2.0F, -6.0F, -18.0F, 4, 8, 4, 0.0F);
        this.field_217172_h = new ModelRenderer(this, 96, 0);
        this.field_217172_h.mirror = true;
        this.field_217172_h.setRotationPoint(8.0F, -13.0F, 18.0F);
        this.field_217172_h.addBox(-4.0F, 0.0F, -4.0F, 8, 37, 8, 0.0F);
        this.field_217170_f1 = new ModelRenderer(this, 0, 91);
        this.field_217170_f1.setRotationPoint(0.0F, -17.5F, 6.0F);
        this.field_217170_f1.addBox(-6.0F, 6.0F, -7.0F, 12, 13, 18, 0.0F);
        this.field_217175_kChildChild_2 = new ModelRenderer(this, 0, 36);
        this.field_217175_kChildChild_2.setRotationPoint(0.0F, -2.0F, 2.0F);
        this.field_217175_kChildChild_2.addBox(-8.0F, 0.0F, -16.0F, 16, 3, 16, 0.0F);
        this.field_217175_kChild0.addChild(this.field_217175_kChildChild);
        this.field_217175_k.addChild(this.field_217175_kChild0);
        this.field_217175_kChild0.addChild(this.field_217175_kChildChild_1);
        this.field_217175_k.addChild(this.field_217175_kChild1);
        this.field_217175_kChild0.addChild(this.field_217175_kChildChild_2);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_217174_j.render(f5);
        this.field_217173_i.render(f5);
        this.field_217171_g.render(f5);
        this.field_217175_k.render(f5);
        this.field_217170_f0.render(f5);
        this.field_217172_h.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.field_217170_f1.offsetX, this.field_217170_f1.offsetY, this.field_217170_f1.offsetZ);
        GlStateManager.translate(this.field_217170_f1.rotationPointX * f5, this.field_217170_f1.rotationPointY * f5, this.field_217170_f1.rotationPointZ * f5);
        GlStateManager.scale(1.3D, 1.4D, 1.0D);
        GlStateManager.translate(-this.field_217170_f1.offsetX, -this.field_217170_f1.offsetY, -this.field_217170_f1.offsetZ);
        GlStateManager.translate(-this.field_217170_f1.rotationPointX * f5, -this.field_217170_f1.rotationPointY * f5, -this.field_217170_f1.rotationPointZ * f5);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9990000000000001F);
        this.field_217170_f1.render(f5);
        GlStateManager.disableBlend();
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) 
    {
    	this.field_217174_j.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.field_217172_h.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.field_217173_i.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.field_217171_g.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.field_217175_k.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.field_217175_k.rotateAngleX = headPitch * 0.017453292F;
    }
}
