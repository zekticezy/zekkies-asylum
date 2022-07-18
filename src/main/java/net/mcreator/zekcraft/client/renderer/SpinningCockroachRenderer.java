
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.SpinningCockroachEntity;
import net.mcreator.zekcraft.client.model.Modelcockroach;

public class SpinningCockroachRenderer extends MobRenderer<SpinningCockroachEntity, Modelcockroach<SpinningCockroachEntity>> {
	public SpinningCockroachRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcockroach(context.bakeLayer(Modelcockroach.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpinningCockroachEntity entity) {
		return new ResourceLocation("zekcraft:textures/cockroach.png");
	}
}
