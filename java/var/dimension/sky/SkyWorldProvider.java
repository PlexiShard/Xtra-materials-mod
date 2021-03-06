package var.dimension.sky;

import var.main.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderFlat;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SkyWorldProvider extends WorldProvider
{  
	@Override
    public IChunkProvider createChunkGenerator()
    {	return new SkyChunkProvider(this.worldObj, this.worldObj.getSeed());	}

	@Override
    public String getDimensionName()
    {	return "Sky World";	}

	@Override
    public String getInternalNameSuffix()
    {	return "_sky";	}
	
    public int getRespawnDimension(EntityPlayerMP player) {
        return 0;
    }
	
	public boolean canRespawnHere()
	{	return true;}
	
	public static WorldProvider getProviderForDimension(int dimension)
    {	return net.minecraftforge.common.DimensionManager.createProviderFor(dimension);}
	
	@SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {	return 32.0F;}
	
    
    
    public boolean isSurfaceWorld()
    {	return false;}

    protected void registerWorldChunkManager()
    {	this.worldChunkMgr = worldObj.getWorldInfo().getTerrainType().getChunkManager(worldObj);}
}