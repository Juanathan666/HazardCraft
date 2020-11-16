package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class mena_de_enderita extends BlockBase {

	public mena_de_enderita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(7.0F);
		setResistance(7.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.STONE);
	}

}
