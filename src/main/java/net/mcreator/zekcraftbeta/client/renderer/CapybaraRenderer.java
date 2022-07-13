
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.CapybaraEntity;
import net.mcreator.zekcraftbeta.client.model.ModelCapybara;

public class CapybaraRenderer extends MobRenderer<CapybaraEntity, ModelCapybara<CapybaraEntity>> {
	public CapybaraRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCapybara(context.bakeLayer(ModelCapybara.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CapybaraEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/capy.png");
	}
}
