package com.tooloverhaul.proxy;

import com.tooloverhaul.crafting.TORecipes;
import com.tooloverhaul.items.TOItems;
import com.tooloverhaul.items.blocks.TOBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent preEvent){
        TOItems.initItems();
        TOBlocks.initBlocks();
        TORecipes.initRecipes();

    }
    public void init(FMLInitializationEvent Event){

    }
    public void postInit(FMLPostInitializationEvent postEvent){

    }
}
