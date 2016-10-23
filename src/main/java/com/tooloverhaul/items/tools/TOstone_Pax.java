package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOstone_Pax extends ItemPaxel {

    public TOstone_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
