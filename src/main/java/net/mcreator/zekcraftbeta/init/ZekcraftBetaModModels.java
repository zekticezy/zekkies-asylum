
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.zekcraftbeta.client.model.Modelskelly;
import net.mcreator.zekcraftbeta.client.model.Modelsaul;
import net.mcreator.zekcraftbeta.client.model.Modelroomba;
import net.mcreator.zekcraftbeta.client.model.Modelpoopguardian;
import net.mcreator.zekcraftbeta.client.model.Modelmoth;
import net.mcreator.zekcraftbeta.client.model.Modelkiryu;
import net.mcreator.zekcraftbeta.client.model.Modelhogrider;
import net.mcreator.zekcraftbeta.client.model.Modelduck;
import net.mcreator.zekcraftbeta.client.model.Modelcockroach;
import net.mcreator.zekcraftbeta.client.model.Modelalex;
import net.mcreator.zekcraftbeta.client.model.ModelVCR;
import net.mcreator.zekcraftbeta.client.model.ModelPrison;
import net.mcreator.zekcraftbeta.client.model.ModelPoopmonster;
import net.mcreator.zekcraftbeta.client.model.ModelGloobus;
import net.mcreator.zekcraftbeta.client.model.ModelGORILLA;
import net.mcreator.zekcraftbeta.client.model.ModelCapybara;
import net.mcreator.zekcraftbeta.client.model.ModelCR;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ZekcraftBetaModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelalex.LAYER_LOCATION, Modelalex::createBodyLayer);
		event.registerLayerDefinition(Modelmoth.LAYER_LOCATION, Modelmoth::createBodyLayer);
		event.registerLayerDefinition(Modelkiryu.LAYER_LOCATION, Modelkiryu::createBodyLayer);
		event.registerLayerDefinition(ModelCapybara.LAYER_LOCATION, ModelCapybara::createBodyLayer);
		event.registerLayerDefinition(Modelduck.LAYER_LOCATION, Modelduck::createBodyLayer);
		event.registerLayerDefinition(Modelskelly.LAYER_LOCATION, Modelskelly::createBodyLayer);
		event.registerLayerDefinition(ModelVCR.LAYER_LOCATION, ModelVCR::createBodyLayer);
		event.registerLayerDefinition(ModelPoopmonster.LAYER_LOCATION, ModelPoopmonster::createBodyLayer);
		event.registerLayerDefinition(Modelroomba.LAYER_LOCATION, Modelroomba::createBodyLayer);
		event.registerLayerDefinition(Modelsaul.LAYER_LOCATION, Modelsaul::createBodyLayer);
		event.registerLayerDefinition(ModelPrison.LAYER_LOCATION, ModelPrison::createBodyLayer);
		event.registerLayerDefinition(Modelcockroach.LAYER_LOCATION, Modelcockroach::createBodyLayer);
		event.registerLayerDefinition(Modelpoopguardian.LAYER_LOCATION, Modelpoopguardian::createBodyLayer);
		event.registerLayerDefinition(ModelCR.LAYER_LOCATION, ModelCR::createBodyLayer);
		event.registerLayerDefinition(ModelGloobus.LAYER_LOCATION, ModelGloobus::createBodyLayer);
		event.registerLayerDefinition(ModelGORILLA.LAYER_LOCATION, ModelGORILLA::createBodyLayer);
		event.registerLayerDefinition(Modelhogrider.LAYER_LOCATION, Modelhogrider::createBodyLayer);
	}
}
