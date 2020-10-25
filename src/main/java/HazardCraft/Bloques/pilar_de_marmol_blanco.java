package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class pilar_de_marmol_blanco extends BlockBase{

	public pilar_de_marmol_blanco(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer,ItemStack stack) {
		if(!world.getBlockState(pos.down()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO_INFERIOR) && !world.getBlockState(pos.down()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO)) {
			world.setBlockState(pos, Bloques.PILAR_DE_MARMOL_BLANCO_INFERIOR.getDefaultState(), 0);
	}
		if(!world.getBlockState(pos.up()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO) && (world.getBlockState(pos.down()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO) || world.getBlockState(pos.down()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO_INFERIOR))) {
		    world.setBlockState(pos, Bloques.PILAR_DE_MARMOL_BLANCO_SUPERIOR.getDefaultState(), 0);

	}
		if(world.getBlockState(pos.down()).getBlock().equals(Bloques.PILAR_DE_MARMOL_BLANCO_SUPERIOR)) {
			world.setBlockState(pos.down(), Bloques.PILAR_DE_MARMOL_BLANCO.getDefaultState(), 0);
			world.setBlockState(pos, Bloques.PILAR_DE_MARMOL_BLANCO_SUPERIOR.getDefaultState(), 0);
		}
	
		if(world.getBlockState(pos.up()).getBlock() == Bloques.PILAR_DE_MARMOL_BLANCO_INFERIOR) {
			world.setBlockState(pos.up(), Bloques.PILAR_DE_MARMOL_BLANCO.getDefaultState());
		}
		super.onBlockPlacedBy(world, pos, state, placer, stack);
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
