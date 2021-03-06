package HazardCraft.Items.Cultivos;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Bloques_Overworld_Plantas;
import HazardCraft.Items.Registrar.Registro_Items;
import HazardCraft.Util.Modelos;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;

public class semilla_de_tomate extends Registro_Items implements Modelos, IPlantable 
{
	
	public semilla_de_tomate(String name) 
	{
		super(name);

		setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
	}


	@Override
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) 
	{
		
		ItemStack stack = player.getHeldItem(hand);
		IBlockState state = worldIn.getBlockState(pos);
		 
		if(facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, stack) && state.getBlock().canSustainPlant(state, worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up())) 
		{
			
			worldIn.setBlockState(pos.up(), Bloques_Overworld_Plantas.PLANTA_DE_TOMATE.getDefaultState());
			stack.shrink(1);
			
			return EnumActionResult.SUCCESS;
		}
		else 
		{
			return EnumActionResult.FAIL;
		}
		
	}

	
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) 
	{
		return EnumPlantType.Crop;
	}
	

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) 
	{
		return Bloques_Overworld_Plantas.PLANTA_DE_TOMATE.getDefaultState();
	}

}
