
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.zekcraft.world.features.ores.ShitOreOreFeature;
import net.mcreator.zekcraft.world.features.ores.HardWoodFeature;
import net.mcreator.zekcraft.world.features.ores.BrazilBlockFeature;
import net.mcreator.zekcraft.world.features.ores.AverageJapaneseTreeLeavesFeature;
import net.mcreator.zekcraft.world.features.lakes.SulfricAcidFeature;
import net.mcreator.zekcraft.world.features.lakes.PissFeature;
import net.mcreator.zekcraft.world.features.TheSpinalStaircaseFeature;
import net.mcreator.zekcraft.world.features.SaulGoodmanOfficeFeature;
import net.mcreator.zekcraft.world.features.PoopMonsterCastleFeature;
import net.mcreator.zekcraft.world.features.McDonaldsFeature;
import net.mcreator.zekcraft.world.features.KebabFeature;
import net.mcreator.zekcraft.world.features.DrTrayaurusLabFeature;
import net.mcreator.zekcraft.world.features.CancerousHallsFeature;
import net.mcreator.zekcraft.world.features.BreakingBadRVFeature;
import net.mcreator.zekcraft.ZekcraftMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class ZekcraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ZekcraftMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> PISS = register("piss", PissFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, PissFeature.GENERATE_BIOMES, PissFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SULFRIC_ACID = register("sulfric_acid", SulfricAcidFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.LAKES, SulfricAcidFeature.GENERATE_BIOMES, SulfricAcidFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BRAZIL_BLOCK = register("brazil_block", BrazilBlockFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.UNDERGROUND_ORES, BrazilBlockFeature.GENERATE_BIOMES, BrazilBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SHIT_ORE_ORE = register("shit_ore_ore", ShitOreOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, ShitOreOreFeature.GENERATE_BIOMES, ShitOreOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> AVERAGE_JAPANESE_TREE_LEAVES = register("average_japanese_tree_leaves",
			AverageJapaneseTreeLeavesFeature::feature, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
					AverageJapaneseTreeLeavesFeature.GENERATE_BIOMES, AverageJapaneseTreeLeavesFeature::placedFeature));
	public static final RegistryObject<Feature<?>> HARD_WOOD = register("hard_wood", HardWoodFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, HardWoodFeature.GENERATE_BIOMES, HardWoodFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POOP_MONSTER_CASTLE = register("poop_monster_castle", PoopMonsterCastleFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, PoopMonsterCastleFeature.GENERATE_BIOMES,
					PoopMonsterCastleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> MC_DONALDS = register("mc_donalds", McDonaldsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, McDonaldsFeature.GENERATE_BIOMES, McDonaldsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BREAKING_BAD_RV = register("breaking_bad_rv", BreakingBadRVFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BreakingBadRVFeature.GENERATE_BIOMES,
					BreakingBadRVFeature::placedFeature));
	public static final RegistryObject<Feature<?>> DR_TRAYAURUS_LAB = register("dr_trayaurus_lab", DrTrayaurusLabFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, DrTrayaurusLabFeature.GENERATE_BIOMES,
					DrTrayaurusLabFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CANCEROUS_HALLS = register("cancerous_halls", CancerousHallsFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, CancerousHallsFeature.GENERATE_BIOMES,
					CancerousHallsFeature::placedFeature));
	public static final RegistryObject<Feature<?>> SAUL_GOODMAN_OFFICE = register("saul_goodman_office", SaulGoodmanOfficeFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, SaulGoodmanOfficeFeature.GENERATE_BIOMES,
					SaulGoodmanOfficeFeature::placedFeature));
	public static final RegistryObject<Feature<?>> THE_SPINAL_STAIRCASE = register("the_spinal_staircase", TheSpinalStaircaseFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, TheSpinalStaircaseFeature.GENERATE_BIOMES,
					TheSpinalStaircaseFeature::placedFeature));
	public static final RegistryObject<Feature<?>> KEBAB = register("kebab", KebabFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, KebabFeature.GENERATE_BIOMES, KebabFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
