package HazardCraft.CambiosMecanicas;

import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Registrar_encantamiento {

	@SubscribeEvent
	public void registrar_encantamientos(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(Encantamiento.ENCHATMENTS.toArray(new Enchantment[0]));
	}
	
}
