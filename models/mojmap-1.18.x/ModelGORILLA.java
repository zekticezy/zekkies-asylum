// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelGORILLA<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "GORILLA"), "main");
	private final ModelPart bb_main;

	public ModelGORILLA(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(40, 34)
						.addBox(-12.0F, -9.0F, -19.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(8.0F, -9.0F, -19.0F, 6.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 53)
						.addBox(-11.0F, -16.0F, -18.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 15)
						.addBox(9.0F, -16.0F, -18.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -18.0F, -19.0F, 16.0F, 6.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(0, 34)
						.addBox(-5.0F, -25.0F, -20.0F, 11.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-7.0F, -12.0F, 4.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(35, 49)
						.addBox(4.0F, -12.0F, 4.0F, 4.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(53, 49)
						.addBox(-3.0F, -21.0F, -21.0F, 7.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}