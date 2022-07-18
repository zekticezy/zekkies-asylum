
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.KiryuKazumaEntity;
import net.mcreator.zekcraft.client.model.Modelkiryu;

public class KiryuKazumaRenderer extends MobRenderer<KiryuKazumaEntity, Modelkiryu<KiryuKazumaEntity>> {
	public KiryuKazumaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiryu(context.bakeLayer(Modelkiryu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KiryuKazumaEntity entity) {
		return new ResourceLocation("zekcraft:textures/kazuma_kiryu.png");
	}
}
