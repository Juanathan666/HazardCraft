package HazardCraft.Bloques.Maderas.OverWorld;

import HazardCraft.HazardCraft;
import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class hojas_de_caoba extends Registro_Bloques 
{

	public hojas_de_caoba(String name, Material material) 
	{
		super(name, material);
	
		setCreativeTab(HazardCraft.HazardCraftTab_Bloques);
		setHardness(5.0F);
		setResistance(5.0F);
		setHarvestLevel("axe", 1);
		setSoundType(SoundType.WOOD);
	}
}
