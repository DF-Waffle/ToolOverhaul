package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.ItemHoe;

public class TOemerald_Hoe extends ItemHoe {
    public TOemerald_Hoe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
