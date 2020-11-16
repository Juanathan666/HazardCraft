package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.bloque_de_enderita;
import HazardCraft.Bloques.bloque_de_marmol_blanco;
import HazardCraft.Bloques.bloque_de_marmol_negro;
import HazardCraft.Bloques.bloque_de_marmol_rojo;
import HazardCraft.Bloques.bloque_de_marmol_verde;
import HazardCraft.Bloques.bloque_de_netherita;
import HazardCraft.Bloques.escombros_ancestrales;
import HazardCraft.Bloques.ladrillos_de_marmol_blanco;
import HazardCraft.Bloques.ladrillos_de_marmol_negro;
import HazardCraft.Bloques.ladrillos_de_marmol_rojo;
import HazardCraft.Bloques.ladrillos_de_marmol_verde;
import HazardCraft.Bloques.mena_de_cobre;
import HazardCraft.Bloques.mena_de_enderita;
import HazardCraft.Bloques.mena_de_estano;
import HazardCraft.Bloques.mena_de_marmol_blanco;
import HazardCraft.Bloques.mena_de_marmol_negro;
import HazardCraft.Bloques.mena_de_marmol_rojo;
import HazardCraft.Bloques.mena_de_marmol_verde;
import HazardCraft.Bloques.mena_de_zafiro;
import HazardCraft.Bloques.pilar_de_marmol_blanco;
import HazardCraft.Bloques.pilar_de_marmol_blanco_inferior;
import HazardCraft.Bloques.pilar_de_marmol_blanco_superior;
import HazardCraft.Bloques.pilar_de_marmol_negro;
import HazardCraft.Bloques.pilar_de_marmol_negro_inferior;
import HazardCraft.Bloques.pilar_de_marmol_negro_superior;
import HazardCraft.Bloques.pilar_de_marmol_rojo;
import HazardCraft.Bloques.pilar_de_marmol_rojo_inferior;
import HazardCraft.Bloques.pilar_de_marmol_rojo_superior;
import HazardCraft.Bloques.pilar_de_marmol_verde;
import HazardCraft.Bloques.pilar_de_marmol_verde_inferior;
import HazardCraft.Bloques.pilar_de_marmol_verde_superior;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOQUE_DE_MARMOL_BLANCO = new bloque_de_marmol_blanco("bloque_de_marmol_blanco", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_NEGRO = new bloque_de_marmol_negro("bloque_de_marmol_negro", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_VERDE = new bloque_de_marmol_verde("bloque_de_marmol_verde", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_ROJO = new bloque_de_marmol_rojo("bloque_de_marmol_rojo", Material.ROCK);
	
	public static final Block MENA_DE_MARMOL_BLANCO = new mena_de_marmol_blanco("mena_de_marmol_blanco", Material.ROCK);
	public static final Block MENA_DE_MARMOL_NEGRO = new mena_de_marmol_negro("mena_de_marmol_negro", Material.ROCK);
	public static final Block MENA_DE_MARMOL_VERDE = new mena_de_marmol_verde("mena_de_marmol_verde", Material.ROCK);
	public static final Block MENA_DE_MARMOL_ROJO = new mena_de_marmol_rojo("mena_de_marmol_rojo", Material.ROCK);
	
	public static final Block LADRILLOS_DE_MARMOL_BLANCO = new ladrillos_de_marmol_blanco("ladrillos_de_marmol_blanco", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_NEGRO = new ladrillos_de_marmol_negro("ladrillos_de_marmol_negro", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_VERDE = new ladrillos_de_marmol_verde("ladrillos_de_marmol_verde", Material.ROCK);
	public static final Block LADRILLOS_DE_MARMOL_ROJO = new ladrillos_de_marmol_rojo("ladrillos_de_marmol_rojo", Material.ROCK);
	
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
	
	public static final Block MENA_DE_COBRE = new mena_de_cobre("mena_de_cobre", Material.ROCK);
	public static final Block MENA_DE_ZAFIRO = new mena_de_zafiro("mena_de_zafiro", Material.ROCK);
	public static final Block MENA_DE_ESTANO = new mena_de_estano("mena_de_estano", Material.ROCK);

	//Actualizacion del nether (Vanilla 1.16)
	public static final Block ESCOMBROS_ANCESTRALES = new escombros_ancestrales("escombros_ancestrales", Material.ROCK);
	public static final Block BLOQUE_DE_NETHERITA = new bloque_de_netherita("bloque_de_netherita", Material.ROCK);
	
	//Enderita
	public static final Block MENA_DE_ENDERITA = new mena_de_enderita("mena_de_enderita", Material.ROCK);
	public static final Block BLOQUE_DE_ENDERITA = new bloque_de_enderita("bloque_de_enderita", Material.IRON);

    
}
