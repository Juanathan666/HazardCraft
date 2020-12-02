package HazardCraft.Crafteos.Horno.End;

import HazardCraft.Bloques.Registrar.Bloques_End_Menas;
import HazardCraft.Items.Registrar.Items_End;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos_Horno_End 
{
	public static void Iniciar() 
	{
		//Bloques
		
		GameRegistry.addSmelting(Bloques_End_Menas.MENA_DE_ENDERITA, new ItemStack(Items_End.FRAGMENTO_DE_ENDERITA, 1), 10.0F);
		
		//Lingotes
		
		
		
		//Gemas
	}
}
