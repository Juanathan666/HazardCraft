package HazardCraft.CambiosMecanicas;

import HazardCraft.Encantamientos.Encantamiento;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class nonadar {

	private static boolean mensaje_una_vez = false;
	@SubscribeEvent
	public void yourPlayerHarvestEvent(InputUpdateEvent event) 
	{
		EntityPlayer player = event.getEntityPlayer();
		
		int level = EnchantmentHelper.getMaxEnchantmentLevel(Encantamiento.Habilidad_Aquatica, player);

		if(player.isInWater() && !player.capabilities.isCreativeMode) 
		{
			if(level == 0) 
			{ 
				if(!mensaje_una_vez) 
				{
					event.getEntity().sendMessage(new TextComponentTranslation("mensaje.nonadar.name"));
					mensaje_una_vez = true;
				}
				nonadar(event);
			}
		}
	}
	
	
	public static void nonadar(InputUpdateEvent event) 
	{
		
		event.getMovementInput().jump = false;
	}
}
