
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.zekcraft.client.gui.StorageScreenScreen;
import net.mcreator.zekcraft.client.gui.EnemiesComputerScreenScreen;
import net.mcreator.zekcraft.client.gui.CreditsScreen;
import net.mcreator.zekcraft.client.gui.CraftingRecipeScreenScreen;
import net.mcreator.zekcraft.client.gui.ComputerScreenScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ZekcraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ZekcraftModMenus.CREDITS, CreditsScreen::new);
			MenuScreens.register(ZekcraftModMenus.COMPUTER_SCREEN, ComputerScreenScreen::new);
			MenuScreens.register(ZekcraftModMenus.ENEMIES_COMPUTER_SCREEN, EnemiesComputerScreenScreen::new);
			MenuScreens.register(ZekcraftModMenus.CRAFTING_RECIPE_SCREEN, CraftingRecipeScreenScreen::new);
			MenuScreens.register(ZekcraftModMenus.STORAGE_SCREEN, StorageScreenScreen::new);
		});
	}
}
