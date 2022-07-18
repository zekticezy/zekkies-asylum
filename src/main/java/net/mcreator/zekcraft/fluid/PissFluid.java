
package net.mcreator.zekcraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.zekcraft.init.ZekcraftModItems;
import net.mcreator.zekcraft.init.ZekcraftModFluids;
import net.mcreator.zekcraft.init.ZekcraftModBlocks;

public abstract class PissFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(ZekcraftModFluids.PISS,
			ZekcraftModFluids.FLOWING_PISS,
			FluidAttributes.builder(new ResourceLocation("zekcraft:blocks/piss_still"), new ResourceLocation("zekcraft:blocks/piss_still"))

					.rarity(Rarity.EPIC))
			.explosionResistance(100f)

			.bucket(ZekcraftModItems.PISS_BUCKET).block(() -> (LiquidBlock) ZekcraftModBlocks.PISS.get());

	private PissFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PissFluid {
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

	public static class Flowing extends PissFluid {
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
