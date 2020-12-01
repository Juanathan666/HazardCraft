package Eventos;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Scanner;

import HazardCraft.HazardCraft;

public class Ver_fechas_eventos {

	public static int IHalloween;
	public static int AHalloween;
	public static int MesHalloween;
	
	public static int INavidad;
	public static int ANavidad;
	public static int MesNavidad;
	
	public static int IVerano;
	public static int AVerano;
	public static int MesVerano;
	
	public static int ano;
	public static String URL = "https://www.dropbox.com/s/39u9724yryb0uok/Hazardcraft-eventos-dias.txt?raw=1";

	public static void VerFechasEventos()
	{
		new Thread("VerFechaEventos")
		{
			
			public void run()
			{
				try 
				{
					URL url = new URL(URL);
					Scanner scanner = new Scanner(url.openStream());
					String hueco1 = scanner.nextLine();
					String hueco2 = scanner.nextLine();
					
					String IHalloween = scanner.nextLine();
					String AHalloween = scanner.nextLine();
					String MesHalloween = scanner.nextLine();
					
					String hueco3 = scanner.nextLine();

					String INavidad = scanner.nextLine();
					String ANavidad = scanner.nextLine();
					String MesNavidad = scanner.nextLine();
					
					String hueco4 = scanner.nextLine();
					
					String IVerano = scanner.nextLine();
					String AVerano = scanner.nextLine();
					String MesVerano = scanner.nextLine();
					
					Ver_fechas_eventos.IHalloween = Integer.parseInt(IHalloween);
					Ver_fechas_eventos.AHalloween = Integer.parseInt(AHalloween);
					Ver_fechas_eventos.MesHalloween = Integer.parseInt(MesHalloween);
					
					Ver_fechas_eventos.INavidad = Integer.parseInt(INavidad);
					Ver_fechas_eventos.ANavidad = Integer.parseInt(ANavidad);
					Ver_fechas_eventos.MesNavidad = Integer.parseInt(MesNavidad);
					
					Ver_fechas_eventos.IVerano = Integer.parseInt(IVerano);
					Ver_fechas_eventos.AVerano = Integer.parseInt(AVerano);
					Ver_fechas_eventos.MesVerano = Integer.parseInt(MesVerano);
					scanner.close();
					iniciar();
				} 
				
				catch (MalformedURLException e) 
				{
					HazardCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e);
				} 
				
				catch (IOException e1) 
				{
					HazardCraft.logger.info("No se ha podido verificar la fecha del evento error:" + e1);
				}
			}
			
		}
		
		.start();
	}
	
	
	public static void iniciar() 
	{
			Calendar calendar = Calendar.getInstance();
			
			//Testear Verano
	    	if(calendar.get(2) + 1 == MesVerano && calendar.get(5) >= IVerano && calendar.get(5) <= AVerano)
	    	{
	    		Eventos_Principal.Verano = true;
	    	}

     
			//Testear Navidad
		    if (calendar.get(2) + 1 == MesNavidad && calendar.get(5) >= INavidad && calendar.get(5) <= ANavidad)
		    {
		    	Eventos_Principal.Navidad = true;
		    } 
		     
		    	//Testear Hallowen
		    	
		    if(calendar.get(2) + 1 == MesHalloween && calendar.get(5) >= IHalloween && calendar.get(5) <= AHalloween)
		    {
		    	Eventos_Principal.Halloween = true;
		    } 
	}
	
}
