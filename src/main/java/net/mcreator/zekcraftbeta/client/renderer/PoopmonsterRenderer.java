
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.PoopmonsterEntity;
import net.mcreator.zekcraftbeta.client.model.ModelPoopmonster;

public class PoopmonsterRenderer extends MobRenderer<PoopmonsterEntity, ModelPoopmonster<PoopmonsterEntity>> {
	public PoopmonsterRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPoopmonster(context.bakeLayer(ModelPoopmonster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PoopmonsterEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/poop.png");
	}
}
