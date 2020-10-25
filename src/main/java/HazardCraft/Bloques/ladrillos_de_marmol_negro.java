package HazardCraft.Bloques;

import HazardCraft.HazardCraft;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ladrillos_de_marmol_negro extends BlockBase {

	public ladrillos_de_marmol_negro(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}
}
