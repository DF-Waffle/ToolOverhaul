package com.tooloverhaul.items.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TOBlocks {
    public static Block netherStarBlock;


    public static void initBlocks(){
        GameRegistry.registerBlock(netherStarBlock= new TOBlock("netherStarBlock", Material.ROCK, 3, 15), "netherStarBlock");

    }
}
