package HazardCraft.Dropeos.Bloques.OverWorld;

import java.util.Random;

import HazardCraft.HazardCraft;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Dropeos_Madera 
{
	@SubscribeEvent
	public void yourPlayerHarvestEvent(HarvestDropsEvent event) 
	{
		Random rand = new Random();
		int fortune = 0;
		int prob;
		int tope = 0;
		
		if (event.getHarvester() != null) 
		{
			if (event.getState().toString().contains("jungle") && event.getState().toString().contains("log"))
			{
				event.setDropChance(1.0f); //probabilidad de dropeo
				
				prob = rand.nextInt(100);
				
				if (fortune == 0)
				{
					tope = 95;  // 4%
					
					if (prob > tope)
					{
						event.getDrops().add(new ItemStack(Items.APPLE, 1)); //nuevo dropeo
					}
				}
				
				else if (fortune > 0)
				{
					tope = 95 - (fortune*3);  // fortune 1 = 7%, fortune 2 = 10%, fortune 3 = 13%
					
					if (prob > tope)
					{
						if (fortune == 1)
						{
							event.getDrops().add(new ItemStack(Items.BLAZE_ROD, 1)); //nuevo dropeo
						}
						
						else if (fortune == 2)
						{
							event.getDrops().add(new ItemStack(Items.CAKE, 1)); //nuevo dropeo
						}
						
						else if (fortune == 3)
						{
							event.getDrops().add(new ItemStack(Items.DIAMOND, 1)); //nuevo dropeo
						}
					}
				}
			}
		}
	}
}
