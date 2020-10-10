package HazardCraft.CambiosMecanicas;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class nonadar {

	
	@SubscribeEvent
	public void yourPlayerHarvestEvent(InputUpdateEvent event) 
	{
		
		EntityPlayer player = event.getEntityPlayer();
		
		int level = EnchantmentHelper.getMaxEnchantmentLevel(Encantamiento.Habilidad_Aquatica, player);

		if(player.isInWater() && !player.capabilities.isCreativeMode) {
			
			if(level == 0) {
				nonadar(event);
			}
			
				
		     }
		}
	
	
	
	public static void nonadar(InputUpdateEvent event) {
		
		event.getMovementInput().jump = false;
		

	}
	
	

}
