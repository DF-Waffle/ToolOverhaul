package com.tooloverhaul.items;

import com.tooloverhaul.items.tools.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOItems {
    //Items
    //Emerald
    public static Item emerald_Sword;
    public static Item emerald_Pickaxe;
    public static Item emerald_Shovel;
    public static Item emerald_Axe;
    public static Item emerald_Hoe;
    public static Item emerald_Pax;
    //Obsidian
    public static Item obsidian_Sword;
    public static Item obsidian_Pickaxe;
    public static Item obsidian_Shovel;
    public static Item obsidian_Axe;
    public static Item obsidian_Hoe;
    public static Item obsidian_Pax;
    //Star
    public static Item star_Sword;
    public static Item star_Pickaxe;
    public static Item star_Shovel;
    public static Item star_Axe;
    public static Item star_Hoe;
    public static Item star_Pax;
    //Vanilla Pax
    public static Item wooden_Pax;
    public static Item stone_Pax;
    public static Item iron_Pax;
    public static Item gold_Pax;
    public static Item diamond_Pax;

    //Items

    public static Item obsidianIngot;


    //ToolMaterials
    public static Item.ToolMaterial EMERALDTOOLS = EnumHelper.addToolMaterial("EMERALDTOOLS", 3, 1700, 10.0F, 6.0F, 20);
    public static Item.ToolMaterial OBSIDIANTOOLS = EnumHelper.addToolMaterial("OBSIDIANTOOLS", 3, 1000, 12.0F, 5.0F, 15);
    public static Item.ToolMaterial STARTOOLS = EnumHelper.addToolMaterial("STARTOOLS", 3, 1000000000, 15.0F, 150.0F, 20);




    public static void initItems(){
        //Items
        GameRegistry.registerItem(obsidianIngot = new TOItem("obsidianIngot"), "obsidianIngot");
        //EmeraldTools
        GameRegistry.registerItem(emerald_Sword = new TOemerald_Sword("emerald_Sword", EMERALDTOOLS), "emerald_Sword");
        GameRegistry.registerItem(emerald_Pickaxe = new TOemerald_Pickaxe("emerald_Pickaxe", EMERALDTOOLS), "emerald_Pickaxe");
        GameRegistry.registerItem(emerald_Shovel = new TOemerald_Shovel("emerald_Shovel", EMERALDTOOLS), "emerald_Shovel");
        GameRegistry.registerItem(emerald_Axe = new TOemerald_Axe("emerald_Axe", EMERALDTOOLS), "emerald_Axe");
        GameRegistry.registerItem(emerald_Hoe = new TOemerald_Hoe("emerald_Hoe", EMERALDTOOLS), "emerald_Hoe");
        GameRegistry.registerItem(emerald_Pax = new TOemerald_Pax("emerald_Pax", EMERALDTOOLS), "emerald_Pax");
        //ObsidianTools
        GameRegistry.registerItem(obsidian_Sword = new TOobsidian_Sword("obsidian_Sword", OBSIDIANTOOLS), "obsidian_Sword");
        GameRegistry.registerItem(obsidian_Pickaxe = new TOobsidian_Pickaxe("obsidian_Pickaxe", OBSIDIANTOOLS), "obsidian_Pickaxe");
        GameRegistry.registerItem(obsidian_Shovel = new TOobsidian_Shovel("obsidian_Shovel", OBSIDIANTOOLS), "obsidian_Shovel");
        GameRegistry.registerItem(obsidian_Axe = new TOobsidian_Axe("obsidian_Axe", OBSIDIANTOOLS), "obsidian_Axe");
        GameRegistry.registerItem(obsidian_Hoe = new TOobsidian_Hoe("obsidian_Hoe", OBSIDIANTOOLS), "obsidian_Hoe");
        GameRegistry.registerItem(obsidian_Pax = new TOobsidian_Pax("obsidian_Pax", OBSIDIANTOOLS), "obsidian_Pax");
        //StarTools
        GameRegistry.registerItem(star_Sword = new TOstar_Sword("star_Sword", STARTOOLS), "star_Sword");
        GameRegistry.registerItem(star_Pickaxe = new TOstar_Pickaxe("star_Pickaxe", STARTOOLS), "star_Pickaxe");
        GameRegistry.registerItem(star_Shovel = new TOstar_Shovel("star_Shovel", STARTOOLS), "star_Shovel");
        GameRegistry.registerItem(star_Hoe = new TOstar_Hoe("star_Hoe", STARTOOLS), "star_Hoe");
        GameRegistry.registerItem(star_Axe = new TOstar_Axe("star_Axe", STARTOOLS), "star_Axe");
        GameRegistry.registerItem(star_Pax = new TOstar_Pax("star_Pax", STARTOOLS), "star_Pax");
        //Vanilla Paxels
        GameRegistry.registerItem(wooden_Pax = new TOwooden_Pax("wooden_Pax", Item.ToolMaterial.WOOD), "wooden_Pax");
        GameRegistry.registerItem(stone_Pax = new TOstone_Pax("stone_Pax", Item.ToolMaterial.STONE), "stone_Pax");
        GameRegistry.registerItem(iron_Pax = new TOiron_Pax("iron_Pax", Item.ToolMaterial.IRON), "iron_Pax");
        GameRegistry.registerItem(gold_Pax = new TOgold_Pax("gold_Pax", Item.ToolMaterial.GOLD), "gold_Pax");
        GameRegistry.registerItem(diamond_Pax = new TOdiamond_Pax("diamond_Pax", Item.ToolMaterial.DIAMOND), "diamond_Pax");




    }
}
