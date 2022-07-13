
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.AngryMothEntity;
import net.mcreator.zekcraftbeta.client.model.Modelmoth;

public class AngryMothRenderer extends MobRenderer<AngryMothEntity, Modelmoth<AngryMothEntity>> {
	public AngryMothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoth(context.bakeLayer(Modelmoth.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryMothEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/moth.png");
	}
}
