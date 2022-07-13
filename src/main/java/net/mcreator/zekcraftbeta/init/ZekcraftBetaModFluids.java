
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.zekcraftbeta.fluid.SulfricAcidFluid;
import net.mcreator.zekcraftbeta.fluid.PissFluid;
import net.mcreator.zekcraftbeta.ZekcraftBetaMod;

public class ZekcraftBetaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, ZekcraftBetaMod.MODID);
	public static final RegistryObject<Fluid> PISS = REGISTRY.register("piss", () -> new PissFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_PISS = REGISTRY.register("flowing_piss", () -> new PissFluid.Flowing());
	public static final RegistryObject<Fluid> SULFRIC_ACID = REGISTRY.register("sulfric_acid", () -> new SulfricAcidFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SULFRIC_ACID = REGISTRY.register("flowing_sulfric_acid", () -> new SulfricAcidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PISS.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PISS.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SULFRIC_ACID.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SULFRIC_ACID.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
