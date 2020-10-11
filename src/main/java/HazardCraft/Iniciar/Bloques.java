package HazardCraft.Iniciar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.madera;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Bloques
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block MADERA = new madera("madera", Material.WOOD);
}
