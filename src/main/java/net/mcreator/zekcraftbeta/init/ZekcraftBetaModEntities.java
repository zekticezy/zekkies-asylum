
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.zekcraftbeta.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.zekcraftbeta.entity.WhiteWomanEntity;
import net.mcreator.zekcraftbeta.entity.VeryCancerousRodentEntityProjectile;
import net.mcreator.zekcraftbeta.entity.VeryCancerousRodentEntity;
import net.mcreator.zekcraftbeta.entity.ThyRoombaEntityProjectile;
import net.mcreator.zekcraftbeta.entity.ThyRoombaEntity;
import net.mcreator.zekcraftbeta.entity.SpinningCockroachEntity;
import net.mcreator.zekcraftbeta.entity.SaulGoodmanEntity;
import net.mcreator.zekcraftbeta.entity.RONALDINHOEntity;
import net.mcreator.zekcraftbeta.entity.PrisonEntityProjectile;
import net.mcreator.zekcraftbeta.entity.PrisonEntity;
import net.mcreator.zekcraftbeta.entity.PoopmonsterEntity;
import net.mcreator.zekcraftbeta.entity.MrSkellyBonesEntity;
import net.mcreator.zekcraftbeta.entity.KiryuKazumaEntity;
import net.mcreator.zekcraftbeta.entity.JetstreamSamEntity;
import net.mcreator.zekcraftbeta.entity.GuardianOfThePoopMonsterEntity;
import net.mcreator.zekcraftbeta.entity.GorillaEntity;
import net.mcreator.zekcraftbeta.entity.GloobusEntity;
import net.mcreator.zekcraftbeta.entity.DuckEntity;
import net.mcreator.zekcraftbeta.entity.CapybaraEntity;
import net.mcreator.zekcraftbeta.entity.CancerousRodentEntity;
import net.mcreator.zekcraftbeta.entity.AngryMothEntity;
import net.mcreator.zekcraftbeta.ZekcraftBetaMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZekcraftBetaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, ZekcraftBetaMod.MODID);
	public static final RegistryObject<EntityType<CancerousRodentEntity>> CANCEROUS_RODENT = register("cancerous_rodent",
			EntityType.Builder.<CancerousRodentEntity>of(CancerousRodentEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(100).setUpdateInterval(3).setCustomClientFactory(CancerousRodentEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<VeryCancerousRodentEntity>> VERY_CANCEROUS_RODENT = register("very_cancerous_rodent",
			EntityType.Builder.<VeryCancerousRodentEntity>of(VeryCancerousRodentEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(VeryCancerousRodentEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<VeryCancerousRodentEntityProjectile>> VERY_CANCEROUS_RODENT_PROJECTILE = register(
			"projectile_very_cancerous_rodent",
			EntityType.Builder.<VeryCancerousRodentEntityProjectile>of(VeryCancerousRodentEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(VeryCancerousRodentEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GorillaEntity>> GORILLA = register("gorilla",
			EntityType.Builder.<GorillaEntity>of(GorillaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GorillaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GuardianOfThePoopMonsterEntity>> GUARDIAN_OF_THE_POOP_MONSTER = register(
			"guardian_of_the_poop_monster",
			EntityType.Builder.<GuardianOfThePoopMonsterEntity>of(GuardianOfThePoopMonsterEntity::new, MobCategory.MONSTER)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
					.setCustomClientFactory(GuardianOfThePoopMonsterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = register("capybara",
			EntityType.Builder.<CapybaraEntity>of(CapybaraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CapybaraEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GloobusEntity>> GLOOBUS = register("gloobus",
			EntityType.Builder.<GloobusEntity>of(GloobusEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GloobusEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThyRoombaEntity>> THY_ROOMBA = register("thy_roomba",
			EntityType.Builder.<ThyRoombaEntity>of(ThyRoombaEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ThyRoombaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ThyRoombaEntityProjectile>> THY_ROOMBA_PROJECTILE = register("projectile_thy_roomba",
			EntityType.Builder.<ThyRoombaEntityProjectile>of(ThyRoombaEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(ThyRoombaEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KiryuKazumaEntity>> KIRYU_KAZUMA = register("kiryu_kazuma",
			EntityType.Builder.<KiryuKazumaEntity>of(KiryuKazumaEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KiryuKazumaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WhiteWomanEntity>> WHITE_WOMAN = register("white_woman",
			EntityType.Builder.<WhiteWomanEntity>of(WhiteWomanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WhiteWomanEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AngryMothEntity>> ANGRY_MOTH = register("angry_moth",
			EntityType.Builder.<AngryMothEntity>of(AngryMothEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AngryMothEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DuckEntity>> DUCK = register("duck",
			EntityType.Builder.<DuckEntity>of(DuckEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(DuckEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MrSkellyBonesEntity>> MR_SKELLY_BONES = register("mr_skelly_bones",
			EntityType.Builder.<MrSkellyBonesEntity>of(MrSkellyBonesEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MrSkellyBonesEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SaulGoodmanEntity>> SAUL_GOODMAN = register("saul_goodman",
			EntityType.Builder.<SaulGoodmanEntity>of(SaulGoodmanEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SaulGoodmanEntity::new)

					.sized(0.7f, 0.4f));
	public static final RegistryObject<EntityType<JetstreamSamEntity>> JETSTREAM_SAM = register("jetstream_sam",
			EntityType.Builder.<JetstreamSamEntity>of(JetstreamSamEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JetstreamSamEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RONALDINHOEntity>> RONALDINHO = register("ronaldinho",
			EntityType.Builder.<RONALDINHOEntity>of(RONALDINHOEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RONALDINHOEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpinningCockroachEntity>> SPINNING_COCKROACH = register("spinning_cockroach",
			EntityType.Builder.<SpinningCockroachEntity>of(SpinningCockroachEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpinningCockroachEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PrisonEntity>> PRISON = register("prison",
			EntityType.Builder.<PrisonEntity>of(PrisonEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(PrisonEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PrisonEntityProjectile>> PRISON_PROJECTILE = register("projectile_prison",
			EntityType.Builder.<PrisonEntityProjectile>of(PrisonEntityProjectile::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(PrisonEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoopmonsterEntity>> POOPMONSTER = register("poopmonster",
			EntityType.Builder.<PoopmonsterEntity>of(PoopmonsterEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PoopmonsterEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CancerousRodentEntity.init();
			VeryCancerousRodentEntity.init();
			GorillaEntity.init();
			GuardianOfThePoopMonsterEntity.init();
			CapybaraEntity.init();
			GloobusEntity.init();
			ThyRoombaEntity.init();
			KiryuKazumaEntity.init();
			WhiteWomanEntity.init();
			AngryMothEntity.init();
			DuckEntity.init();
			MrSkellyBonesEntity.init();
			SaulGoodmanEntity.init();
			JetstreamSamEntity.init();
			RONALDINHOEntity.init();
			SpinningCockroachEntity.init();
			PrisonEntity.init();
			PoopmonsterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CANCEROUS_RODENT.get(), CancerousRodentEntity.createAttributes().build());
		event.put(VERY_CANCEROUS_RODENT.get(), VeryCancerousRodentEntity.createAttributes().build());
		event.put(GORILLA.get(), GorillaEntity.createAttributes().build());
		event.put(GUARDIAN_OF_THE_POOP_MONSTER.get(), GuardianOfThePoopMonsterEntity.createAttributes().build());
		event.put(CAPYBARA.get(), CapybaraEntity.createAttributes().build());
		event.put(GLOOBUS.get(), GloobusEntity.createAttributes().build());
		event.put(THY_ROOMBA.get(), ThyRoombaEntity.createAttributes().build());
		event.put(KIRYU_KAZUMA.get(), KiryuKazumaEntity.createAttributes().build());
		event.put(WHITE_WOMAN.get(), WhiteWomanEntity.createAttributes().build());
		event.put(ANGRY_MOTH.get(), AngryMothEntity.createAttributes().build());
		event.put(DUCK.get(), DuckEntity.createAttributes().build());
		event.put(MR_SKELLY_BONES.get(), MrSkellyBonesEntity.createAttributes().build());
		event.put(SAUL_GOODMAN.get(), SaulGoodmanEntity.createAttributes().build());
		event.put(JETSTREAM_SAM.get(), JetstreamSamEntity.createAttributes().build());
		event.put(RONALDINHO.get(), RONALDINHOEntity.createAttributes().build());
		event.put(SPINNING_COCKROACH.get(), SpinningCockroachEntity.createAttributes().build());
		event.put(PRISON.get(), PrisonEntity.createAttributes().build());
		event.put(POOPMONSTER.get(), PoopmonsterEntity.createAttributes().build());
	}
}
