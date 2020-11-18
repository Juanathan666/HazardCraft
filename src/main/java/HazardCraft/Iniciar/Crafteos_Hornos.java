package HazardCraft.Iniciar;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafteos_Hornos {

	public static void iniciar() {
		
		GameRegistry.addSmelting(Bloques.ESCOMBROS_ANCESTRALES, new ItemStack(Items.FRAGMENTO_DE_NETHERITA, 1), 10.0F);
		GameRegistry.addSmelting(Items.FRAGMENTO_DE_ENDERITA, new ItemStack(Items.LINGOTE_DE_ENDERITA, 1), 10.0F);
		
	}
	
}
