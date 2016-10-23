package com.tooloverhaul.crafting;

import com.tooloverhaul.items.TOItems;
import com.tooloverhaul.items.blocks.TOBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TORecipes {

    public static void initRecipes(){

        //Emerald
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Pickaxe), "EEE", " S ", " S ", 'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Shovel)," E "," S "," S ",'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Axe),"EE ","ES "," S ",'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Sword)," E "," E "," S ",'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Hoe),"EE "," S "," S ",'E', Items.EMERALD, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.emerald_Pax), "ABC"," S "," S ", 'A', TOItems.emerald_Pickaxe, 'B', TOItems.emerald_Shovel, 'C', TOItems.emerald_Axe, 'S', Items.STICK);
        //Obsidian
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Pickaxe),"EEE"," S "," S ",'E', TOItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Shovel)," E "," S "," S ",'E', TOItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Axe),"EE ","ES "," S ",'E', TOItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Sword)," E "," E "," S ",'E', TOItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Hoe),"EE "," S "," S ",'E', TOItems.obsidianIngot, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.obsidian_Pax), "ABC"," S "," S ", 'A', TOItems.obsidian_Pickaxe, 'B', TOItems.obsidian_Shovel, 'C', TOItems.obsidian_Axe, 'S', Items.STICK);
        //Star
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Pickaxe),"EEE"," S "," S ",'E', Items.NETHER_STAR, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Shovel)," E "," S "," S ",'E', Items.NETHER_STAR, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Axe),"EE ","ES "," S ",'E', Items.NETHER_STAR, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Sword), " E ", " E ", " S ", 'E', Items.NETHER_STAR, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Hoe),"EE "," S "," S ",'E', Items.NETHER_STAR, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.star_Pax), "ABC"," S "," S ", 'A', TOItems.star_Pickaxe, 'B', TOItems.star_Shovel, 'C', TOItems.star_Axe, 'S', Items.STICK);
        //Vanilla Pax
        GameRegistry.addRecipe(new ItemStack(TOItems.wooden_Pax), "ABC"," S "," S ", 'A', Items.WOODEN_PICKAXE, 'B', Items.WOODEN_SHOVEL, 'C', Items.WOODEN_AXE, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.stone_Pax), "ABC"," S "," S ", 'A', Items.STONE_PICKAXE, 'B', Items.STONE_SHOVEL, 'C', Items.STONE_AXE, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.iron_Pax), "ABC"," S "," S ", 'A', Items.IRON_PICKAXE, 'B', Items.IRON_SHOVEL, 'C', Items.IRON_AXE, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.gold_Pax), "ABC"," S "," S ", 'A', Items.GOLDEN_PICKAXE, 'B', Items.GOLDEN_SHOVEL, 'C', Items.GOLDEN_AXE, 'S', Items.STICK);
        GameRegistry.addRecipe(new ItemStack(TOItems.diamond_Pax), "ABC"," S "," S ", 'A', Items.DIAMOND_PICKAXE, 'B', Items.DIAMOND_SHOVEL, 'C', Items.DIAMOND_AXE, 'S', Items.STICK);

        GameRegistry.addShapelessRecipe(new ItemStack(TOItems.obsidianIngot, 4), new Object[]{Blocks.OBSIDIAN });
        GameRegistry.addRecipe(new ItemStack(TOBlocks.netherStarBlock), "NNN", "NNN", "NNN", 'N', Items.NETHER_STAR);
        GameRegistry.addShapelessRecipe(new ItemStack(Items.NETHER_STAR, 9), new Object[]{TOBlocks.netherStarBlock});


    }


}
