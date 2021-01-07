package HazardCraft.Items.Cultivos;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Registro_Comidas;

public class fresa extends Registro_Comidas {

	public fresa(int amount, float saturation, boolean isWolfFood, String name) {
		super(amount, saturation, isWolfFood, name);
		this.setCreativeTab(HazardCraft.HazardCraftTab_Cultivos);
	}

	

}
