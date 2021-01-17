package HazardCraft.Bloques.Plantas.OverWorld;

import java.util.Random;

import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Bloques.Registrar.Bloques_Overworld_Plantas;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class planta_de_tomate extends BlockCrops 
{

	private static final AxisAlignedBB[] TOMATE_AXIS = new AxisAlignedBB[] {new AxisAlignedBB(0.40D, 0.0D, 0.40D, 0.6D, 0.125D, 0.6D), 
																		   new AxisAlignedBB(0.3D, 0.0D, 0.3D, 0.7D, 0.25D, 0.7D), 
																		   new AxisAlignedBB(0.3D, 0.0D, 0.3D, 0.7D, 0.75D, 0.7D), 
																		   new AxisAlignedBB(0.2D, 0.0D, 0.2D, 0.8D, 1.0D, 0.8D)};
	
	public planta_de_tomate(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		Bloques_OverWorld_Decoracion.BLOCKS.add(this);
		
		Bloques_Overworld_Plantas.BLOCKS.add(this);
		
		Items_OverWorld.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {

		if(!worldIn.isRemote) 
		{
			Random rand = new Random();
		
			if(this.isMaxAge(state)) 
			{
				worldIn.spawnEntity(new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(Items_OverWorld.TOMATE, 1+rand.nextInt(2))));
				worldIn.setBlockState(pos, this.withAge(0));
			
				return true;
			}
		}
	
		return false;
	}	
	

	@Override
	public int getMaxAge() 
	{
		return 3;
	}
	

	@Override
	protected Item getSeed() 
	{
		return Items_OverWorld.SEMILLA_DE_TOMATE;
	}
	
	@Override
	protected Item getCrop() 
	{
		return Items_OverWorld.TOMATE;
	}
	
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return TOMATE_AXIS[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
	
}