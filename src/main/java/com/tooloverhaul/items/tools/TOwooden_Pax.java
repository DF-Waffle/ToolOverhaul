package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOwooden_Pax extends ItemPaxel {
    public TOwooden_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
