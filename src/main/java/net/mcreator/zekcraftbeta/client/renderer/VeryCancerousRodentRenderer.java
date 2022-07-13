
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.VeryCancerousRodentEntity;
import net.mcreator.zekcraftbeta.client.model.ModelVCR;

public class VeryCancerousRodentRenderer extends MobRenderer<VeryCancerousRodentEntity, ModelVCR<VeryCancerousRodentEntity>> {
	public VeryCancerousRodentRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelVCR(context.bakeLayer(ModelVCR.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VeryCancerousRodentEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/vcr.png");
	}
}
