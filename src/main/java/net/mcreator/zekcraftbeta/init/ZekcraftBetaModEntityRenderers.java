
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.zekcraftbeta.client.renderer.WhiteWomanRenderer;
import net.mcreator.zekcraftbeta.client.renderer.VeryCancerousRodentRenderer;
import net.mcreator.zekcraftbeta.client.renderer.ThyRoombaRenderer;
import net.mcreator.zekcraftbeta.client.renderer.SpinningCockroachRenderer;
import net.mcreator.zekcraftbeta.client.renderer.SaulGoodmanRenderer;
import net.mcreator.zekcraftbeta.client.renderer.RONALDINHORenderer;
import net.mcreator.zekcraftbeta.client.renderer.PrisonRenderer;
import net.mcreator.zekcraftbeta.client.renderer.PoopmonsterRenderer;
import net.mcreator.zekcraftbeta.client.renderer.MrSkellyBonesRenderer;
import net.mcreator.zekcraftbeta.client.renderer.KiryuKazumaRenderer;
import net.mcreator.zekcraftbeta.client.renderer.JetstreamSamRenderer;
import net.mcreator.zekcraftbeta.client.renderer.GuardianOfThePoopMonsterRenderer;
import net.mcreator.zekcraftbeta.client.renderer.GorillaRenderer;
import net.mcreator.zekcraftbeta.client.renderer.GloobusRenderer;
import net.mcreator.zekcraftbeta.client.renderer.DuckRenderer;
import net.mcreator.zekcraftbeta.client.renderer.CapybaraRenderer;
import net.mcreator.zekcraftbeta.client.renderer.CancerousRodentRenderer;
import net.mcreator.zekcraftbeta.client.renderer.AngryMothRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZekcraftBetaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZekcraftBetaModEntities.CANCEROUS_RODENT.get(), CancerousRodentRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.VERY_CANCEROUS_RODENT.get(), VeryCancerousRodentRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.VERY_CANCEROUS_RODENT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.GORILLA.get(), GorillaRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.GUARDIAN_OF_THE_POOP_MONSTER.get(), GuardianOfThePoopMonsterRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.CAPYBARA.get(), CapybaraRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.GLOOBUS.get(), GloobusRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.THY_ROOMBA.get(), ThyRoombaRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.THY_ROOMBA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.KIRYU_KAZUMA.get(), KiryuKazumaRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.WHITE_WOMAN.get(), WhiteWomanRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.ANGRY_MOTH.get(), AngryMothRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.MR_SKELLY_BONES.get(), MrSkellyBonesRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.SAUL_GOODMAN.get(), SaulGoodmanRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.JETSTREAM_SAM.get(), JetstreamSamRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.RONALDINHO.get(), RONALDINHORenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.SPINNING_COCKROACH.get(), SpinningCockroachRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.PRISON.get(), PrisonRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.PRISON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftBetaModEntities.POOPMONSTER.get(), PoopmonsterRenderer::new);
	}
}
