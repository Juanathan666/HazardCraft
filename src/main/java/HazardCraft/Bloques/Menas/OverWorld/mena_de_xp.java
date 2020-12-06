package HazardCraft.Bloques.Menas.OverWorld;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class mena_de_xp extends Registro_Bloques {

	public mena_de_xp(String name, Material material) 
	{
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}

	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) 
	{
		return 200;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) 
	{
		return 0;
	}
}
