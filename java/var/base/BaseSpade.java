package var.base;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class BaseSpade extends BaseTool{
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.clay, Blocks.dirt, Blocks.farmland, Blocks.grass, Blocks.gravel, Blocks.mycelium, Blocks.sand, Blocks.snow, Blocks.snow_layer, Blocks.soul_sand});
    private static final String __OBFID = "CL_00000063";

    public BaseSpade(Item.ToolMaterial material)
    {	super(1.0F, material, EFFECTIVE_ON);}
    public BaseSpade(Item.ToolMaterial material, String uname, CreativeTabs tab, String texture)
    {	super(1.0F, material, EFFECTIVE_ON);
    	setupThis(uname, tab, texture);
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(Block blockIn)
    {
        return blockIn == Blocks.snow_layer ? true : blockIn == Blocks.snow;
    }

}
