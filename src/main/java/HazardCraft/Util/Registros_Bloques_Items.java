package HazardCraft.Util;

import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class Registros_Bloques_Items 
{
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{    	
		event.getRegistry().registerAll(Items_OverWorld.ITEMS.toArray(new Item [0]));
	
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(Bloques_OverWorld_Decoracion.BLOCKS.toArray(new Block [0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : Items_OverWorld.ITEMS)
		{
			if(item instanceof Modelos)
			{
				((Modelos)item).registerModels();
			}
		}
		
		for(Block block : Bloques_OverWorld_Decoracion.BLOCKS)
		{
			if(block instanceof Modelos)
			{
				((Modelos)block).registerModels();
			}
		}
	}
}
