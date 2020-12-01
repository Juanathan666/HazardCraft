package HazardCraft.Items.Herramientas.Base;

import HazardCraft.HazardCraft;
import HazardCraft.Items.Registrar.Items_OverWorld;
import HazardCraft.Util.Modelos;
import net.minecraft.item.ItemSpade;

public class Herramientas_Pala_Base extends ItemSpade implements Modelos
{
	public Herramientas_Pala_Base(ToolMaterial material, String name)
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
