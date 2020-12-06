package HazardCraft.Bloques.Menas.OverWorld;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class mena_de_zafiro extends Registro_Bloques 
{
	public static int prob;
	public static int cantidad = 1;

	public mena_de_zafiro(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return Items_OverWorld.GEMA_DE_ZAFIRO;
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random rand) 
	{
		if (fortune > 0)
		{
			cantidad = rand.nextInt((fortune*2)+1);
			
			if (cantidad < 1)
			{
				cantidad = 1;
			}
		}
		
		return cantidad;
	}
	
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) 
	{
		if (fortune >= 1)
		{
    		return 2 + (fortune*3);
    	}
	
    	else
    	{
        	return 2;
    	}
	}
}
