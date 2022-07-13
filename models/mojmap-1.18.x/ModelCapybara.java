// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCapybara<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "capybara"), "main");
	private final ModelPart bb_main;

	public ModelCapybara(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(30, 24)
						.addBox(-4.0F, -7.0F, -9.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 24)
						.addBox(3.0F, -7.0F, -9.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(3.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-4.0F, -6.0F, 3.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -14.0F, -9.0F, 9.0F, 7.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(18, 21)
						.addBox(-4.0F, -7.0F, 3.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(-3.0F, -16.0F, -13.0F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, -14.0F, -15.0F, 5.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(-3.0F, -17.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 0)
						.addBox(3.0F, -17.0F, -12.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}