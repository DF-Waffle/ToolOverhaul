package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.ItemSword;

public class TOemerald_Sword extends ItemSword {
    public TOemerald_Sword(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
