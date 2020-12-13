package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

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
}
