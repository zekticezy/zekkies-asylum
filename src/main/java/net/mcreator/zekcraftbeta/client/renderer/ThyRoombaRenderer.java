
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.zekcraftbeta.entity.ThyRoombaEntity;
import net.mcreator.zekcraftbeta.client.model.Modelroomba;

public class ThyRoombaRenderer extends MobRenderer<ThyRoombaEntity, Modelroomba<ThyRoombaEntity>> {
	public ThyRoombaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelroomba(context.bakeLayer(Modelroomba.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ThyRoombaEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/roomba.png");
	}
}
