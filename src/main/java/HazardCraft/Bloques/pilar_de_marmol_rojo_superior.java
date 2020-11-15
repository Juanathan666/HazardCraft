package HazardCraft.Bloques;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import HazardCraft.Util.PilarBase_estados;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class pilar_de_marmol_rojo_superior extends BlockBase {

	public pilar_de_marmol_rojo_superior(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
		this.setTickRandomly(true);

	}
	
	
	@Override
	public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
	PilarBase_estados.superior_onblock_destroyed(world, pos, state, Bloques.PILAR_DE_MARMOL_ROJO_INFERIOR, Bloques.PILAR_DE_MARMOL_ROJO_SUPERIOR, Bloques.PILAR_DE_MARMOL_ROJO);
		super.onBlockDestroyedByPlayer(world, pos, state);
	}
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return Item.getItemFromBlock(Bloques.PILAR_DE_MARMOL_ROJO);
	}
	
	@Override
	protected boolean canSilkHarvest() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
