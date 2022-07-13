
package net.mcreator.zekcraftbeta.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.zekcraftbeta.init.ZekcraftBetaModFluids;

public class PissItem extends BucketItem {
	public PissItem() {
		super(ZekcraftBetaModFluids.PISS,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC).tab(CreativeModeTab.TAB_MISC));
	}
}
