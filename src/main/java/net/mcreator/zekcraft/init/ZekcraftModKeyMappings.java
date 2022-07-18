
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.zekcraft.network.CreditsOpenMessage;
import net.mcreator.zekcraft.ZekcraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ZekcraftModKeyMappings {
	public static final KeyMapping CREDITS_OPEN = new KeyMapping("key.zekcraft.credits_open", GLFW.GLFW_KEY_INSERT, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(CREDITS_OPEN);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == CREDITS_OPEN.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						ZekcraftMod.PACKET_HANDLER.sendToServer(new CreditsOpenMessage(0, 0));
						CreditsOpenMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
