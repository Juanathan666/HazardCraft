package HazardCraft.Iniciar;

import HazardCraft.Pociones.CustomPotion;
import net.minecraft.init.PotionTypes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Pociones {

	public static final Potion CAIDA_LENTA_EFECTO= new CustomPotion("caida_lenta", false, 6225862, 0, 0);
	public static final PotionType CAIDA_LENTA_POCION = new PotionType("caida_lenta", new PotionEffect[] {new PotionEffect(CAIDA_LENTA_EFECTO, 24*(60))}).setRegistryName("caida_lenta");
	
	
	public static void iniciar() {
		
		registerpotion(CAIDA_LENTA_POCION, CAIDA_LENTA_EFECTO);
		registerPotionMix();
	}
	
	
	private static void registerpotion(PotionType potion, Potion efecto) {
		ForgeRegistries.POTIONS.register(efecto);
		ForgeRegistries.POTION_TYPES.register(potion);
	}
private static void registerPotionMix() {
	PotionHelper.addMix(PotionTypes.AWKWARD, net.minecraft.init.Items.FEATHER, CAIDA_LENTA_POCION);
}
	
}
