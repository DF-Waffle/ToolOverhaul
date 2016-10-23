package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class TOemerald_Pickaxe extends ItemPickaxe{
    public TOemerald_Pickaxe(String unlocalizedName, Item.ToolMaterial material){
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
