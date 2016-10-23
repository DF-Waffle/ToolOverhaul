package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.ItemHoe;

public class TOobsidian_Hoe extends ItemHoe {

    public TOobsidian_Hoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
