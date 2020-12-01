package HazardCraft.Items.Magia.Varitas;

import java.util.Random;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Registrar.Items_Magia_Varitas;
import HazardCraft.Items.Registrar.Registro_Items;
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

public class varita_de_rayos_experto extends Registro_Items
{
	private static final int durabilidad = 25;

	public varita_de_rayos_experto(String name) 
	{
		super(name);
		setMaxDamage(durabilidad);
		setMaxStackSize(1);
		setCreativeTab(HazardCraft.HazardCraftTab_Varitas);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand hand) 
	{
		boolean ya = false;
		
		RayTraceResult lookingAt = Cosas_utiles_random.dar_coordenadas_de_donde_esta_mirando(worldIn, player, 1000, 1);
	        
		for(int i = (int) lookingAt.getBlockPos().getY(); i>0 && !ya; i--) 
		{
	        BlockPos pos = new BlockPos(lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	        
	        if(!worldIn.getBlockState(pos).getBlock().equals(Blocks.AIR)) 
	        {
	    		if(player.getHeldItem(hand.MAIN_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_RAYOS_EXPERTO)) 
	    		{
	    			funcion_varita(worldIn, player, hand, "main",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());

	    		}
	    		else if(player.getHeldItem(hand.OFF_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_RAYOS_EXPERTO)) 
	    		{
	    			funcion_varita(worldIn, player, hand, "off",lookingAt.getBlockPos().getX(), i, lookingAt.getBlockPos().getZ());
	    		}

	        	ya=true;
	        }
	    }
            
	    return super.onItemRightClick(worldIn, player, hand);
	}
	
	
	public static void funcion_varita(World world, EntityPlayer player, EnumHand hand, String cual_mano, int x, int y, int z) 
	{
		boolean ya = false;
		
		if(cual_mano.equalsIgnoreCase("main")) 
		{
			int damage = player.getHeldItem(hand.MAIN_HAND).getItemDamage();
			
			if(!(damage==durabilidad)) 
			{
				Random rand = new Random();

				EntityLightningBolt l = new EntityLightningBolt(world, x, y+1, z, false);
	    		world.spawnEntity(l);	
	    		
	    		for(int id = y; (!ya&&id>0); id--)
	    		{
	    			int xrand = x+rand.nextInt(10);
	    			int zrand = z+rand.nextInt(10);
	    			
	    			BlockPos posb = new BlockPos(xrand, id, zrand);
	    			
	    			if(!world.getBlockState(posb).getBlock().equals(Blocks.AIR)) 
	    			{
	    				EntityLightningBolt l1 = new EntityLightningBolt(world, xrand, id+1, zrand, false);
			    		world.spawnEntity(l1);	
	    				
			    		ya=true;
	    			}
	    		}
	    		
	    		if(world.isRemote && !player.capabilities.isCreativeMode) 
	    		{
	    			player.getHeldItem(hand.MAIN_HAND).setItemDamage(damage+1);
				}
			}
			else 
			{
				player.setItemStackToSlot(EntityEquipmentSlot.MAINHAND, ItemStack.EMPTY);
				world.playSound(player, player.getPosition(), Sonidos.romper_varita, SoundCategory.PLAYERS, 1.0F, 1.0F);
			}
		
		}
		else if(cual_mano.equalsIgnoreCase("off")) 
		{
			int damage = player.getHeldItem(hand.OFF_HAND).getItemDamage();
		
			if(!(damage==durabilidad)) 
			{
				Random rand = new Random();

				EntityLightningBolt l = new EntityLightningBolt(world, x, y+1, z, false);
				world.spawnEntity(l);	
    		
				for(int id = y; (!ya&&id>0); id--)
				{
					int xrand = x+rand.nextInt(10);
					int zrand = z+rand.nextInt(10);
    			
					BlockPos posb = new BlockPos(xrand, id, zrand);
    			
					if(!world.getBlockState(posb).getBlock().equals(Blocks.AIR)) 
					{
						EntityLightningBolt l1 = new EntityLightningBolt(world, xrand, id+1, zrand, false);
						world.spawnEntity(l1);	
						ya=true;
					}
				}		
    		
				if(world.isRemote && !player.capabilities.isCreativeMode) 
				{
					player.getHeldItem(hand.OFF_HAND).setItemDamage(damage+1);
				}
			}
			else 
			{
				player.setItemStackToSlot(EntityEquipmentSlot.OFFHAND, ItemStack.EMPTY);
				world.playSound(player, player.getPosition(), Sonidos.romper_varita, SoundCategory.PLAYERS, 1.0F, 1.0F);
			}
		}
	}
}
