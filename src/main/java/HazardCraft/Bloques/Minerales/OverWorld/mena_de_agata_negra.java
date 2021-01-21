package HazardCraft.Bloques.Minerales.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class mena_de_agata_negra extends Registro_Bloques 
{
	public mena_de_agata_negra(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.STONE);
	}
}
