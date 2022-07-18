
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.PrisonEntity;
import net.mcreator.zekcraft.client.model.ModelPrison;

public class PrisonRenderer extends MobRenderer<PrisonEntity, ModelPrison<PrisonEntity>> {
	public PrisonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPrison(context.bakeLayer(ModelPrison.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrisonEntity entity) {
		return new ResourceLocation("zekcraft:textures/prison.png");
	}
}
