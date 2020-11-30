package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.Minerales.End.fragmento_de_enderita;
import HazardCraft.Items.Minerales.End.lingote_de_enderita;
import net.minecraft.item.Item;

public class Items_End 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item FRAGMENTO_DE_ENDERITA = new fragmento_de_enderita("fragmento_de_enderita");
	public static final Item LINGOTE_DE_ENDERITA = new lingote_de_enderita("lingote_de_enderita");

}
