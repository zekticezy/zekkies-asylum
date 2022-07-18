
package net.mcreator.zekcraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zekcraft.init.ZekcraftModItems;
import net.mcreator.zekcraft.init.ZekcraftModFluids;
import net.mcreator.zekcraft.init.ZekcraftModBlocks;
import net.mcreator.zekcraft.fluid.attributes.SulfricAcidFluidAttributes;

public abstract class SulfricAcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ZekcraftModFluids.SULFRIC_ACID,
			ZekcraftModFluids.FLOWING_SULFRIC_ACID,
			SulfricAcidFluidAttributes
					.builder(new ResourceLocation("zekcraft:blocks/sulfric_acid"), new ResourceLocation("zekcraft:blocks/sulfric_acid"))

					.rarity(Rarity.UNCOMMON).color(-12012264))
			.explosionResistance(100f)

			.bucket(ZekcraftModItems.SULFRIC_ACID_BUCKET).block(() -> (LiquidBlock) ZekcraftModBlocks.SULFRIC_ACID.get());

	private SulfricAcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends SulfricAcidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SulfricAcidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
