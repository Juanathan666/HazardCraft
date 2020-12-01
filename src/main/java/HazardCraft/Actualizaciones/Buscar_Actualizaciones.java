package HazardCraft.Actualizaciones;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import HazardCraft.HazardCraft;

public class Buscar_Actualizaciones {

	private static final String Actualizacion_Url = "https://www.dropbox.com/s/ilwowi3u69qa2qr/HazardCraft-updates.txt?raw=1";

	private static boolean NuevaVersion = false;
	public static boolean URLNOVALIDAERROR = false;
	
	public static void MirarActualizaciones()
	{
		new Thread("Actualizaciones")
		{
			
			public void run()
			{
				try 
				{
					URL url = new URL(Actualizacion_Url);
					Scanner scanner = new Scanner(url.openStream());
					String hueco1 = scanner.nextLine();
			        String UltimaVersion = scanner.nextLine();
					String Mensaje1 = scanner.nextLine();
					String Mensaje2 = scanner.nextLine();
					String Mensaje3 = scanner.nextLine();
					scanner.close();
					
					if(!HazardCraft.VERSION.equals(UltimaVersion) && !URLNOVALIDAERROR)
					{
						HazardCraft.logger.info("============================================================");
						HazardCraft.logger.info(UltimaVersion + " Esta es la Ultima Version de HazardCraft Disponible");
					
						if(!Mensaje1.equals(""))
						{
							HazardCraft.logger.info(Mensaje1);
						
						TestearActualizaciones.Mensaje1 = Mensaje1;
						}
						
						if(!Mensaje2.equals(""))
						{
							HazardCraft.logger.info(Mensaje2);
							
							TestearActualizaciones.Mensaje2 = Mensaje2;
						}
						
						else
						{
							TestearActualizaciones.Mensaje2a = false;
						}	
						
						if(!Mensaje3.equals(""))
						{
							HazardCraft.logger.info(Mensaje3);
							
							TestearActualizaciones.Mensaje3 = Mensaje3;
							HazardCraft.logger.info("============================================================");
						}
						
						else
						{
							TestearActualizaciones.Mensaje3a = false;
						}
						
						if(Mensaje1.equals("") && Mensaje2.equals("") && Mensaje3.equals(""))
						{			
							HazardCraft.logger.info("No hay cambios en actualizacion");
							
							TestearActualizaciones.Mensaje1 = "No hay Cambios en actualizacion";
							HazardCraft.logger.info("============================================================");
						}
						
						TestearActualizaciones.UltimaVersion = UltimaVersion;
						FijarNuevaVersion();
					}
				} 
				
				catch (MalformedURLException e) 
				{
					URLNOVALIDAERROR = true;
				} 
				
				catch (IOException e) 
				{
					HazardCraft.logger.info("Error al buscar actualizaciones: " + e);
					URLNOVALIDAERROR = true;
				}
			}
		}
		
		.start();
	}
	
	public static synchronized void FijarNuevaVersion(){
		NuevaVersion = true;
	}
	
	public static synchronized boolean HayNuevaVersion(){
		return NuevaVersion;
	}
	
	}
