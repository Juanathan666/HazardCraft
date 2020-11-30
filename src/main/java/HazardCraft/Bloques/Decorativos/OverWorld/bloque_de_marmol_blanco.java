package HazardCraft.Bloques.Decorativos.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class bloque_de_marmol_blanco extends Registro_Bloques{

	public bloque_de_marmol_blanco(String name, Material material) {
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("pickaxe", 2);
		setSoundType(SoundType.STONE);
	}

}
