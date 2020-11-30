package HazardCraft.Items.Registrar;

import HazardCraft.HazardCraft;
import HazardCraft.Util.Cosas_utiles_random;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class madera_item extends Registro_Items
{

	public madera_item(String name) 
	{
		super(name);
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) 
	{
		boolean ya = false;
		//player.openGui(HazardCraft.instance, 1, player.world, (int)player.posX, (int)player.posY, (int)player.posZ);
		
		RayTraceResult lookingAt = Cosas_utiles_random.dar_coordenadas_de_donde_esta_mirando(worldIn, player, 1000, 1);
	        for(int i = (int) lookingAt.getBlockPos().getY(); i>0 && !ya; i--) {
	        	BlockPos pos = new BlockPos(lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	        	if(!worldIn.getBlockState(pos).getBlock().equals(Blocks.AIR)) {
	    	        EntityLightningBolt l = new EntityLightningBolt(worldIn, lookingAt.getBlockPos().getX(), i+1, lookingAt.getBlockPos().getZ(), false);
	        		worldIn.spawnEntity(l);

	        		ya=true;
	        	}
	        	
	        }
            
	     
		
		return super.onItemRightClick(worldIn, player, handIn);
	}
}
