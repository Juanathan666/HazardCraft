package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.fragmento_de_netherita;
import HazardCraft.Items.lingote_de_netherita;
import HazardCraft.Items.madera_item;
import HazardCraft.Items.varita_de_caida_lenta;
import HazardCraft.Items.varita_de_explosiones;
import HazardCraft.Items.varita_de_fuego;
import HazardCraft.Items.varita_de_fuerza;
import HazardCraft.Items.varita_de_rayos;
import HazardCraft.Items.varita_de_regeneracion;
import net.minecraft.item.Item;

public class Items 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MADERA_ITEM = new madera_item ("madera_item");
	
	//Actualizacion del nether (Vanilla 1.16)
	public static final Item FRAGMENTO_DE_NETHERITA = new fragmento_de_netherita ("fragmento_de_netherita");
	public static final Item LINGOTE_DE_NETHERITA = new lingote_de_netherita ("lingote_de_netherita");
	public static final Item VARITA_DE_RAYOS = new varita_de_rayos("varita_de_rayos");
	public static final Item VARITA_DE_CAIDA_LENTA = new varita_de_caida_lenta("varita_de_caida_lenta");
	public static final Item VARITA_DE_EXPLOSIONES = new varita_de_explosiones("varita_de_explosiones");
	public static final Item VARITA_DE_FUEGO = new varita_de_fuego("varita_de_fuego");
	public static final Item VARITA_DE_REGENERACION = new varita_de_regeneracion("varita_de_regeneracion");
	public static final Item VARITA_DE_FUERZA = new varita_de_fuerza("varita_de_fuerza");



}
