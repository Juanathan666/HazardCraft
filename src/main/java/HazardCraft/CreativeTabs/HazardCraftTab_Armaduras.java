package HazardCraft.CreativeTabs;

import HazardCraft.Items.Armaduras.End.Registrar_Armaduras_End;
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
		return new ItemStack(Registrar_Armaduras_End.casco_de_enderita);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
