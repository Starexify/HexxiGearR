package net.nova.hexxit_gear.init;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.hexxit_gear.HexxitGearR;

import java.util.EnumMap;
import java.util.List;

import static net.nova.hexxit_gear.HexxitGearR.MODID;

public class HGArmorMaterial {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, MODID);

    public static final Holder<SoundEvent> ARMOR_EQUIP_BONE_BLOCK = BuiltInRegistries.SOUND_EVENT.wrapAsHolder(SoundEvents.BONE_BLOCK_PLACE);

    public static Holder<ArmorMaterial> SCALE = ARMOR_MATERIALS.register("scale", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 3);
        map.put(ArmorItem.Type.BODY, 11);
    }), 15, SoundEvents.ARMOR_EQUIP_NETHERITE, () -> Ingredient.of(HGItems.HEXICAL_DIAMOND),
            List.of(new ArmorMaterial.Layer(
                    HexxitGearR.rl("scale")
            )), 3.5F, 0.15F
    ));

    public static Holder<ArmorMaterial> TRIBAL = ARMOR_MATERIALS.register("tribal", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 3);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 8);
        map.put(ArmorItem.Type.HELMET, 2);
        map.put(ArmorItem.Type.BODY, 10);
    }), 18, ARMOR_EQUIP_BONE_BLOCK, () -> Ingredient.of(HGItems.HEXICAL_DIAMOND),
            List.of(new ArmorMaterial.Layer(
                    HexxitGearR.rl("tribal")
            )), 1F, 0F
    ));

    public static Holder<ArmorMaterial> THIEF = ARMOR_MATERIALS.register("thief", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 2);
        map.put(ArmorItem.Type.BODY, 7);
    }), 20, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(HGItems.HEXICAL_DIAMOND),
            List.of(new ArmorMaterial.Layer(
                    HexxitGearR.rl("thief")
            )), 0F, 0F
    ));

    public static Holder<ArmorMaterial> SAGE = ARMOR_MATERIALS.register("sage", () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
        map.put(ArmorItem.Type.BOOTS, 2);
        map.put(ArmorItem.Type.LEGGINGS, 6);
        map.put(ArmorItem.Type.CHESTPLATE, 7);
        map.put(ArmorItem.Type.HELMET, 2);
        map.put(ArmorItem.Type.BODY, 7);
    }), 22, SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(HGItems.HEXICAL_DIAMOND),
            List.of(new ArmorMaterial.Layer(
                    HexxitGearR.rl("sage")
            )), 0F, 0F
    ));
}
