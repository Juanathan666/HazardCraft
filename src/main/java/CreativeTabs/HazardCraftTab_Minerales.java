package CreativeTabs;

import HazardCraft.Items.Registrar.Items_OverWorld;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Minerales extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Minerales(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Items_OverWorld.GEMA_DE_ZAFIRO);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
