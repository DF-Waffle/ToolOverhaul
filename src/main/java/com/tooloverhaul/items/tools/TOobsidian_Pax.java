package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOobsidian_Pax extends ItemPaxel {
    public TOobsidian_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
