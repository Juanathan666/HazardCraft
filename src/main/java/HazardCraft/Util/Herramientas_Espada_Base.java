package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import net.minecraft.item.ItemSword;

public class Herramientas_Espada_Base extends ItemSword implements Modelos
{
	public Herramientas_Espada_Base(ToolMaterial material, String name)
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
