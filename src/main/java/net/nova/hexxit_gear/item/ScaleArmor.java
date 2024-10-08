package net.nova.hexxit_gear.item;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.nova.hexxit_gear.HexxitGearR;

public class ScaleArmor extends ArmorItem {
    public ScaleArmor(Holder<ArmorMaterial> pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
    }

    // Armor Effects
    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);

        if (pEntity instanceof LivingEntity livingEntity) {
            boolean isWearingFullSet = true;
            int index = 0;

            for (ItemStack armorStack : livingEntity.getArmorSlots()) {
                if (!(armorStack.getItem() instanceof ScaleArmor)) {
                    isWearingFullSet = false;
                }
            }

            if (isWearingFullSet) {
                addFullSetEffects(livingEntity);
            }
        }
    }

    public void addFullSetEffects(LivingEntity livingEntity) {
        HexxitGearR.addEffect(livingEntity, MobEffects.DAMAGE_BOOST, 1, 0);
        HexxitGearR.addEffect(livingEntity, MobEffects.DAMAGE_RESISTANCE, 1, 0);
        HexxitGearR.addEffect(livingEntity, MobEffects.FIRE_RESISTANCE, 1, 1);
    }
}
