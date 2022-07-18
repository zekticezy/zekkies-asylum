
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.CapybaraEntity;
import net.mcreator.zekcraft.client.model.ModelCapybara;

public class CapybaraRenderer extends MobRenderer<CapybaraEntity, ModelCapybara<CapybaraEntity>> {
	public CapybaraRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCapybara(context.bakeLayer(ModelCapybara.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CapybaraEntity entity) {
		return new ResourceLocation("zekcraft:textures/capy.png");
	}
}
