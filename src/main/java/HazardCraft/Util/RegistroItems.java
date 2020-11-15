package HazardCraft.Util;

import HazardCraft.Iniciar.Bloques;
import HazardCraft.Iniciar.Items;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistroItems 
{
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{    	
		event.getRegistry().registerAll(Items.ITEMS.toArray(new Item [0]));
	
		
		
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(Bloques.BLOCKS.toArray(new Block [0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : Items.ITEMS)
		{
			if(item instanceof Modelos)
			{
				((Modelos)item).registerModels();
			}
		}
		
		for(Block block : Bloques.BLOCKS)
		{
			if(block instanceof Modelos)
			{
				((Modelos)block).registerModels();
			}
		}
	}
}
