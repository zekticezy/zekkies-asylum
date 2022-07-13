
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZekcraftBetaModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "themeofcancer"), new SoundEvent(new ResourceLocation("zekcraft_beta", "themeofcancer")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "gorilla_noise"), new SoundEvent(new ResourceLocation("zekcraft_beta", "gorilla_noise")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "fart"), new SoundEvent(new ResourceLocation("zekcraft_beta", "fart")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "duck"), new SoundEvent(new ResourceLocation("zekcraft_beta", "duck")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "capybark"), new SoundEvent(new ResourceLocation("zekcraft_beta", "capybark")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "justice"), new SoundEvent(new ResourceLocation("zekcraft_beta", "justice")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "baka_mitai"), new SoundEvent(new ResourceLocation("zekcraft_beta", "baka_mitai")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "gloobus"), new SoundEvent(new ResourceLocation("zekcraft_beta", "gloobus")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "skellybones"), new SoundEvent(new ResourceLocation("zekcraft_beta", "skellybones")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "thespinalstaircase"),
				new SoundEvent(new ResourceLocation("zekcraft_beta", "thespinalstaircase")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "bettercallsaul"),
				new SoundEvent(new ResourceLocation("zekcraft_beta", "bettercallsaul")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "jetstream"), new SoundEvent(new ResourceLocation("zekcraft_beta", "jetstream")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "fnaf2ambience"), new SoundEvent(new ResourceLocation("zekcraft_beta", "fnaf2ambience")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "brazil"), new SoundEvent(new ResourceLocation("zekcraft_beta", "brazil")));
		REGISTRY.put(new ResourceLocation("zekcraft_beta", "cockroach"), new SoundEvent(new ResourceLocation("zekcraft_beta", "cockroach")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
