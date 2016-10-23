package com.tooloverhaul.items.blocks;

import com.tooloverhaul.TOGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TOBlock extends Block {
    public TOBlock(String unlocalizedName, Material material, float hardness, float resistance){
        super(material);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        this.setUnlocalizedName(unlocalizedName);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }
}
