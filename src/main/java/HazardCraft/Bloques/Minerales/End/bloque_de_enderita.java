package HazardCraft.Bloques.Minerales.End;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_enderita extends Registro_Bloques {

	public bloque_de_enderita(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Minerales);
		setHardness(10.0F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 4);
		setSoundType(SoundType.STONE);
	}

}
