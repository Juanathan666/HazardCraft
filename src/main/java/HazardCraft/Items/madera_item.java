package HazardCraft.Items;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class madera_item extends ItemBase
{

	public madera_item(String name) 
	{
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		boolean ya = false;
		//player.openGui(HazardCraft.instance, 1, player.world, (int)player.posX, (int)player.posY, (int)player.posZ);
		
		RayTraceResult lookingAt = player.rayTrace(1000, 1);
	        for(int i = (int) lookingAt.getBlockPos().getY(); i>0 && !ya; i--) {
	        	BlockPos pos = new BlockPos(lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	        	if(!worldIn.getBlockState(pos).getBlock().equals(Blocks.AIR)) {
	    	        EntityLightningBolt l = new EntityLightningBolt(worldIn, lookingAt.getBlockPos().getX(), lookingAt.getBlockPos().getY(), lookingAt.getBlockPos().getZ(), false);
	        		worldIn.spawnEntity(l);
	        		//worldIn.setBlockState(pos, Blocks.OBSIDIAN.getDefaultState());

	        		ya=true;
	        	}
	        	
	        }
            
	     
		
		return super.onItemRightClick(worldIn, player, handIn);
	}
}
