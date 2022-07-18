
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class ZekcraftModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == ZekcraftModBlocks.HARD_WOOD.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == ZekcraftModBlocks.HARDWOOD_PLANKS.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == ZekcraftModBlocks.HARDWOOD_SLAB.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == ZekcraftModBlocks.HARDWOOD_FENCE.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == ZekcraftModBlocks.HARDWOOD_FENCE_GATES.get().asItem())
			event.setBurnTime(1600);
		else if (event.getItemStack().getItem() == ZekcraftModBlocks.HARDWOOD_TRAPDOOR.get().asItem())
			event.setBurnTime(1600);
	}
}
