package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import net.minecraft.item.ItemPickaxe;

public class Herramientas_Pico_Base extends ItemPickaxe implements Modelos
{
	public Herramientas_Pico_Base(ToolMaterial material, String name)
	{
		super(material);
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
