
package net.mcreator.zekcraftbeta.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zekcraftbeta.init.ZekcraftBetaModItems;
import net.mcreator.zekcraftbeta.init.ZekcraftBetaModFluids;
import net.mcreator.zekcraftbeta.init.ZekcraftBetaModBlocks;
import net.mcreator.zekcraftbeta.fluid.attributes.SulfricAcidFluidAttributes;

public abstract class SulfricAcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ZekcraftBetaModFluids.SULFRIC_ACID,
			ZekcraftBetaModFluids.FLOWING_SULFRIC_ACID,
			SulfricAcidFluidAttributes
					.builder(new ResourceLocation("zekcraft_beta:blocks/sulfric_acid"), new ResourceLocation("zekcraft_beta:blocks/sulfric_acid"))

					.rarity(Rarity.UNCOMMON).color(-12012264))
			.explosionResistance(100f)

			.bucket(ZekcraftBetaModItems.SULFRIC_ACID_BUCKET).block(() -> (LiquidBlock) ZekcraftBetaModBlocks.SULFRIC_ACID.get());

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
