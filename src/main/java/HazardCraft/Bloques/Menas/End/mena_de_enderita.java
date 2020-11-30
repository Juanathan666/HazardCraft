package HazardCraft.Bloques.Menas.End;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Items.Registrar.Items_End;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class mena_de_enderita extends Registro_Bloques {

	public mena_de_enderita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(17.0F);
		setResistance(17.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.STONE);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return  Items_End.FRAGMENTO_DE_ENDERITA;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		// TODO Auto-generated method stub
		return 0+(random.nextInt(2) + fortune);
	}
}
