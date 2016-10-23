package com.tooloverhaul.items.tools;

import com.tooloverhaul.TOGlobal;
import net.minecraft.item.ItemSpade;

public class TOstar_Shovel extends ItemSpade {
    public TOstar_Shovel(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(TOGlobal.toCreativeTab);
    }

}
