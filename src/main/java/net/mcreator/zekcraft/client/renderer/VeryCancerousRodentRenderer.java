
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.VeryCancerousRodentEntity;
import net.mcreator.zekcraft.client.model.ModelVCR;

public class VeryCancerousRodentRenderer extends MobRenderer<VeryCancerousRodentEntity, ModelVCR<VeryCancerousRodentEntity>> {
	public VeryCancerousRodentRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVCR(context.bakeLayer(ModelVCR.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VeryCancerousRodentEntity entity) {
		return new ResourceLocation("zekcraft:textures/vcr.png");
	}
}
