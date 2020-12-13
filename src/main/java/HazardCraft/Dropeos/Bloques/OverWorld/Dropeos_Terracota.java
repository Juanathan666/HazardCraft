package HazardCraft.Dropeos.Bloques.OverWorld;

import java.util.Random;

import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Dropeos_Terracota 
{
	Random rand = new Random();
	
	private int prob;
	
	private int cantidad;
	
	private int tope1;
	
	
	@SubscribeEvent
	public void Terracota (HarvestDropsEvent event)
	{
		if (event.getHarvester() != null)
		{
			if (event.getState().toString().contains("stained_hardened_clay"))
			{
				event.setDropChance(1.0f); //probabilidad de dropeo
				
				prob = rand.nextInt(100);
				
				if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:1s,id:35s}"))  //Fortuna 1
				{
					tope1 = 96;  // 3%
					
					
					if (prob > tope1)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, 1)); //nuevo dropeo
					}
				}
				
				else if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:2s,id:35s}"))  // Fortuna 2
				{
					tope1 = 94;  // 5%
					
					if (prob > tope1)
					{
						cantidad = rand.nextInt(2);
						
						if (cantidad < 1)
						{
							cantidad = 1;
						}
						
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, cantidad)); //nuevo dropeo
					}
				}
				
				else if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:3s,id:35s}"))  // Fortuna 3
				{
					tope1 = 91;  // 8%
					
					
					if (prob > tope1)
					{
						cantidad = rand.nextInt(3);
						
						if (cantidad < 1)
						{
							cantidad = 1;
						}
						
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, cantidad)); //nuevo dropeo
					}
				}
				
				else  // sin encantamiento de fortuna
				{
					tope1 = 98;  // 1%
					
					if (prob > tope1)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, 1)); //nuevo dropeo
					}
				}
			}
		}
	}
}
