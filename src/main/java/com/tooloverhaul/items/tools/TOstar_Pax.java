package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOstar_Pax extends ItemPaxel {
    public TOstar_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
