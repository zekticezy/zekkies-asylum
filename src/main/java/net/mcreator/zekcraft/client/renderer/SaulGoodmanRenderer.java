
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.SaulGoodmanEntity;
import net.mcreator.zekcraft.client.model.Modelsaul;

public class SaulGoodmanRenderer extends MobRenderer<SaulGoodmanEntity, Modelsaul<SaulGoodmanEntity>> {
	public SaulGoodmanRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsaul(context.bakeLayer(Modelsaul.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SaulGoodmanEntity entity) {
		return new ResourceLocation("zekcraft:textures/23d56d881a013a7e.png");
	}
}
