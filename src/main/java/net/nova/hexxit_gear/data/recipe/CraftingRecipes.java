package net.nova.hexxit_gear.data.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.nova.hexxit_gear.init.HGBlocks;
import net.nova.hexxit_gear.init.HGItems;

import java.util.concurrent.CompletableFuture;

public class CraftingRecipes extends HGRecipeProvider {
    public final RecipeOutput recipeOutput;

    public CraftingRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, RecipeOutput recipeOutput) {
        super(output, lookupProvider);
        this.recipeOutput = recipeOutput;
    }

    public void build() {
        oneToOneConversionRecipe(recipeOutput, HGItems.HEXICAL_PETAL, HGBlocks.HEXBISCUS, "hexical_petal");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HGItems.HEXICAL_DIAMOND)
                .define('#', Items.DIAMOND).define('P', HGItems.HEXICAL_PETAL)
                .pattern(" P ")
                .pattern("P#P")
                .pattern(" P ")
                .unlockedBy("has_" + getItemName(HGItems.HEXICAL_PETAL), has(HGItems.HEXICAL_PETAL))
                .save(recipeOutput);

    }
}
