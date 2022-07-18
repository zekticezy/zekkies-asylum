
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZekcraftModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("zekcraft", "themeofcancer"), new SoundEvent(new ResourceLocation("zekcraft", "themeofcancer")));
		REGISTRY.put(new ResourceLocation("zekcraft", "gorilla_noise"), new SoundEvent(new ResourceLocation("zekcraft", "gorilla_noise")));
		REGISTRY.put(new ResourceLocation("zekcraft", "fart"), new SoundEvent(new ResourceLocation("zekcraft", "fart")));
		REGISTRY.put(new ResourceLocation("zekcraft", "duck"), new SoundEvent(new ResourceLocation("zekcraft", "duck")));
		REGISTRY.put(new ResourceLocation("zekcraft", "capybark"), new SoundEvent(new ResourceLocation("zekcraft", "capybark")));
		REGISTRY.put(new ResourceLocation("zekcraft", "justice"), new SoundEvent(new ResourceLocation("zekcraft", "justice")));
		REGISTRY.put(new ResourceLocation("zekcraft", "baka_mitai"), new SoundEvent(new ResourceLocation("zekcraft", "baka_mitai")));
		REGISTRY.put(new ResourceLocation("zekcraft", "gloobus"), new SoundEvent(new ResourceLocation("zekcraft", "gloobus")));
		REGISTRY.put(new ResourceLocation("zekcraft", "skellybones"), new SoundEvent(new ResourceLocation("zekcraft", "skellybones")));
		REGISTRY.put(new ResourceLocation("zekcraft", "thespinalstaircase"), new SoundEvent(new ResourceLocation("zekcraft", "thespinalstaircase")));
		REGISTRY.put(new ResourceLocation("zekcraft", "bettercallsaul"), new SoundEvent(new ResourceLocation("zekcraft", "bettercallsaul")));
		REGISTRY.put(new ResourceLocation("zekcraft", "jetstream"), new SoundEvent(new ResourceLocation("zekcraft", "jetstream")));
		REGISTRY.put(new ResourceLocation("zekcraft", "fnaf2ambience"), new SoundEvent(new ResourceLocation("zekcraft", "fnaf2ambience")));
		REGISTRY.put(new ResourceLocation("zekcraft", "brazil"), new SoundEvent(new ResourceLocation("zekcraft", "brazil")));
		REGISTRY.put(new ResourceLocation("zekcraft", "cockroach"), new SoundEvent(new ResourceLocation("zekcraft", "cockroach")));
		REGISTRY.put(new ResourceLocation("zekcraft", "order"), new SoundEvent(new ResourceLocation("zekcraft", "order")));
		REGISTRY.put(new ResourceLocation("zekcraft", "chaos"), new SoundEvent(new ResourceLocation("zekcraft", "chaos")));
		REGISTRY.put(new ResourceLocation("zekcraft", "chaos_end"), new SoundEvent(new ResourceLocation("zekcraft", "chaos_end")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
