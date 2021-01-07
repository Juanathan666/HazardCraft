package HazardCraft.CreativeTabs;

import HazardCraft.Bloques.Registrar.Bloques_OverWorld_Decoracion;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab_Bloques extends CreativeTabs {

	public static void Inicializar_Tabs()
	{
	}

	public HazardCraftTab_Bloques(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(Bloques_OverWorld_Decoracion.BLOQUE_DE_MARMOL_ROJO);
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}

}