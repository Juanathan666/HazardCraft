package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Menas.End.mena_de_enderita;
import HazardCraft.Bloques.Minerales.End.bloque_de_enderita;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_End_Menas 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
    public static final Block MENA_DE_ENDERITA = new mena_de_enderita("mena_de_enderita", Material.ROCK);
	public static final Block BLOQUE_DE_ENDERITA = new bloque_de_enderita("bloque_de_enderita", Material.IRON);

}
