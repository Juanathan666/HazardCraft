package HazardCraft.Items.varita;

import HazardCraft.Iniciar.Items;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.ItemBase;
import HazardCraft.Util.Cosas_utiles_random;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class varita_de_rayos_maestro extends ItemBase
{
	private static final int durabilidad = 40;

	public varita_de_rayos_maestro(String name) 
	{
		super(name);
		setMaxDamage(durabilidad);
		setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) 
	{
		boolean ya = false;
		
		RayTraceResult lookingAt = Cosas_utiles_random.dar_coordenadas_de_donde_esta_mirando(worldIn, player, 1000, 1);
	        for(int i = (int) lookingAt.getBlockPos().getY(); i>0 && !ya; i--) {
	        	BlockPos pos = new BlockPos(lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	        	if(!worldIn.getBlockState(pos).getBlock().equals(Blocks.AIR)) {
	    			if(player.getHeldItem(hand.MAIN_HAND).getItem().equals(Items.VARITA_DE_RAYOS_MAESTRO)) {
	                    funcion_varita(worldIn, player, hand, "main",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());

	    			}else if(player.getHeldItem(hand.OFF_HAND).getItem().equals(Items.VARITA_DE_RAYOS_MAESTRO)) {
	    				
	                    funcion_varita(worldIn, player, hand, "off",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	    			}

	        		ya=true;
	        	}
	        	
	        }
            
	     
		
		return super.onItemRightClick(worldIn, player, hand);
	}
	
	
	public static void funcion_varita(World world, EntityPlayer player, EnumHand hand, String cual_mano, int x, int y, int z) {
		if(cual_mano.equalsIgnoreCase("main")) {
			int damage = player.getHeldItem(hand.MAIN_HAND).getItemDamage();
			
			if(!(damage==durabilidad)) {
				EntityLightningBolt l = new EntityLightningBolt(world, x+2, y+1, z, false);
	    		world.spawnEntity(l);
	    		EntityLightningBolt ld = new EntityLightningBolt(world, x-2, y+1, z, false);
	    		world.spawnEntity(ld);
	    		EntityLightningBolt lb = new EntityLightningBolt(world, x, y+1, z+2, false);
	    		world.spawnEntity(lb);
	    		EntityLightningBolt ls = new EntityLightningBolt(world, x, y+1, z-2, false);
	    		world.spawnEntity(ls);
	    		EntityLightningBolt lc = new EntityLightningBolt(world, x, y+1, z, false);
	    		world.spawnEntity(lc);
	    		if(world.isRemote) {
			player.getHeldItem(hand.MAIN_HAND).setItemDamage(damage+1);

			
				}
			  }else {
				  
				  player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, ItemStack.EMPTY);
				  world.playSound(player, player.getPosition(), Sonidos.romper_varita, SoundCategory.PLAYERS, 1.0F, 1.0F);


			  }
		
	}else if(cual_mano.equalsIgnoreCase("off")) {
		int damage = player.getHeldItem(hand.OFF_HAND).getItemDamage();
		
		if(!(damage==durabilidad)) {
			EntityLightningBolt l = new EntityLightningBolt(world, x+2, y+1, z, false);
    		world.spawnEntity(l);
    		EntityLightningBolt ld = new EntityLightningBolt(world, x-2, y+1, z, false);
    		world.spawnEntity(ld);
    		EntityLightningBolt lb = new EntityLightningBolt(world, x, y+1, z+2, false);
    		world.spawnEntity(lb);
    		EntityLightningBolt ls = new EntityLightningBolt(world, x, y+1, z-2, false);
    		world.spawnEntity(ls);
    		EntityLightningBolt lc = new EntityLightningBolt(world, x, y+1, z, false);
    		world.spawnEntity(lc);		
    		if(world.isRemote) {
		player.getHeldItem(hand.OFF_HAND).setItemDamage(damage+1);

		
			}
		  }else {
			  player.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
			  world.playSound(player, player.getPosition(), Sonidos.romper_varita, SoundCategory.PLAYERS, 1.0F, 1.0F);
		  }
		
	  }
	}
	
}
