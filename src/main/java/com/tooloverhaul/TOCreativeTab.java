package com.tooloverhaul;

import com.tooloverhaul.items.TOItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TOCreativeTab extends CreativeTabs{
    public TOCreativeTab(String string){
        super(string);
    }
    public Item getTabIconItem(){
        return TOItems.emerald_Pickaxe;
    }
}
