package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Menas.OverWorld.mena_de_cobre;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_estano;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_marmol_blanco;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_marmol_negro;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_marmol_rojo;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_marmol_verde;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_xp;
import HazardCraft.Bloques.Menas.OverWorld.mena_de_zafiro;
import HazardCraft.Bloques.Minerales.OverWorld.bloque_de_cobre;
import HazardCraft.Bloques.Minerales.OverWorld.bloque_de_estano;
import HazardCraft.Bloques.Minerales.OverWorld.bloque_de_zafiro;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_OverWorld_Menas 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Menas materiales normales
	
	public static final Block MENA_DE_MARMOL_BLANCO = new mena_de_marmol_blanco("mena_de_marmol_blanco", Material.ROCK);
	public static final Block MENA_DE_MARMOL_NEGRO = new mena_de_marmol_negro("mena_de_marmol_negro", Material.ROCK);
	public static final Block MENA_DE_MARMOL_VERDE = new mena_de_marmol_verde("mena_de_marmol_verde", Material.ROCK);
	public static final Block MENA_DE_MARMOL_ROJO = new mena_de_marmol_rojo("mena_de_marmol_rojo", Material.ROCK);
	
	//Menas minerales
	
	public static final Block MENA_DE_COBRE = new mena_de_cobre("mena_de_cobre", Material.ROCK);
	public static final Block BLOQUE_DE_COBRE = new bloque_de_cobre("bloque_de_cobre", Material.IRON);
	
	public static final Block MENA_DE_ZAFIRO = new mena_de_zafiro("mena_de_zafiro", Material.ROCK);
	public static final Block BLOQUE_DE_ZAFIRO = new bloque_de_zafiro("bloque_de_zafiro", Material.IRON);
	
	public static final Block MENA_DE_ESTANO = new mena_de_estano("mena_de_estano", Material.ROCK);
	public static final Block BLOQUE_DE_ESTANO = new bloque_de_estano("bloque_de_estano", Material.IRON);
	
    public static final Block MENA_DE_XP = new mena_de_xp("mena_de_xp",Material.ROCK);
}
