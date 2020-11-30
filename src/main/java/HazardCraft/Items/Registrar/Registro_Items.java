package HazardCraft.Items.Registrar;

import HazardCraft.HazardCraft;
import HazardCraft.Util.Modelos;
import net.minecraft.item.Item;

public class Registro_Items extends Item implements Modelos
{
	public Registro_Items(String name)
	{
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
