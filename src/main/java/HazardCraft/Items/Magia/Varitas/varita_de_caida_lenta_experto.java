package HazardCraft.Items.Magia.Varitas;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Registrar.Items_Magia_Varitas;
import HazardCraft.Items.Registrar.Registro_Items;
import HazardCraft.Pociones.Pociones;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class varita_de_caida_lenta_experto extends Registro_Items {

	private static final int durabilidad = 25;
	
	public varita_de_caida_lenta_experto(String name) 
	{
		super(name);
		
		setMaxDamage(durabilidad);
		setMaxStackSize(1);
		setCreativeTab(HazardCraft.HazardCraftTab_Varitas);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) 
	{
		if(player.getHeldItem(hand.MAIN_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_CAIDA_LENTA_EXPERTO)) 
		{
			funcion_varita(world, player, hand, "main");
		}
		else if(player.getHeldItem(hand.OFF_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_CAIDA_LENTA_EXPERTO)) 
		{
			funcion_varita(world, player, hand, "off");
		}
		  
		return super.onItemRightClick(world, player, hand);
	}

	public static void funcion_varita(World world, EntityPlayer player, EnumHand hand, String cual_mano) 
	{
		if(cual_mano.equalsIgnoreCase("main")) 
		{
			BlockPos posb = new BlockPos(player.posX, player.posY-1, player.posZ);
			
			if(world.getBlockState(posb).getBlock()==Blocks.AIR) 
			{
				int damage = player.getHeldItem(hand.MAIN_HAND).getItemDamage();
			
				if(!(damage==durabilidad)) 
				{
					player.addPotionEffect(new PotionEffect(Pociones.CAIDA_LENTA_EFECTO, 24*(10) , 1));
					
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
		}
		
		else if(cual_mano.equalsIgnoreCase("off")) 
		{
			BlockPos posb = new BlockPos(player.posX, player.posY-1, player.posZ);
			
			if(world.getBlockState(posb).getBlock()==Blocks.AIR) 
			{
				int damage = player.getHeldItem(hand.OFF_HAND).getItemDamage();
		
				if(!(damage==durabilidad)) 
				{
					player.addPotionEffect(new PotionEffect(Pociones.CAIDA_LENTA_EFECTO, 24*(10) , 1));
					
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
}
