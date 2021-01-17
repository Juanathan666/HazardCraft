package HazardCraft.Items.Comida;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Registro_Comidas;

public class bol_fresas_azucar extends Registro_Comidas {

	public bol_fresas_azucar(int amount, float saturation, boolean isWolfFood, String name) 
	{
		super(amount, saturation, isWolfFood, name);

		setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
	}
}
