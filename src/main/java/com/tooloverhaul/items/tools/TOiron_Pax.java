package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOiron_Pax extends ItemPaxel {
    public TOiron_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
