package net.nova.hexxit_gear.init;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
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
}
