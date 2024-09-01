package net.nova.hexxit_gear.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.nova.hexxit_gear.init.CreativeTab;
import net.nova.hexxit_gear.init.HGItems;

import static net.nova.hexxit_gear.HexxitGearR.MODID;

public class LangProvider extends LanguageProvider {
    public LangProvider(PackOutput output) {
        super(output, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // Items
        addItem(HGItems.HEXICAL_PETAL, "Hexical Petal");
        addItem(HGItems.HEXICAL_ESSENCE, "Hexical Essence");
        addItem(HGItems.HEXICAL_DIAMOND, "Hexical Diamond");

        addItem(HGItems.SCALE_HELMET, "Scale Helmet");
        addItem(HGItems.SCALE_CHESTGUARD, "Scale Chestguard");
        addItem(HGItems.SCALE_LEGGINGS, "Scale Leggings");
        addItem(HGItems.SCALE_BOOTS, "Scale Boots");

        // Creative Tab
        add(CreativeTab.HEXXIT_GEAR_TAB_TITLE, "Hexxit Gear R");
    }
}
