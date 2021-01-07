package HazardCraft.CreativeTabs;

import HazardCraft.Items.Registrar.Items_Magia_Varitas;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Varitas extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Varitas(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Items_Magia_Varitas.VARITA_DE_FUERZA_MAESTRO);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}
}
