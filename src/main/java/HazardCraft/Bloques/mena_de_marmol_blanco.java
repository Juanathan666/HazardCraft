package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class mena_de_marmol_blanco extends BlockBase {

	public mena_de_marmol_blanco(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}

}
