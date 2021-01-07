package HazardCraft.CreativeTabs;

import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Magia extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Magia(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Items_OverWorld.ESENCIA_DE_FUEGO);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
