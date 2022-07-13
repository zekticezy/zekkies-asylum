
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.MrSkellyBonesEntity;
import net.mcreator.zekcraftbeta.client.model.Modelskelly;

public class MrSkellyBonesRenderer extends MobRenderer<MrSkellyBonesEntity, Modelskelly<MrSkellyBonesEntity>> {
	public MrSkellyBonesRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelskelly(context.bakeLayer(Modelskelly.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MrSkellyBonesEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/2022_06_28_full-skeleton-steve-20494037.png");
	}
}
