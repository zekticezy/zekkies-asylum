
package net.mcreator.zekcraftbeta.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.zekcraftbeta.entity.JetstreamSamEntity;

public class JetstreamSamRenderer extends HumanoidMobRenderer<JetstreamSamEntity, HumanoidModel<JetstreamSamEntity>> {
	public JetstreamSamRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(JetstreamSamEntity entity) {
		return new ResourceLocation("zekcraft_beta:textures/2022_07_07_jetstream-sam-20540782.png");
	}
}
