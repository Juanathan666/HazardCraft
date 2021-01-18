package HazardCraft.Items.Comida;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Registro_Comidas;

public class bocadillo_ternera extends Registro_Comidas {

	public bocadillo_ternera(int amount, float saturation, boolean isWolfFood, String name) 
	{
		super(amount, saturation, isWolfFood, name);

		setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
	}
}
