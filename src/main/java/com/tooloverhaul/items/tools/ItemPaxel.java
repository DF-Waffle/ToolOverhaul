package com.tooloverhaul.items.tools;

import com.google.common.collect.Sets;
import com.tooloverhaul.TOGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class ItemPaxel extends ItemTool {
    private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE, Blocks.ACTIVATOR_RAIL, Blocks.COAL_ORE, Blocks.COBBLESTONE, Blocks.DETECTOR_RAIL, Blocks.DIAMOND_BLOCK, Blocks.DIAMOND_ORE, Blocks.DOUBLE_STONE_SLAB, Blocks.GOLDEN_RAIL, Blocks.GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.ICE, Blocks.IRON_BLOCK, Blocks.IRON_ORE, Blocks.LAPIS_BLOCK, Blocks.LAPIS_ORE, Blocks.LIT_REDSTONE_ORE, Blocks.MOSSY_COBBLESTONE, Blocks.NETHERRACK, Blocks.PACKED_ICE, Blocks.RAIL, Blocks.REDSTONE_ORE, Blocks.SANDSTONE, Blocks.RED_SANDSTONE, Blocks.STONE, Blocks.STONE_SLAB, Blocks.STONE_BUTTON, Blocks.STONE_PRESSURE_PLATE, Blocks.CLAY, Blocks.DIRT, Blocks.FARMLAND, Blocks.GRASS, Blocks.GRAVEL, Blocks.MYCELIUM, Blocks.SAND, Blocks.SNOW, Blocks.SNOW_LAYER, Blocks.SOUL_SAND, Blocks.GRASS_PATH, Blocks.STONE, Blocks.COBBLESTONE, Blocks.BEDROCK});
    private static final float [] ATTACK_DAMAGE = new float[] {6.0F, 8.0F, 8.0F, 8.0F, 6.0F};
    private static final float [] ATTACK_SPEED = new float[] {-3.2F, -3.2F, -3.1F, -3.0F, -3.0F};

    public ItemPaxel(String name, Item.ToolMaterial material){
        super(material, EFFECTIVE_ON);
        this.setCreativeTab(TOGlobal.toCreativeTab);
        setUnlocalizedName(name);

    }

    @Override
    public boolean canHarvestBlock(IBlockState state, ItemStack stack)
    {
        Block block = state.getBlock();

        if(block == Blocks.OBSIDIAN)
        {
            return toolMaterial.getHarvestLevel() == 3;
        }

        if(block == Blocks.DIAMOND_BLOCK || block == Blocks.DIAMOND_ORE)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block == Blocks.GOLD_BLOCK || block == Blocks.GOLD_ORE)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block == Blocks.IRON_BLOCK || block == Blocks.IRON_ORE)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }

        if(block == Blocks.LAPIS_BLOCK || block == Blocks.LAPIS_ORE)
        {
            return toolMaterial.getHarvestLevel() >= 1;
        }

        if(block == Blocks.REDSTONE_ORE || block == Blocks.LIT_REDSTONE_ORE)
        {
            return toolMaterial.getHarvestLevel() >= 2;
        }

        if(block == Blocks.ANVIL)
        {
            return toolMaterial.getHarvestLevel() >= 0;
        }

        if(block == Blocks.SNOW || block == Blocks.SNOW_LAYER)
        {
            return true;
        }

        if(state.getMaterial() == Material.ROCK)
        {
            return true;
        }

        return state.getMaterial() == Material.IRON;
    }

    public float getStrVsBlock(ItemStack stack, IBlockState state){
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE && material != Material.ROCK && material != Material.GROUND ? super.getStrVsBlock(stack, state) : this.efficiencyOnProperMaterial;
    }
}

