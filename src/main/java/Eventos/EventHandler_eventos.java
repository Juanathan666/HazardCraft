package Eventos;

import HazardCraft.HazardCraft;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class EventHandler_eventos {

	private static boolean iniciado = false;
	
	@SubscribeEvent
	public void onplayertickevent(PlayerTickEvent event) 
	{
		if(Eventos_Principal.Navidad) 
		{
			if(!iniciado) 
			{
				iniciado = true;
				event.player.sendMessage(new TextComponentTranslation(HazardCraft.nombre_mensajes + " es Navidad prueba xd"));
			}
		}
	}
}
