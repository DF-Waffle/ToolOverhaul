package com.tooloverhaul.render;

import com.tooloverhaul.TOGlobal;
import com.tooloverhaul.items.blocks.TOBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class TOBlockRender {

    public static void registerBlockRender(){
        regBlock(TOBlocks.netherStarBlock);
    }

    public static void regBlock(Block block){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(TOGlobal.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
