package HazardCraft.Items.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Items.Magia.Varitas.varita_de_caida_lenta_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_caida_lenta_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_caida_lenta_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_caida_lenta_principiante;
import HazardCraft.Items.Magia.Varitas.varita_de_explosiones_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_explosiones_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_explosiones_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_explosiones_principiante;
import HazardCraft.Items.Magia.Varitas.varita_de_fuego_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_fuego_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_fuego_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_fuego_principiante;
import HazardCraft.Items.Magia.Varitas.varita_de_fuerza_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_fuerza_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_fuerza_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_fuerza_principiante;
import HazardCraft.Items.Magia.Varitas.varita_de_rayos_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_rayos_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_rayos_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_rayos_principiante;
import HazardCraft.Items.Magia.Varitas.varita_de_regeneracion_basica;
import HazardCraft.Items.Magia.Varitas.varita_de_regeneracion_experto;
import HazardCraft.Items.Magia.Varitas.varita_de_regeneracion_maestro;
import HazardCraft.Items.Magia.Varitas.varita_de_regeneracion_principiante;
import HazardCraft.Items.Magia.Varitas.varita_sin_poder;
import net.minecraft.item.Item;

public class Items_Magia_Varitas 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item VARITA_SIN_PODER = new varita_sin_poder("varita_sin_poder");

	public static final Item VARITA_DE_EXPLOSIONES_BASICA = new varita_de_explosiones_basica("varita_de_explosiones_basica");
	public static final Item VARITA_DE_EXPLOSIONES_PRINCIPIANTE = new varita_de_explosiones_principiante("varita_de_explosiones_principiante");
	public static final Item VARITA_DE_EXPLOSIONES_EXPERTO = new varita_de_explosiones_experto("varita_de_explosiones_experto");
	public static final Item VARITA_DE_EXPLOSIONES_MAESTRO = new varita_de_explosiones_maestro("varita_de_explosiones_maestro");

	public static final Item VARITA_DE_REGENERACION_BASICA = new varita_de_regeneracion_basica("varita_de_regeneracion_basica");
	public static final Item VARITA_DE_REGENERACION_PRINCIPIANTE = new varita_de_regeneracion_principiante("varita_de_regeneracion_principiante");
	public static final Item VARITA_DE_REGENERACION_EXPERTO = new varita_de_regeneracion_experto("varita_de_regeneracion_experto");
	public static final Item VARITA_DE_REGENERACION_MAESTRO = new varita_de_regeneracion_maestro("varita_de_regeneracion_maestro");

	public static final Item VARITA_DE_RAYOS_BASICA = new varita_de_rayos_basica("varita_de_rayos_basica");
	public static final Item VARITA_DE_RAYOS_PRINCIPIANTE = new varita_de_rayos_principiante("varita_de_rayos_principiante");
	public static final Item VARITA_DE_RAYOS_EXPERTO = new varita_de_rayos_experto("varita_de_rayos_experto");
	public static final Item VARITA_DE_RAYOS_MAESTRO = new varita_de_rayos_maestro("varita_de_rayos_maestro");

	public static final Item VARITA_DE_FUERZA_BASICA = new varita_de_fuerza_basica("varita_de_fuerza_basica");
	public static final Item VARITA_DE_FUERZA_PRINCIPIANTE = new varita_de_fuerza_principiante("varita_de_fuerza_principiante");
	public static final Item VARITA_DE_FUERZA_EXPERTO = new varita_de_fuerza_experto("varita_de_fuerza_experto");
	public static final Item VARITA_DE_FUERZA_MAESTRO = new varita_de_fuerza_maestro("varita_de_fuerza_maestro");

	public static final Item VARITA_DE_FUEGO_BASICA = new varita_de_fuego_basica("varita_de_fuego_basica");
	public static final Item VARITA_DE_FUEGO_PRINCIPIANTE = new varita_de_fuego_principiante("varita_de_fuego_principiante");
	public static final Item VARITA_DE_FUEGO_EXPERTO = new varita_de_fuego_experto("varita_de_fuego_experto");
	public static final Item VARITA_DE_FUEGO_MAESTRO = new varita_de_fuego_maestro("varita_de_fuego_maestro");

	public static final Item VARITA_DE_CAIDA_LENTA_BASICA = new varita_de_caida_lenta_basica("varita_de_caida_lenta_basica");
	public static final Item VARITA_DE_CAIDA_LENTA_PRINCIPIANTE = new varita_de_caida_lenta_principiante("varita_de_caida_lenta_principiante");
	public static final Item VARITA_DE_CAIDA_LENTA_EXPERTO = new varita_de_caida_lenta_experto("varita_de_caida_lenta_experto");
	public static final Item VARITA_DE_CAIDA_LENTA_MAESTRO = new varita_de_caida_lenta_maestro("varita_de_caida_lenta_maestro");

}
