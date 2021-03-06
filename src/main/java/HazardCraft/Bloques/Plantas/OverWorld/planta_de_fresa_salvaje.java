package HazardCraft.Bloques.Plantas.OverWorld;

import java.util.Random;

import javax.annotation.Nullable;

import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class planta_de_fresa_salvaje extends Registro_Bloques
{
	private static final AxisAlignedBB[] FRESA_AXIS = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), 
			   															   new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
	
	public static int cantidad = 0;
	public static int prob = 0;

	public planta_de_fresa_salvaje(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.PLANT);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Items_OverWorld.FRESA;
	}
	
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random rand) 
	{
		prob = rand.nextInt(99);
		
		
		if (prob >= 0 && prob < 93)
		{
			cantidad = 1;
		}
		
		else if (prob >= 93 && prob < 98)
		{
			cantidad = 2;
		}
		
		else if (prob >= 98 && prob <= 99)
		{
			cantidad = 3;
		}
		
		return cantidad;
	}
	
	 @SideOnly(Side.CLIENT)
	 public BlockRenderLayer getBlockLayer()
	 {
	    return BlockRenderLayer.CUTOUT;
	 }
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	 @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return FRESA_AXIS[((Integer)3).intValue()];
	}
}
