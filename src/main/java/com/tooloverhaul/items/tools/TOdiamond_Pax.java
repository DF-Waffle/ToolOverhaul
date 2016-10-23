package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOdiamond_Pax extends ItemPaxel {
    public TOdiamond_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
