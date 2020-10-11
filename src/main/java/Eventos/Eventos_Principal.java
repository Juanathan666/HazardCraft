package Eventos;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Bloques;
import HazardCraft.Iniciar.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class Eventos_Principal {

	public static boolean Navidad = false;
	public static boolean Halloween = false;
	public static boolean Verano = false;
	
	public static void eventos_preinit() {
		
		
		Ver_fechas_eventos.VerFechasEventos();
		MinecraftForge.EVENT_BUS.register(new EventHandler_eventos());

		
	}
	
	public static void eventos_init() {
		
		
	}
	
	public static void eventos_post_init() {
		if(Navidad) {
			
		}

	}
	
}
