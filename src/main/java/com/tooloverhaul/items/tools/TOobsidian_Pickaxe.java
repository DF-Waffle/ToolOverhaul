package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.ItemPickaxe;

public class TOobsidian_Pickaxe extends ItemPickaxe {
    public TOobsidian_Pickaxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }
}
