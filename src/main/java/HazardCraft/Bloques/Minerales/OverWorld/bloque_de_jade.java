package HazardCraft.Bloques.Minerales.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_jade extends Registro_Bloques {

	public bloque_de_jade(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.METAL);
	}
}
