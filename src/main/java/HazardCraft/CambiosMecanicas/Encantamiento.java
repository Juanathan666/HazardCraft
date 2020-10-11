package HazardCraft.CambiosMecanicas;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.HazardCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
@EventBusSubscriber(modid=HazardCraft.MODID)
public class Encantamiento {

	public static final List<Enchantment> ENCHATMENTS = new ArrayList<Enchantment>();
	
	public static final Enchantment Habilidad_Aquatica = new Habilidad_Aquatica();
	
	public static void iniciar() {
		
	}
}
