package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;

public class TOemerald_Pax extends ItemPaxel {


    public TOemerald_Pax(String name, ToolMaterial material) {
        super(name, material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(name);
    }
}
