package HazardCraft.Items.Herramientas.Base;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Items_OverWorld;
import HazardCraft.Util.Modelos;
import net.minecraft.item.ItemPickaxe;

public class Herramientas_Pico_Base extends ItemPickaxe implements Modelos
{
	public Herramientas_Pico_Base(ToolMaterial material, String name)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	
		
	  setCreativeTab(HazardCraft.HazardCraftTab_Herramientas);
		
		
		Items_OverWorld.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
		HazardCraft.Proxy.registerItemRenderer(this, 0, "inventory");
	}
}
