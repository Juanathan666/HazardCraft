package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.bloque_de_marmol_blanco;
import HazardCraft.Bloques.bloque_de_marmol_negro;
import HazardCraft.Bloques.bloque_de_marmol_rojo;
import HazardCraft.Bloques.bloque_de_marmol_verde;
import HazardCraft.Bloques.madera;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Bloques
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block MADERA = new madera("madera", Material.WOOD);
	public static final Block BLOQUE_DE_MARMOL_BLANCO = new bloque_de_marmol_blanco("bloque_de_marmol_blanco", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_NEGRO = new bloque_de_marmol_negro("bloque_de_marmol_negro", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_VERDE = new bloque_de_marmol_verde("bloque_de_marmol_verde", Material.ROCK);
	public static final Block BLOQUE_DE_MARMOL_ROJO = new bloque_de_marmol_rojo("bloque_de_marmol_rojo", Material.ROCK);
	

}
