package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.fragmento_de_netherita;
import HazardCraft.Items.lingote_de_netherita;
import HazardCraft.Items.madera_item;
import net.minecraft.item.Item;

public class Items 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MADERA_ITEM = new madera_item ("madera_item");
	
	//Actualizacion del nether (Vanilla 1.16)
	public static final Item FRAGMENTO_DE_NETHERITA = new fragmento_de_netherita ("fragmento_de_netherita");
	public static final Item LINGOTE_DE_NETHERITA = new lingote_de_netherita ("lingote_de_netherita");


}
