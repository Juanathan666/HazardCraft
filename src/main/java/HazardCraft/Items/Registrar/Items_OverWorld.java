package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.Comida.bocadillo_ternera;
import HazardCraft.Items.Comida.bol_fresas_azucar;
import HazardCraft.Items.Comida.fresa_con_azucar;
import HazardCraft.Items.Cultivos.fresa;
import HazardCraft.Items.Cultivos.semilla_de_fresa;
import HazardCraft.Items.Cultivos.semilla_de_tomate;
import HazardCraft.Items.Cultivos.tomate;
import HazardCraft.Items.Magia.Esencias.esencia_de_agua;
import HazardCraft.Items.Magia.Esencias.esencia_de_aire;
import HazardCraft.Items.Magia.Esencias.esencia_de_fuego;
import HazardCraft.Items.Magia.Esencias.esencia_de_tierra;
import HazardCraft.Items.Magia.Esencias.gema_imbuida_de_poder_de_agua;
import HazardCraft.Items.Magia.Esencias.gema_imbuida_de_poder_de_aire;
import HazardCraft.Items.Magia.Esencias.gema_imbuida_de_poder_de_fuego;
import HazardCraft.Items.Magia.Esencias.gema_imbuida_de_poder_de_tierra;
import HazardCraft.Items.Magia.Esencias.poder_de_agua;
import HazardCraft.Items.Magia.Esencias.poder_de_aire;
import HazardCraft.Items.Magia.Esencias.poder_de_fuego;
import HazardCraft.Items.Magia.Esencias.poder_de_tierra;
import HazardCraft.Items.Minerales.OverWorld.gema_de_zafiro;
import HazardCraft.Items.Minerales.OverWorld.lingote_de_cobre;
import HazardCraft.Items.Minerales.OverWorld.lingote_de_estano;
import HazardCraft.Items.Minerales.OverWorld.pepita_de_cobre;
import HazardCraft.Items.Minerales.OverWorld.pepita_de_estano;
import net.minecraft.item.Item;

public class Items_OverWorld 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MADERA_ITEM = new madera_item ("madera_item");

	public static final Item LINGOTE_DE_ESTANO = new lingote_de_estano ("lingote_de_estano");
	public static final Item PEPITA_DE_ESTANO = new pepita_de_estano ("pepita_de_estano");
	
	public static final Item LINGOTE_DE_COBRE = new lingote_de_cobre ("lingote_de_cobre");
	public static final Item PEPITA_DE_COBRE = new pepita_de_cobre ("pepita_de_cobre");
	

	public static final Item GEMA_DE_ZAFIRO = new gema_de_zafiro ("gema_de_zafiro");
	
	public static final Item ESENCIA_DE_TIERRA = new esencia_de_tierra ("esencia_de_tierra");
	public static final Item ESENCIA_DE_AGUA = new esencia_de_agua ("esencia_de_agua");
	public static final Item ESENCIA_DE_AIRE = new esencia_de_aire ("esencia_de_aire");
	public static final Item ESENCIA_DE_FUEGO = new esencia_de_fuego ("esencia_de_fuego");
	
	public static final Item PODER_DE_TIERRA = new poder_de_tierra ("poder_de_tierra");
	public static final Item PODER_DE_AGUA = new poder_de_agua ("poder_de_agua");
	public static final Item PODER_DE_AIRE = new poder_de_aire ("poder_de_aire");
	public static final Item PODER_DE_FUEGO = new poder_de_fuego ("poder_de_fuego");

	public static final Item GEMA_IMBUIDA_DE_PODER_DE_TIERRA = new gema_imbuida_de_poder_de_tierra ("gema_imbuida_de_poder_de_tierra");
	public static final Item GEMA_IMBUIDA_DE_PODER_DE_AGUA = new gema_imbuida_de_poder_de_agua ("gema_imbuida_de_poder_de_agua");
	public static final Item GEMA_IMBUIDA_DE_PODER_DE_AIRE = new gema_imbuida_de_poder_de_aire ("gema_imbuida_de_poder_de_aire");
	public static final Item GEMA_IMBUIDA_DE_PODER_DE_FUEGO = new gema_imbuida_de_poder_de_fuego ("gema_imbuida_de_poder_de_fuego");
	
	
	//Frutos y semillas
	
	public static final Item SEMILLA_DE_FRESA = new semilla_de_fresa(0, 0, false, "semilla_de_fresa");
	public static final Item FRESA = new fresa(2, 2, false, "fresa");
	
	public static final Item SEMILLA_DE_TOMATE = new semilla_de_tomate(0, 0, false, "semilla_de_tomate");
	public static final Item TOMATE = new tomate(2, 2, false, "tomate");
	
	
	//Comida
	
	public static final Item FRESA_CON_AZUCAR = new fresa_con_azucar(3, 5, false, "fresa_con_azucar");
	public static final Item BOL_FRESAS_AZUCAR = new bol_fresas_azucar(8, 12, false, "bol_fresas_azucar");

	public static final Item BOCADILLO_TERNERA = new bocadillo_ternera(20, 20, false, "bocadillo_ternera");

}