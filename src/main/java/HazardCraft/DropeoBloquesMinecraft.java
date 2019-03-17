package HazardCraft;

import java.util.Iterator;
import java.util.Map;

import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropeoBloquesMinecraft
{
	public void QuitarRecetas()
	{
		ItemStack result = null;
        Map<ItemStack, ItemStack> recipes = FurnaceRecipes.instance().getSmeltingList();
        Iterator<ItemStack> interator = recipes.keySet().iterator();

        while (interator.hasNext())
        {
            ItemStack recipe = interator.next();
            result = recipes.get(recipe);
            ItemStack stone = new ItemStack(Blocks.GLASS, 1, 0);

            if (ItemStack.areItemStacksEqual(stone, result))
            {
                interator.remove();
            }
        }
	}
	
	@SubscribeEvent
	public void yourPlayerHarvestEvent(HarvestDropsEvent event) 
	{
		if (event.getHarvester() != null) 
		{
			if (event.getState() == Blocks.STONE.getDefaultState())
			{
				event.getDrops().clear(); //limpia los dropeos del bloque
				
				event.setDropChance(1.0f); //probabilidad de dropeo
				
				event.getDrops().add(new ItemStack(Items.APPLE, 1)); //muevo dropeo
				
				event.getHarvester().addPotionEffect(new PotionEffect(Potion.getPotionById(5),2000,1)); //añade efecto de pocion al picar el bloque
				
				EntitySheep mob = new EntitySheep(event.getHarvester().world);                          //spaw de mob al picar el bloque
				mob.setPosition(event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
				event.getHarvester().world.spawnEntity(mob);
			}
			
			if (event.getState() == Blocks.SAND.getDefaultState())
			{
				event.getDrops().clear(); //limpia los dropeos del bloque
			}
		}
		
		if (event.getHarvester() == null) 
		{
			if (event.getState() == Blocks.STONE.getDefaultState())
			{
				event.getDrops().clear(); //limpia los dropeos del bloque
			}
			
			if (event.getState() == Blocks.SAND.getDefaultState())
			{
				event.getDrops().clear(); //limpia los dropeos del bloque
			}
		}
	}
}