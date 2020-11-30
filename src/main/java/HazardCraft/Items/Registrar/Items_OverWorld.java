package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.Minerales.OverWorld.gema_de_zafiro;
import HazardCraft.Items.Minerales.OverWorld.lingote_de_cobre;
import HazardCraft.Items.Minerales.OverWorld.lingote_de_estano;
import net.minecraft.item.Item;

public class Items_OverWorld 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MADERA_ITEM = new madera_item ("madera_item");
	
	public static final Item LINGOTE_DE_COBRE = new lingote_de_cobre ("lingote_de_cobre");
	public static final Item LINGOTE_DE_ESTANO = new lingote_de_estano ("lingote_de_estano");
	

	public static final Item GEMA_DE_ZAFIRO = new gema_de_zafiro ("gema_de_zafiro");
}
