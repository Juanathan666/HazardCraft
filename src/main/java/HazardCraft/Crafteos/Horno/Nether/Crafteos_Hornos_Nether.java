package HazardCraft.Crafteos.Horno.Nether;

import HazardCraft.Bloques.Registrar.Bloques_Nether_Menas;
import HazardCraft.Items.Registrar.Items_Nether;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos_Hornos_Nether 
{
	public static void Iniciar() 
	{
		//Bloques
		
		GameRegistry.addSmelting(Bloques_Nether_Menas.ESCOMBROS_ANCESTRALES, new ItemStack(Items_Nether.FRAGMENTO_DE_NETHERITA, 1), 10.0F);
		
		//Lingotes
		
		
		//Gemas
	}
}
