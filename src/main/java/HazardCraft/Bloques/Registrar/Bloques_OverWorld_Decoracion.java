package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Decorativos.OverWorld.Bloques_irrompibles;
import HazardCraft.Bloques.Decorativos.OverWorld.bloque_de_marmol_blanco;
import HazardCraft.Bloques.Decorativos.OverWorld.bloque_de_marmol_negro;
import HazardCraft.Bloques.Decorativos.OverWorld.bloque_de_marmol_rojo;
import HazardCraft.Bloques.Decorativos.OverWorld.bloque_de_marmol_verde;
import HazardCraft.Bloques.Decorativos.OverWorld.ladrillos_de_marmol_blanco;
import HazardCraft.Bloques.Decorativos.OverWorld.ladrillos_de_marmol_negro;
import HazardCraft.Bloques.Decorativos.OverWorld.ladrillos_de_marmol_rojo;
import HazardCraft.Bloques.Decorativos.OverWorld.ladrillos_de_marmol_verde;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_blanco;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_blanco_inferior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_blanco_superior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_negro;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_negro_inferior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_negro_superior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_rojo;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_rojo_inferior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_rojo_superior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_verde;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_verde_inferior;
import HazardCraft.Bloques.Decorativos.OverWorld.pilar_de_marmol_verde_superior;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_OverWorld_Decoracion
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Bloques
	
	public static final Block BLOQUE_DE_MARMOL_BLANCO = new bloque_de_marmol_blanco("bloque_de_marmol_blanco", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_NEGRO = new bloque_de_marmol_negro("bloque_de_marmol_negro", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_VERDE = new bloque_de_marmol_verde("bloque_de_marmol_verde", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_ROJO = new bloque_de_marmol_rojo("bloque_de_marmol_rojo", Material.ROCK);
	
	//Ladrillos
	
	public static final Block LADRILLOS_DE_MARMOL_BLANCO = new ladrillos_de_marmol_blanco("ladrillos_de_marmol_blanco", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_NEGRO = new ladrillos_de_marmol_negro("ladrillos_de_marmol_negro", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_VERDE = new ladrillos_de_marmol_verde("ladrillos_de_marmol_verde", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_ROJO = new ladrillos_de_marmol_rojo("ladrillos_de_marmol_rojo", Material.ROCK);
	
	//Pilares
	
	public static Block PILAR_DE_MARMOL_BLANCO = new pilar_de_marmol_blanco("pilar_de_marmol_blanco", Material.ROCK);
	public static Block PILAR_DE_MARMOL_BLANCO_INFERIOR = new pilar_de_marmol_blanco_inferior("pilar_de_marmol_blanco_inferior", Material.ROCK);
	public static Block PILAR_DE_MARMOL_BLANCO_SUPERIOR = new pilar_de_marmol_blanco_superior("pilar_de_marmol_blanco_superior", Material.ROCK);
	
	public static Block PILAR_DE_MARMOL_VERDE = new pilar_de_marmol_verde("pilar_de_marmol_verde", Material.ROCK);
	public static Block PILAR_DE_MARMOL_VERDE_INFERIOR = new pilar_de_marmol_verde_inferior("pilar_de_marmol_verde_inferior", Material.ROCK);
	public static Block PILAR_DE_MARMOL_VERDE_SUPERIOR = new pilar_de_marmol_verde_superior("pilar_de_marmol_verde_superior", Material.ROCK);
	
	public static Block PILAR_DE_MARMOL_NEGRO = new pilar_de_marmol_negro("pilar_de_marmol_negro", Material.ROCK);
	public static Block PILAR_DE_MARMOL_NEGRO_INFERIOR = new pilar_de_marmol_negro_inferior("pilar_de_marmol_negro_inferior", Material.ROCK);
	public static Block PILAR_DE_MARMOL_NEGRO_SUPERIOR = new pilar_de_marmol_negro_superior("pilar_de_marmol_negro_superior", Material.ROCK);
	
	public static Block PILAR_DE_MARMOL_ROJO = new pilar_de_marmol_rojo("pilar_de_marmol_rojo", Material.ROCK);
	public static Block PILAR_DE_MARMOL_ROJO_INFERIOR = new pilar_de_marmol_rojo_inferior("pilar_de_marmol_rojo_inferior", Material.ROCK);
	public static Block PILAR_DE_MARMOL_ROJO_SUPERIOR = new pilar_de_marmol_rojo_superior("pilar_de_marmol_rojo_superior", Material.ROCK);
	
	//Slab
	
	//Escaleras
	
	
	//Dungeons
	
	public static Block LADRILLO_DE_PIEDRA_IRROMPIBLE = new Bloques_irrompibles("ladrillo_de_piedra_irrompible", Material.BARRIER);
	public static Block LADRILLO_DE_PIEDRA_AGRIETADO_IRROMPIBLE = new Bloques_irrompibles("ladrillo_de_piedra_agrietado_irrompible", Material.BARRIER);
	public static Block LADRILLO_DE_PIEDRA_CINCELADO_IRROMPIBLE = new Bloques_irrompibles("ladrillo_de_piedra_cincelado_irrompible", Material.BARRIER);
	public static Block LADRILLO_DE_PIEDRA_MUSGOSA_IRROMPIBLE = new Bloques_irrompibles("ladrillo_de_piedra_musgosa_irrompible", Material.BARRIER);
	public static Block PIEDRA_IRROMPIBLE = new Bloques_irrompibles("piedra_irrompible", Material.BARRIER);
	
}
