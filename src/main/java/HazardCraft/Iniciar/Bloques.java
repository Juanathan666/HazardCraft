package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.madera;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MADERA = new madera("madera", Material.WOOD);
}
