package com.lol.vmod.rendering.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPanda - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelPanda extends ModelBase {
    public ModelRenderer field_78148_b;
    public ModelRenderer field_78146_d;
    public ModelRenderer field_78144_f;
    public ModelRenderer field_78149_c;
    public ModelRenderer field_78147_e;
    public ModelRenderer headModel0;
    public ModelRenderer headModel1;
    public ModelRenderer headModel2;
    public ModelRenderer headModel3;

    public ModelPanda() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.headModel2 = new ModelRenderer(this, 52, 25);
        this.headModel2.setRotationPoint(0.0F, 11.5F, -17.0F);
        this.headModel2.addBox(-8.5F, -8.0F, -1.0F, 5, 4, 1, 0.0F);
        this.headModel1 = new ModelRenderer(this, 45, 16);
        this.headModel1.setRotationPoint(0.0F, 11.5F, -17.0F);
        this.headModel1.addBox(-3.5F, 0.0F, -6.0F, 7, 5, 2, 0.0F);
        this.field_78144_f = new ModelRenderer(this, 40, 0);
        this.field_78144_f.setRotationPoint(5.5F, 15.0F, -9.0F);
        this.field_78144_f.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.headModel3 = new ModelRenderer(this, 52, 25);
        this.headModel3.setRotationPoint(0.0F, 11.5F, -17.0F);
        this.headModel3.addBox(3.5F, -8.0F, -1.0F, 5, 4, 1, 0.0F);
        this.headModel0 = new ModelRenderer(this, 0, 6);
        this.headModel0.setRotationPoint(0.0F, 11.5F, -17.0F);
        this.headModel0.addBox(-6.5F, -5.0F, -4.0F, 13, 10, 9, 0.0F);
        this.field_78146_d = new ModelRenderer(this, 40, 0);
        this.field_78146_d.setRotationPoint(5.5F, 15.0F, 9.0F);
        this.field_78146_d.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.field_78149_c = new ModelRenderer(this, 40, 0);
        this.field_78149_c.setRotationPoint(-5.5F, 15.0F, 9.0F);
        this.field_78149_c.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
        this.field_78148_b = new ModelRenderer(this, 0, 25);
        this.field_78148_b.setRotationPoint(0.0F, 10.0F, 0.0F);
        this.field_78148_b.addBox(-9.5F, -13.0F, -6.5F, 19, 26, 13, 0.0F);
        this.setRotateAngle(field_78148_b, 1.593485607070823F, 0.0F, 0.0F);
        this.field_78147_e = new ModelRenderer(this, 40, 0);
        this.field_78147_e.setRotationPoint(-5.5F, 15.0F, -9.0F);
        this.field_78147_e.addBox(-3.0F, 0.0F, -3.0F, 6, 9, 6, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.headModel2.render(f5);
        this.headModel1.render(f5);
        this.field_78144_f.render(f5);
        this.headModel3.render(f5);
        this.headModel0.render(f5);
        this.field_78146_d.render(f5);
        this.field_78149_c.render(f5);
        this.field_78148_b.render(f5);
        this.field_78147_e.render(f5);
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
	this.field_78144_f.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	this.field_78146_d.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	this.field_78147_e.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	this.field_78149_c.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	
	this.headModel0.rotateAngleY = netHeadYaw * 0.017453292F;
	this.headModel0.rotateAngleX = headPitch * 0.017453292F;
	this.headModel1.rotateAngleY = netHeadYaw * 0.017453292F;
	this.headModel1.rotateAngleX = headPitch * 0.017453292F;
	this.headModel2.rotateAngleY = netHeadYaw * 0.017453292F;
	this.headModel2.rotateAngleX = headPitch * 0.017453292F;
	this.headModel3.rotateAngleY = netHeadYaw * 0.017453292F;
	this.headModel3.rotateAngleX = headPitch * 0.017453292F;
}

public void renderer() {
	// TODO Auto-generated method stub
	
}
}