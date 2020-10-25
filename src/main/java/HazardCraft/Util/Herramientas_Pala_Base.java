package HazardCraft.Util;

import HazardCraft.HazardCraft;
import HazardCraft.Iniciar.Items;
import net.minecraft.item.ItemSpade;

public class Herramientas_Pala_Base extends ItemSpade implements Modelos
{
	public Herramientas_Pala_Base(ToolMaterial material, String name)
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
