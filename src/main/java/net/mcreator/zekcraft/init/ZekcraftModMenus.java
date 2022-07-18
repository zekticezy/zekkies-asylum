
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.zekcraft.world.inventory.StorageScreenMenu;
import net.mcreator.zekcraft.world.inventory.EnemiesComputerScreenMenu;
import net.mcreator.zekcraft.world.inventory.CreditsMenu;
import net.mcreator.zekcraft.world.inventory.CraftingRecipeScreenMenu;
import net.mcreator.zekcraft.world.inventory.ComputerScreenMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZekcraftModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CreditsMenu> CREDITS = register("credits", (id, inv, extraData) -> new CreditsMenu(id, inv, extraData));
	public static final MenuType<ComputerScreenMenu> COMPUTER_SCREEN = register("computer_screen",
			(id, inv, extraData) -> new ComputerScreenMenu(id, inv, extraData));
	public static final MenuType<EnemiesComputerScreenMenu> ENEMIES_COMPUTER_SCREEN = register("enemies_computer_screen",
			(id, inv, extraData) -> new EnemiesComputerScreenMenu(id, inv, extraData));
	public static final MenuType<CraftingRecipeScreenMenu> CRAFTING_RECIPE_SCREEN = register("crafting_recipe_screen",
			(id, inv, extraData) -> new CraftingRecipeScreenMenu(id, inv, extraData));
	public static final MenuType<StorageScreenMenu> STORAGE_SCREEN = register("storage_screen",
			(id, inv, extraData) -> new StorageScreenMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
