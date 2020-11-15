package HazardCraft.Items.varita;

import HazardCraft.Iniciar.Items;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.ItemBase;
import HazardCraft.Util.Cosas_utiles_random;
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

public class varita_de_fuego_maestro extends ItemBase
{
	private static final int durabilidad = 40;

	public varita_de_fuego_maestro(String name) 
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
	    			if(player.getHeldItem(hand.MAIN_HAND).getItem().equals(Items.VARITA_DE_FUEGO_MAESTRO)) {
	                    funcion_varita(worldIn, player, hand, "main",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());

	    			}else if(player.getHeldItem(hand.OFF_HAND).getItem().equals(Items.VARITA_DE_FUEGO_MAESTRO)) {
	    				
	                    funcion_varita(worldIn, player, hand, "off",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	    			}

	        		ya=true;
	        	}
	        	
	        }
            
	     
		
		return super.onItemRightClick(worldIn, player, hand);
	}
	
	
	public static void funcion_varita(World world, EntityPlayer player, EnumHand hand, String cual_mano, int x, int y, int z) {
		BlockPos posb = new BlockPos(x,y+1,z);
		BlockPos posb1 = new BlockPos(x+1,y+1,z+1);
		BlockPos posb2 = new BlockPos(x-1,y+1,z-1);
		BlockPos posb3 = new BlockPos(x-1,y+1,z+1);
		BlockPos posb4 = new BlockPos(x+1,y+1,z-1);
		
		BlockPos posb5 = new BlockPos(x+3,y+1,z+2);
		BlockPos posb6 = new BlockPos(x+3,y+1,z+3);
		BlockPos posb7 = new BlockPos(x+2,y+1,z+3);
		
		BlockPos posb8 = new BlockPos(x-3,y+1,z+2);
		BlockPos posb9 = new BlockPos(x-3,y+1,z+3);
		BlockPos posb10 = new BlockPos(x-2,y+1,z+3);
		
		BlockPos posb11 = new BlockPos(x+3,y+1,z-2);
		BlockPos posb12 = new BlockPos(x+3,y+1,z-3);
		BlockPos posb13 = new BlockPos(x+2,y+1,z-3);
		
		BlockPos posb14 = new BlockPos(x-3,y+1,z-2);
		BlockPos posb15 = new BlockPos(x-3,y+1,z-3);
		BlockPos posb16 = new BlockPos(x-2,y+1,z-3);
		
		if(cual_mano.equalsIgnoreCase("main")) {
			int damage = player.getHeldItem(hand.MAIN_HAND).getItemDamage();
			
			if(!(damage==durabilidad)) {
				world.setBlockState(posb, Blocks.FIRE.getDefaultState());	
				
				if(world.getBlockState(posb1).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb1, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb2).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb2, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb3).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb3, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb4).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb4, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb5).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb5, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb6).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb6, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb7).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb7, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb8).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb8, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb9).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb9, Blocks.FIRE.getDefaultState());
				}
				
				if(world.getBlockState(posb10).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb10, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb11).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb11, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb12).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb12, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb13).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb13, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb14).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb14, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb15).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb15, Blocks.FIRE.getDefaultState());
				}
				if(world.getBlockState(posb16).getBlock().equals(Blocks.AIR)) {
					world.setBlockState(posb16, Blocks.FIRE.getDefaultState());
				}
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
			world.setBlockState(posb, Blocks.FIRE.getDefaultState());		
			world.setBlockState(posb.north(), Blocks.FIRE.getDefaultState());	
			world.setBlockState(posb.south(), Blocks.FIRE.getDefaultState());
			world.setBlockState(posb.west(), Blocks.FIRE.getDefaultState());
			world.setBlockState(posb.east(), Blocks.FIRE.getDefaultState());

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
