package net.nova.hexxit_gear.data.tags;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.nova.hexxit_gear.init.HGItems;

import java.util.concurrent.CompletableFuture;

import static net.nova.hexxit_gear.HexxitGearR.MODID;

public class HGItemTagsProvider extends ItemTagsProvider {
    public HGItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, HGBlockTagsProvider provider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, provider.contentsGetter(), MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(ItemTags.HEAD_ARMOR).add(HGItems.SCALE_HELMET.get());
        tag(ItemTags.CHEST_ARMOR).add(HGItems.SCALE_CHESTGUARD.get());
        tag(ItemTags.LEG_ARMOR).add(HGItems.SCALE_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR).add(HGItems.SCALE_BOOTS.get());
    }
}
