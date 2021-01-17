package HazardCraft.Bloques.Registrar;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Plantas.OverWorld.planta_de_fresa;
import HazardCraft.Bloques.Plantas.OverWorld.planta_de_tomate;
import net.minecraft.block.Block;

public class Bloques_Overworld_Plantas {

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block PLANTA_DE_FRESA = new planta_de_fresa("planta_de_fresa");
	public static final Block PLANTA_DE_TOMATE = new planta_de_tomate("planta_de_tomate");

	
}
