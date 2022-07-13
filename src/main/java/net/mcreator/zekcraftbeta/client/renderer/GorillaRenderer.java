
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.GorillaEntity;
import net.mcreator.zekcraftbeta.client.model.ModelGORILLA;

public class GorillaRenderer extends MobRenderer<GorillaEntity, ModelGORILLA<GorillaEntity>> {
	public GorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGORILLA(context.bakeLayer(ModelGORILLA.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorillaEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/goril.png");
	}
}
