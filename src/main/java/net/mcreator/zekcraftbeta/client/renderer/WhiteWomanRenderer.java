
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.WhiteWomanEntity;
import net.mcreator.zekcraftbeta.client.model.Modelalex;

public class WhiteWomanRenderer extends MobRenderer<WhiteWomanEntity, Modelalex<WhiteWomanEntity>> {
	public WhiteWomanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelalex(context.bakeLayer(Modelalex.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WhiteWomanEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/0f6816691077fc17.png");
	}
}
