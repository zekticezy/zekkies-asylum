
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.GloobusEntity;
import net.mcreator.zekcraft.client.model.ModelGloobus;

public class GloobusRenderer extends MobRenderer<GloobusEntity, ModelGloobus<GloobusEntity>> {
	public GloobusRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGloobus(context.bakeLayer(ModelGloobus.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GloobusEntity entity) {
		return new ResourceLocation("zekcraft:textures/gloobus.png");
	}
}
