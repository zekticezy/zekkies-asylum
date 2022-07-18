
package net.mcreator.zekcraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraft.entity.AngryMothEntity;
import net.mcreator.zekcraft.client.model.Modelmoth;

public class AngryMothRenderer extends MobRenderer<AngryMothEntity, Modelmoth<AngryMothEntity>> {
	public AngryMothRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoth(context.bakeLayer(Modelmoth.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(AngryMothEntity entity) {
		return new ResourceLocation("zekcraft:textures/moth.png");
	}
}
