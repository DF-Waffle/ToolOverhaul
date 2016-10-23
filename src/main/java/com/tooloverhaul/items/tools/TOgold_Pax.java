package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOgold_Pax extends ItemPaxel {
    public TOgold_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
