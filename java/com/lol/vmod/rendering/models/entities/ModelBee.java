package com.lol.vmod.rendering.models.entities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelBee - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelBee extends ModelBase {
	   private final ModelRenderer body;
	   private final ModelRenderer mainBody;
	   private final ModelRenderer leftWing;
	   private final ModelRenderer rightWing;
	   private final ModelRenderer frontLeg;
	   private final ModelRenderer midLeg;
	   private final ModelRenderer backLeg;
	   private final ModelRenderer stinger;
	   private final ModelRenderer leftAntenna;
	   private final ModelRenderer rightAntenna;
	   private float bodyPitch;

    public ModelBee() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.body = new ModelRenderer(this);
        this.body.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.mainBody = new ModelRenderer(this, 0, 0);
        this.mainBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body.addChild(this.mainBody);
        this.mainBody.addBox(-3.5F, -4.0F, -5.0F, 7, 7, 10, 0.0F);
        this.stinger = new ModelRenderer(this, 26, 7);
        this.stinger.addBox(0.0F, -1.0F, 5.0F, 0, 1, 2, 0.0F);
        this.mainBody.addChild(this.stinger);
        this.leftAntenna = new ModelRenderer(this, 2, 0);
        this.leftAntenna.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.leftAntenna.addBox(1.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
        this.rightAntenna = new ModelRenderer(this, 2, 3);
        this.rightAntenna.setRotationPoint(0.0F, -2.0F, -5.0F);
        this.rightAntenna.addBox(-2.5F, -2.0F, -3.0F, 1, 2, 3, 0.0F);
        this.mainBody.addChild(this.leftAntenna);
        this.mainBody.addChild(this.rightAntenna);
        this.leftWing = new ModelRenderer(this, 0, 18);
        this.leftWing.setRotationPoint(-1.5F, -4.0F, -3.0F);
        this.leftWing.rotateAngleX = 0.0F;
        this.leftWing.rotateAngleY = 0.2618F;
        this.leftWing.rotateAngleZ = 0.0F;
        this.body.addChild(this.leftWing);
        this.leftWing.addBox(-9.0F, 0.0F, 0.0F, 9, 0, 6, 0.001F);
        this.rightWing = new ModelRenderer(this, 0, 18);
        this.rightWing.setRotationPoint(1.5F, -4.0F, -3.0F);
        this.rightWing.rotateAngleX = 0.0F;
        this.rightWing.rotateAngleY = 0.2618F;
        this.rightWing.rotateAngleZ = 0.0F;
        this.rightWing.mirror = true;
        this.body.addChild(this.rightWing);
        this.rightWing.addBox(0.0F, 0.0F, 0.0F, 9, 0, 6, 0.001F);
        this.frontLeg = new ModelRenderer(this);
        this.frontLeg.setRotationPoint(1.5F, 3.0F, -2.0F);
        this.body.addChild(this.frontLeg);
        this.frontLeg.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F);
        this.midLeg = new ModelRenderer(this);
        this.midLeg.setRotationPoint(1.5F, 3.0F, 0.0F);
        this.body.addChild(this.midLeg);
        this.midLeg.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F);
        this.backLeg = new ModelRenderer(this);
        this.backLeg.setRotationPoint(1.5F, 3.0F, 2.0F);
        this.body.addChild(this.backLeg);
        this.backLeg.addBox(-5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.body.render(f5);
        
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
    	this.rightWing.rotateAngleZ = MathHelper.cos(ageInTicks * 1.3F) * (float)Math.PI * 0.25F;
    	this.leftWing.rotateAngleZ = -MathHelper.cos(ageInTicks * 1.3F) * (float)Math.PI * 0.25F;
    	
    }
}
