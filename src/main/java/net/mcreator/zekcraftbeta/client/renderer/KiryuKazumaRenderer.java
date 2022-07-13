
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.KiryuKazumaEntity;
import net.mcreator.zekcraftbeta.client.model.Modelkiryu;

public class KiryuKazumaRenderer extends MobRenderer<KiryuKazumaEntity, Modelkiryu<KiryuKazumaEntity>> {
	public KiryuKazumaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiryu(context.bakeLayer(Modelkiryu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KiryuKazumaEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/kazuma_kiryu.png");
	}
}
