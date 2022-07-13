
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.SpinningCockroachEntity;
import net.mcreator.zekcraftbeta.client.model.Modelcockroach;

public class SpinningCockroachRenderer extends MobRenderer<SpinningCockroachEntity, Modelcockroach<SpinningCockroachEntity>> {
	public SpinningCockroachRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcockroach(context.bakeLayer(Modelcockroach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpinningCockroachEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/cockroach.png");
	}
}
