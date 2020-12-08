package HazardCraft.Dropeos.Bloques.OverWorld;

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
		
		if (event.getHarvester() != null) 
		{
			if (event.getState().toString().contains("jungle") && event.getState().toString().contains("log"))
			{
				event.getDrops().clear();
				
				event.setDropChance(100.0f); //probabilidad de dropeo
				
				event.getDrops().add(new ItemStack(Items.APPLE, 1)); //nuevo dropeo
				
				
			}
		}
	}
}
