package net.penumbra.enderscape.registry.block;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.BlockEntityTypes;
import net.penumbra.enderscape.block.EndHavenCoreBlockEntity;
import net.penumbra.enderscape.block.MagniaRadioBlockEntity;
import net.penumbra.enderscape.block.MagniaSproutBlockEntity;
import net.penumbra.enderscape.references.EnderscapeBlockEntityIds;

public class EnderscapeBlockEntities {
    public static final BlockEntityType<MagniaSproutBlockEntity> MAGNIA_SPROUT = register(EnderscapeBlockEntityIds.MAGNIA_SPROUT, FabricBlockEntityTypeBuilder.create(MagniaSproutBlockEntity::new, EnderscapeBlocks.ALLURING_MAGNIA_SPROUT, EnderscapeBlocks.REPULSIVE_MAGNIA_SPROUT).build());
    public static final BlockEntityType<MagniaRadioBlockEntity> MAGNIA_RADIO = register(EnderscapeBlockEntityIds.MAGNIA_RADIO, FabricBlockEntityTypeBuilder.create(MagniaRadioBlockEntity::new, EnderscapeBlocks.MAGNIA_RADIO).build());
    public static final BlockEntityType<EndHavenCoreBlockEntity> END_HAVEN_CORE = register(EnderscapeBlockEntityIds.END_HAVEN_CORE, FabricBlockEntityTypeBuilder.create(EndHavenCoreBlockEntity::new, EnderscapeBlocks.END_HAVEN_CORE).build());

    public static <T extends BlockEntity, B extends BlockEntityType<T>> B register(ResourceKey<BlockEntityType<?>> key, B type) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, key, type);
    }

    static {
        BlockEntityTypes.CAMPFIRE.addValidBlock(EnderscapeBlocks.VOID_CAMPFIRE);
        BlockEntityTypes.TRIAL_SPAWNER.addValidBlock(EnderscapeBlocks.END_TRIAL_SPAWNER);
        BlockEntityTypes.VAULT.addValidBlock(EnderscapeBlocks.END_VAULT);

        // Shelves
        BlockEntityTypes.SHELF.addValidBlock(EnderscapeBlocks.CELESTIAL_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(EnderscapeBlocks.MURUBLIGHT_SHELF);
        BlockEntityTypes.SHELF.addValidBlock(EnderscapeBlocks.VEILED_SHELF);

        // Signs
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.CELESTIAL_SIGN);
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.CELESTIAL_WALL_SIGN);
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.MURUBLIGHT_SIGN);
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.MURUBLIGHT_WALL_SIGN);
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.VEILED_SIGN);
        BlockEntityTypes.SIGN.addValidBlock(EnderscapeBlocks.VEILED_WALL_SIGN);

        // Hanging Signs
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.CELESTIAL_HANGING_SIGN);
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.CELESTIAL_WALL_HANGING_SIGN);
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.MURUBLIGHT_HANGING_SIGN);
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.MURUBLIGHT_WALL_HANGING_SIGN);
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.VEILED_HANGING_SIGN);
        BlockEntityTypes.HANGING_SIGN.addValidBlock(EnderscapeBlocks.VEILED_WALL_HANGING_SIGN);
    }
}