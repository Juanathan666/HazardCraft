package HazardCraft.Items.Registrar;

import HazardCraft.HazardCraft;
import HazardCraft.Util.Modelos;
import net.minecraft.item.ItemFood;

public class Registro_Comidas extends ItemFood implements Modelos
{
	public  Registro_Comidas(int amount, float saturation, boolean isWolfFood, String name) {
        super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		Items_OverWorld.ITEMS.add(this);
		Items_Nether.ITEMS.add(this);
		Items_End.ITEMS.add(this);
		Items_Magia_Varitas.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		HazardCraft.Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
