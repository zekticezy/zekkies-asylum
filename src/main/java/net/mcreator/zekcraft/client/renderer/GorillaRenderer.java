
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.GorillaEntity;
import net.mcreator.zekcraft.client.model.ModelGORILLA;

public class GorillaRenderer extends MobRenderer<GorillaEntity, ModelGORILLA<GorillaEntity>> {
	public GorillaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelGORILLA(context.bakeLayer(ModelGORILLA.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GorillaEntity entity) {
		return new ResourceLocation("zekcraft:textures/goril.png");
	}
}
