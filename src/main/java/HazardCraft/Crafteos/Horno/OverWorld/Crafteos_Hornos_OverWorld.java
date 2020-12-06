package HazardCraft.Crafteos.Horno.OverWorld;

import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Menas;
import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos_Hornos_OverWorld 
{
	public static void Iniciar() 
	{
		//Bloques
		
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_MARMOL_BLANCO, new ItemStack(Bloques_OverWorld_Decoracion.BLOQUE_DE_MARMOL_BLANCO, 1), 10.0F);
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_MARMOL_VERDE, new ItemStack(Bloques_OverWorld_Decoracion.BLOQUE_DE_MARMOL_VERDE, 1), 10.0F);
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_MARMOL_ROJO, new ItemStack(Bloques_OverWorld_Decoracion.BLOQUE_DE_MARMOL_ROJO, 1), 10.0F);
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_MARMOL_NEGRO, new ItemStack(Bloques_OverWorld_Decoracion.BLOQUE_DE_MARMOL_NEGRO, 1), 10.0F);
		
		//Lingotes
		
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_COBRE, new ItemStack(Items_OverWorld.LINGOTE_DE_COBRE, 1), 10.0F);
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_ESTANO, new ItemStack(Items_OverWorld.LINGOTE_DE_ESTANO, 1), 10.0F);
		
		//Gemas
		
		GameRegistry.addSmelting(Bloques_OverWorld_Menas.MENA_DE_ZAFIRO, new ItemStack(Items_OverWorld.GEMA_DE_ZAFIRO, 1), 10.0F);
	}
}
