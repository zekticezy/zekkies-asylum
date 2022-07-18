
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.zekcraft.client.renderer.WhiteWomanRenderer;
import net.mcreator.zekcraft.client.renderer.VeryCancerousRodentRenderer;
import net.mcreator.zekcraft.client.renderer.ThyRoombaRenderer;
import net.mcreator.zekcraft.client.renderer.SpinningCockroachRenderer;
import net.mcreator.zekcraft.client.renderer.SaulGoodmanRenderer;
import net.mcreator.zekcraft.client.renderer.RONALDINHORenderer;
import net.mcreator.zekcraft.client.renderer.PrisonRenderer;
import net.mcreator.zekcraft.client.renderer.PoopmonsterRenderer;
import net.mcreator.zekcraft.client.renderer.MrSkellyBonesRenderer;
import net.mcreator.zekcraft.client.renderer.KiryuKazumaRenderer;
import net.mcreator.zekcraft.client.renderer.JetstreamSamRenderer;
import net.mcreator.zekcraft.client.renderer.GuardianOfThePoopMonsterRenderer;
import net.mcreator.zekcraft.client.renderer.GorillaRenderer;
import net.mcreator.zekcraft.client.renderer.GloobusRenderer;
import net.mcreator.zekcraft.client.renderer.DuckRenderer;
import net.mcreator.zekcraft.client.renderer.CapybaraRenderer;
import net.mcreator.zekcraft.client.renderer.CancerousRodentRenderer;
import net.mcreator.zekcraft.client.renderer.AngryMothRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZekcraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ZekcraftModEntities.CANCEROUS_RODENT.get(), CancerousRodentRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.VERY_CANCEROUS_RODENT.get(), VeryCancerousRodentRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.VERY_CANCEROUS_RODENT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.GORILLA.get(), GorillaRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.GUARDIAN_OF_THE_POOP_MONSTER.get(), GuardianOfThePoopMonsterRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.CAPYBARA.get(), CapybaraRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.GLOOBUS.get(), GloobusRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.THY_ROOMBA.get(), ThyRoombaRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.THY_ROOMBA_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.KIRYU_KAZUMA.get(), KiryuKazumaRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.WHITE_WOMAN.get(), WhiteWomanRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.ANGRY_MOTH.get(), AngryMothRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.DUCK.get(), DuckRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.MR_SKELLY_BONES.get(), MrSkellyBonesRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.SAUL_GOODMAN.get(), SaulGoodmanRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.JETSTREAM_SAM.get(), JetstreamSamRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.RONALDINHO.get(), RONALDINHORenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.SPINNING_COCKROACH.get(), SpinningCockroachRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.PRISON.get(), PrisonRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.PRISON_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(ZekcraftModEntities.POOPMONSTER.get(), PoopmonsterRenderer::new);
	}
}
