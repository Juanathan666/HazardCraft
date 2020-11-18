package HazardCraft.Bloques;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class mena_de_enderita extends BlockBase {

	public mena_de_enderita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(17.0F);
		setResistance(17.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.STONE);
	}
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return  Items.FRAGMENTO_DE_ENDERITA;
	}
	
	@Override
	public int quantityDropped(IBlockState state, int fortune, Random random) {
		// TODO Auto-generated method stub
		return 0+(random.nextInt(2) + fortune);
	}
}
