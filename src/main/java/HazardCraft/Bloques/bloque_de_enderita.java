package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_enderita extends BlockBase {

	public bloque_de_enderita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.STONE);
	}

}
