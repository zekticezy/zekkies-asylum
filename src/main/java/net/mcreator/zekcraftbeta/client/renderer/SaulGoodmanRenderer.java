
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.SaulGoodmanEntity;
import net.mcreator.zekcraftbeta.client.model.Modelsaul;

public class SaulGoodmanRenderer extends MobRenderer<SaulGoodmanEntity, Modelsaul<SaulGoodmanEntity>> {
	public SaulGoodmanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaul(context.bakeLayer(Modelsaul.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaulGoodmanEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/23d56d881a013a7e.png");
	}
}
