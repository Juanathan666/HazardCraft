package HazardCraft.Util;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PilarBase_estados {

	public static void inferior_onblock_destroyed(World world, BlockPos pos, IBlockState state, Block inferior, Block superior, Block normal) {
		
     if(world.getBlockState(pos.up()).getBlock().equals(superior)) {
			
			world.setBlockState(pos.up(), normal.getDefaultState(), 0);
		}
		
      if(world.getBlockState(pos.up()).getBlock().equals(normal)) {
			
			world.setBlockState(pos.up(), inferior.getDefaultState(), 0);
		}
		
		
	}
	
	public static void superior_onblock_destroyed(World world, BlockPos pos, IBlockState state, Block inferior, Block superior, Block normal) {
		
		if(world.getBlockState(pos.down()).getBlock().equals(normal)) {
			
			world.setBlockState(pos.down(), superior.getDefaultState(), 0);
		}
		
	}
	
	public static void normal_onblock_placed(World world, BlockPos pos, IBlockState state, Block inferior, Block superior, Block normal) {
		
		
		if(!world.getBlockState(pos.down()).getBlock().equals(inferior) && !world.getBlockState(pos.down()).getBlock().equals(normal)) {
			world.setBlockState(pos, inferior.getDefaultState(), 0);
	}
		if(!world.getBlockState(pos.up()).getBlock().equals(normal) && (world.getBlockState(pos.down()).getBlock().equals(normal) || world.getBlockState(pos.down()).getBlock().equals(inferior))) {
		    world.setBlockState(pos, superior.getDefaultState(), 0);

	}
		if(world.getBlockState(pos.down()).getBlock().equals(superior)) {
			world.setBlockState(pos.down(), normal.getDefaultState(), 0);
			world.setBlockState(pos, superior.getDefaultState(), 0);
		}
	
		if(world.getBlockState(pos.up()).getBlock() == inferior) {
			world.setBlockState(pos.up(), normal.getDefaultState());
		}
	}

	
}
