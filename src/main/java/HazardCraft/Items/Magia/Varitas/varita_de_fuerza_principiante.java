package HazardCraft.Items.Magia.Varitas;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Sonidos;
import HazardCraft.Items.Registrar.Items_Magia_Varitas;
import HazardCraft.Items.Registrar.Registro_Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class varita_de_fuerza_principiante extends Registro_Items {

	private static final int durabilidad = 12;
	
	public varita_de_fuerza_principiante(String name) {
			
		super(name);
		
		setMaxDamage(durabilidad);
		setMaxStackSize(1);
		setCreativeTab(HazardCraft.HazardCraftTab_Varitas);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) 
	{
		if(player.getHeldItem(hand.MAIN_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_FUERZA_PRINCIPIANTE)) 
		{
			funcion_varita(world, player, hand, "main");
		}
		else if(player.getHeldItem(hand.OFF_HAND).getItem().equals(Items_Magia_Varitas.VARITA_DE_FUERZA_PRINCIPIANTE)) 
		{
			funcion_varita(world, player, hand, "off");
		}
		  
		return super.onItemRightClick(world, player, hand);
	}

	public static void funcion_varita(World world, EntityPlayer player, EnumHand hand, String cual_mano) 
	{
		if(cual_mano.equalsIgnoreCase("main")) 
		{
			int damage = player.getHeldItem(hand.MAIN_HAND).getItemDamage();
			
			if(!(damage==durabilidad)) 
			{
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 24*(4) , 1));
				
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
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 24*(4) , 1));
				
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
