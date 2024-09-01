package net.nova.hexxit_gear.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.nova.hexxit_gear.HexxitGearR;
import net.nova.hexxit_gear.client.model.ScaleHelmetModel;
import org.jetbrains.annotations.Nullable;

import static net.nova.hexxit_gear.HexxitGearR.MODID;

public class HGItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Hexbiscus
    public static DeferredItem<Item> HEXICAL_PETAL = ITEMS.register("hexical_petal", () -> new Item(new Item.Properties()));
    public static DeferredItem<Item> HEXICAL_ESSENCE = ITEMS.register("hexical_essence", () -> new Item(new Item.Properties()));
    public static DeferredItem<Item> HEXICAL_DIAMOND = ITEMS.register("hexical_diamond", () -> new Item(new Item.Properties()));

    // Scale
    public static DeferredItem<Item> SCALE_HELMET = ITEMS.register("scale_helmet", () -> new ArmorItem(HGArmorMaterial.SCALE, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(29)).fireResistant()) {
        @Override
        public ResourceLocation getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, ArmorMaterial.Layer layer, boolean innerModel) {
            return ScaleHelmetModel.TEXTURE;
        }
    });
    public static DeferredItem<Item> SCALE_CHESTGUARD = ITEMS.register("scale_chestguard", () -> new ArmorItem(HGArmorMaterial.SCALE, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(29)).fireResistant()));
    public static DeferredItem<Item> SCALE_LEGGINGS = ITEMS.register("scale_leggings", () -> new ArmorItem(HGArmorMaterial.SCALE, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(29)).fireResistant()));
    public static DeferredItem<Item> SCALE_BOOTS = ITEMS.register("scale_boots", () -> new ArmorItem(HGArmorMaterial.SCALE, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(29)).fireResistant()));

    // Tribal

    // Thief

    // Sage
}
