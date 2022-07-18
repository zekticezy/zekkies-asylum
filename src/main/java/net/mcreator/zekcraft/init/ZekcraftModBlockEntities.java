
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.zekcraft.block.entity.ComputerBlockEntity;
import net.mcreator.zekcraft.ZekcraftMod;

public class ZekcraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, ZekcraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> COMPUTER = register("computer", ZekcraftModBlocks.COMPUTER, ComputerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
