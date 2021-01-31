package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Maderas.OverWorld.hojas_de_caoba;
import HazardCraft.Bloques.Menas.Nether.escombros_ancestrales;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_Arboles
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	public static final Block HOJAS_DE_CAOBA = new hojas_de_caoba("hojas_de_caoba", Material.LEAVES);
}
