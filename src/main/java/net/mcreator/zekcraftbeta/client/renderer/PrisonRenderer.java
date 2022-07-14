
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.PrisonEntity;
import net.mcreator.zekcraftbeta.client.model.ModelPrison;

public class PrisonRenderer extends MobRenderer<PrisonEntity, ModelPrison<PrisonEntity>> {
	public PrisonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPrison(context.bakeLayer(ModelPrison.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrisonEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/prison.png");
	}
}
