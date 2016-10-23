package com.tooloverhaul.render;

import com.tooloverhaul.TOGlobal;
import com.tooloverhaul.items.TOItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class TOItemRender {
    public static void registerItemRender(){

        regItem(TOItems.obsidianIngot);
        //Emerald
        regItem(TOItems.emerald_Sword);
        regItem(TOItems.emerald_Pickaxe);
        regItem(TOItems.emerald_Shovel);
        regItem(TOItems.emerald_Axe);
        regItem(TOItems.emerald_Hoe);
        regItem(TOItems.emerald_Pax);
        //Obsidian
        regItem(TOItems.obsidian_Sword);
        regItem(TOItems.obsidian_Pickaxe);
        regItem(TOItems.obsidian_Shovel);
        regItem(TOItems.obsidian_Axe);
        regItem(TOItems.obsidian_Hoe);
        regItem(TOItems.obsidian_Pax);
        //Star
        regItem(TOItems.star_Sword);
        regItem(TOItems.star_Pickaxe);
        regItem(TOItems.star_Shovel);
        regItem(TOItems.star_Axe);
        regItem(TOItems.star_Hoe);
        regItem(TOItems.star_Pax);
        //Vanilla Pax
        regItem(TOItems.wooden_Pax);
        regItem(TOItems.stone_Pax);
        regItem(TOItems.iron_Pax);
        regItem(TOItems.gold_Pax);
        regItem(TOItems.diamond_Pax);



    }

    public static void regItem(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(TOGlobal.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
