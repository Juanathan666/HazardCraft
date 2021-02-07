package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Maderas.OverWorld.hojas_de_caoba;
import HazardCraft.Bloques.Maderas.OverWorld.madera_de_caoba;
import HazardCraft.Bloques.Maderas.OverWorld.tronco_de_caoba;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_Arboles
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block HOJAS_DE_CAOBA = new hojas_de_caoba("hojas_de_caoba", Material.LEAVES);
	public static final Block TRONCO_DE_CAOBA = new tronco_de_caoba("tronco_de_caoba", Material.WOOD);
	public static final Block MADERA_DE_CAOBA = new madera_de_caoba("madera_de_caoba", Material.WOOD);
}
