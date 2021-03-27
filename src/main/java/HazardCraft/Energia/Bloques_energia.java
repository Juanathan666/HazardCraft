package HazardCraft.Energia;

import java.util.ArrayList;
import java.util.List;

import HazardCraft.Bloques.Menas.OverWorld.mena_de_xp;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Bloques_energia {

	public static final List<Block> BLOCKS_ENERGY = new ArrayList<Block>();
	
    //public static final Block CONDENSADOR = new condensador();
    public static final Block Generador_de_Carbon = new Generador_de_Carbon("generador_de_carbon",Material.ROCK);
	
}
