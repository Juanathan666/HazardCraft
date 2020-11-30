package HazardCraft.Bloques.Decorativos.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import HazardCraft.Util.PilarBase_estados;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class pilar_de_marmol_verde extends Registro_Bloques{

	public pilar_de_marmol_verde(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}
	
	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer,ItemStack stack) {
		PilarBase_estados.normal_onblock_placed(world, pos, state, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE_INFERIOR, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE_SUPERIOR, Bloques_OverWorld_Decoracion.PILAR_DE_MARMOL_VERDE);
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
