package CreativeTabs;

import HazardCraft.Items.Herramientas.Base.Herramientas;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Herramientas extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Herramientas(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Herramientas.espada_de_enderita);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
