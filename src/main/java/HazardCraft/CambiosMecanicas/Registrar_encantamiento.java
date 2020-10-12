package HazardCraft.CambiosMecanicas;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Registrar_encantamiento {

	@SubscribeEvent
	public void registrar_encantamientos(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(Encantamiento.ENCHATMENTS.toArray(new Enchantment[0]));
	
		

	}
	
}
