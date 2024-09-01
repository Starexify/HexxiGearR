package net.nova.hexxit_gear.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.nova.hexxit_gear.HexxitGearR;

public class ScaleHelmetModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(HexxitGearR.rl("scale_helmet"), "main");
    public static final ResourceLocation TEXTURE = HexxitGearR.rl("textures/models/armor/scale_helmet.png");
    public final ModelPart root;

    public ScaleHelmetModel(ModelPart root) {
        this.root = root.getChild("root");
    }

    public static LayerDefinition createLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 9.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(-4.0F, -8.0F, -4.75F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(41, 0).addBox(-6.0F, -7.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(50, 2).addBox(-7.0F, -8.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 4).addBox(-8.0F, -8.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(-9.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(-9.0F, -6.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(41, 0).addBox(5.0F, -7.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(50, 2).addBox(6.0F, -8.0F, 0.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 4).addBox(7.0F, -8.0F, 1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(7.0F, -8.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(7.0F, -6.0F, 2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 35);
    }

    @Override
    public void setupAnim(T pEntity, float pLimbSwing, float pLimbSwingAmount, float pAgeInTicks, float pNetHeadYaw, float pHeadPitch) {
        this.root.yRot = pNetHeadYaw / (180F / (float) Math.PI);
        this.root.xRot = pHeadPitch / (180F / (float) Math.PI);
    }

    @Override
    public void renderToBuffer(PoseStack pPoseStack, VertexConsumer pBuffer, int pPackedLight, int pPackedOverlay, int pColor) {
        root.render(pPoseStack, pBuffer, pPackedLight, pPackedOverlay, pColor);
    }
}
