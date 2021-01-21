package HazardCraft.Bloques.Plantas.OverWorld;

import java.util.Random;

import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class planta_de_fresa_salvaje extends Registro_Bloques
{
	public static int cantidad = 1;

	public planta_de_fresa_salvaje(String name, Material material) 
	{
		super(name, material);
		setHardness(0.0F);
		setResistance(0.0F);
		//setHarvestLevel("any", 0);
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
		cantidad = rand.nextInt(2);
			
			if (cantidad < 1)
			{
				cantidad = 1;
			}
		
		return cantidad;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
}
