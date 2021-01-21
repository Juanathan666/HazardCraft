package HazardCraft.Bloques.Plantas.OverWorld;

import HazardCraft.Bloques.Registrar.Registro_Bloques;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class planta_de_tomate_salvaje extends Registro_Bloques
{

	public planta_de_tomate_salvaje(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.PLANT);
	}
}
