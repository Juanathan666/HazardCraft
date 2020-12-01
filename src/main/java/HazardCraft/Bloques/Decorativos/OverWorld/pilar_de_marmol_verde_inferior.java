package HazardCraft.Bloques.Decorativos.OverWorld;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Util.PilarBase_estados;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class pilar_de_marmol_verde_inferior extends Registro_Bloques {

	public pilar_de_marmol_verde_inferior(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
		this.setTickRandomly(true);

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
	public void onBlockDestroyedByPlayer(World world, BlockPos pos, IBlockState state) {
		PilarBase_estados.inferior_onblock_destroyed(world, pos, state, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE_INFERIOR, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE_SUPERIOR, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE);
		super.onBlockDestroyedByPlayer(world, pos, state);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE);
	}

	@Override
	protected boolean canSilkHarvest() {
		return false;
	}
	
}
