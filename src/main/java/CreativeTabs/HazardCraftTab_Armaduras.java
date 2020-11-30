package CreativeTabs;

import HazardCraft.Items.Armaduras.Base.Armaduras;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Armaduras extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Armaduras(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Armaduras.casco_de_enderita);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
