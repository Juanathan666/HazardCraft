package Eventos;

import HazardCraft.HazardCraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

public class Eventos_Principal {

	public static boolean Navidad = false;
	public static boolean Halloween = false;
	public static boolean Verano = false;
	
	private static final CreativeTabs Tab_evento = HazardCraft.EventosTab;
	
	public static void eventos_preinit() 
	{
		Ver_fechas_eventos.VerFechasEventos();
		MinecraftForge.EVENT_BUS.register(new EventHandler_eventos());
	}
	
	public static void eventos_init() {
	}
	
	public static void eventos_post_init() {
		if(Navidad) 
		{
		}
	}
	
}
