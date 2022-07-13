
package net.mcreator.zekcraftbeta.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zekcraftbeta.init.ZekcraftBetaModSounds;

public class ThemeOfCancerItem extends RecordItem {
	public ThemeOfCancerItem() {
		super(0, ZekcraftBetaModSounds.REGISTRY.get(new ResourceLocation("zekcraft_beta:themeofcancer")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}
}
