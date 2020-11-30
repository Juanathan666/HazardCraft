package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Menas.Nether.escombros_ancestrales;
import HazardCraft.Bloques.Minerales.Nether.bloque_de_netherita;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_Nether_Menas 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ESCOMBROS_ANCESTRALES = new escombros_ancestrales("escombros_ancestrales", Material.ROCK);
	public static final Block BLOQUE_DE_NETHERITA = new bloque_de_netherita("bloque_de_netherita", Material.ROCK);

}
