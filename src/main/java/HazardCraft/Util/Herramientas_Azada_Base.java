package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import net.minecraft.item.ItemHoe;

public class Herramientas_Azada_Base extends ItemHoe implements Modelos
{
	public Herramientas_Azada_Base(ToolMaterial material, String name)
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
