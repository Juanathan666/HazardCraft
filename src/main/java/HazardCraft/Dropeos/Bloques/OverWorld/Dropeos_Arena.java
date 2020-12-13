package HazardCraft.Dropeos.Bloques.OverWorld;

import java.util.Random;

import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Dropeos_Arena 
{
	Random rand = new Random();
	
	private int prob;
	
	private int cantidad;
	
	private int tope1;
	private int tope2;
	
	
	@SubscribeEvent
	public void Arena (HarvestDropsEvent event)
	{
		if (event.getHarvester() != null)
		{
			if (event.getState().toString().contains("[variant=sand]") ||
				event.getState().toString().contains("[variant=red_sand]"))
			{
				event.setDropChance(1.0f); //probabilidad de dropeo
				
				prob = rand.nextInt(100);
				
				if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:1s,id:35s}"))  //Fortuna 1
				{
					tope1 = 95;  // 3%
					tope2 = 98;  // 1%
					
					
					if (prob > tope1 && prob <= tope2)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, 1)); //nuevo dropeo
					}
					
					else if (prob > tope2)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_AGUA, 1)); //nuevo dropeo
					}
				}
				
				else if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:2s,id:35s}"))  // Fortuna 2
				{
					tope1 = 92;  // 5%
					tope2 = 97;  // 2%
					
					if (prob > tope1 && prob <= tope2)
					{
						cantidad = rand.nextInt(2);
						
						if (cantidad < 1)
						{
							cantidad = 1;
						}
						
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, cantidad)); //nuevo dropeo
					}
					
					else if (prob > tope2)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_AGUA, 1)); //nuevo dropeo
					}
				}
				
				else if (event.getHarvester().getHeldItem(event.getHarvester().getActiveHand()).getEnchantmentTagList().toString().contains("{lvl:3s,id:35s}"))  // Fortuna 3
				{
					tope1 = 86;  // 8%
					tope2 = 94;  // 5%
					
					
					if (prob > tope1 && prob <= tope2)
					{
						cantidad = rand.nextInt(3);
						
						if (cantidad < 1)
						{
							cantidad = 1;
						}
						
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, cantidad)); //nuevo dropeo
					}
					
					else if (prob > tope2)
					{
						cantidad = rand.nextInt(2);
						
						if (cantidad < 1)
						{
							cantidad = 1;
						}
						
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_AGUA, cantidad)); //nuevo dropeo
					}
				}
				
				else  // sin encantamiento de fortuna
				{
					tope1 = 97;  // 2%
					
					if (prob > tope1)
					{
						event.getDrops().add(new ItemStack(Items_OverWorld.ESENCIA_DE_TIERRA, 1)); //nuevo dropeo
					}
				}
			}
		}
	}
}
