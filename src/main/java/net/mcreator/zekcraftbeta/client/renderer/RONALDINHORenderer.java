
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.RONALDINHOEntity;
import net.mcreator.zekcraftbeta.client.model.Modelkiryu;

public class RONALDINHORenderer extends MobRenderer<RONALDINHOEntity, Modelkiryu<RONALDINHOEntity>> {
	public RONALDINHORenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkiryu(context.bakeLayer(Modelkiryu.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RONALDINHOEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/2022_06_20_ronaldinho-brazil-20462484.png");
	}
}
