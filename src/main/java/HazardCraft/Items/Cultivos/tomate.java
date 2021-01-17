package HazardCraft.Items.Cultivos;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Registro_Comidas;

public class tomate extends Registro_Comidas {

	public tomate(int amount, float saturation, boolean isWolfFood, String name) 
	{
		super(amount, saturation, isWolfFood, name);

		setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
	}
}
