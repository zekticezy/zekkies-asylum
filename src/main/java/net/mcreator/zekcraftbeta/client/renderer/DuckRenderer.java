
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.DuckEntity;
import net.mcreator.zekcraftbeta.client.model.Modelduck;

public class DuckRenderer extends MobRenderer<DuckEntity, Modelduck<DuckEntity>> {
	public DuckRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelduck(context.bakeLayer(Modelduck.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DuckEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/duck.png");
	}
}
