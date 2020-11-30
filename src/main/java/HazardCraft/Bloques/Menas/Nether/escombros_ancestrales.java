package HazardCraft.Bloques.Menas.Nether;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class escombros_ancestrales extends Registro_Bloques {

	public escombros_ancestrales(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 3);
		setSoundType(SoundType.STONE);
	}

}
