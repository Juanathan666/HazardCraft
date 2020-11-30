package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.Minerales.Nether.fragmento_de_netherita;
import HazardCraft.Items.Minerales.Nether.lingote_de_netherita;
import net.minecraft.item.Item;

public class Items_Nether 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item FRAGMENTO_DE_NETHERITA = new fragmento_de_netherita ("fragmento_de_netherita");
	public static final Item LINGOTE_DE_NETHERITA = new lingote_de_netherita ("lingote_de_netherita");

}
