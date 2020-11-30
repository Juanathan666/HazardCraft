package HazardCraft.Iniciar;

import HazardCraft.Bloques.Registrar.Bloques_Nether_Menas;
import HazardCraft.Items.Registrar.Items_End;
import HazardCraft.Items.Registrar.Items_Nether;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos_Hornos {

	public static void iniciar() {
		
		GameRegistry.addSmelting(Bloques_Nether_Menas.ESCOMBROS_ANCESTRALES, new ItemStack(Items_Nether.FRAGMENTO_DE_NETHERITA, 1), 10.0F);
		GameRegistry.addSmelting(Items_End.FRAGMENTO_DE_ENDERITA, new ItemStack(Items_End.LINGOTE_DE_ENDERITA, 1), 10.0F);
		
	}
	
}
