
package net.mcreator.zekcraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ArabicNokiaItem extends SwordItem {
	public ArabicNokiaItem() {
		super(new Tier() {
			public int getUses() {
				return 2040;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 48f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, 1f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
