package HazardCraft.Items;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import HazardCraft.Util.Modelos;
import net.minecraft.item.Item;

public class ItemBase extends Item implements Modelos
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	
		
			setCreativeTab(HazardCraft.HazardCraftTab);
		
		
		Items.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		HazardCraft.Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
