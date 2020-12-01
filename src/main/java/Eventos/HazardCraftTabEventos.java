package Eventos;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class HazardCraftTabEventos extends CreativeTabs {

	public static void Inicializar_Tabs(){
	}

	public HazardCraftTabEventos(int i, String modid, String string, int j) 
	{
		super(string);
		
		setBackgroundImageName("HazardCraft_tab1.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		if(Eventos_Principal.Navidad) 
		{
			return new ItemStack(Blocks.SNOW);
		}
		else if(Eventos_Principal.Verano) 
		{
			return new ItemStack(Items.WATER_BUCKET);
		}
		else if(Eventos_Principal.Halloween) 
		{
			return new ItemStack(Blocks.PUMPKIN);
		}
		else 
		{
			return new ItemStack(Items.BEETROOT);
		}
	}

	@Override
	public boolean hasSearchBar() 
	{
		return true;
	}

}