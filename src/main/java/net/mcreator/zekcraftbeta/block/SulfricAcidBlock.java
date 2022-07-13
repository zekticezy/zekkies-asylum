
package net.mcreator.zekcraftbeta.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.zekcraftbeta.init.ZekcraftBetaModFluids;

public class SulfricAcidBlock extends LiquidBlock {
	public SulfricAcidBlock() {
		super(() -> (FlowingFluid) ZekcraftBetaModFluids.SULFRIC_ACID.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
