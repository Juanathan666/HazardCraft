package HazardCraft;

import HazardCraft.Iniciar.Bloques;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HazardCraftTab extends CreativeTabs {

	public static void Inicializar_Tabs(){
        

	}

	public HazardCraftTab(int i, String modid, String string, int j) {
		super(HazardCraft.MODID);
		
		setBackgroundImageName("HazardCraft_tab1.png");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		
			return new ItemStack(Bloques.MADERA);
		   
	}

	@Override
	public boolean hasSearchBar() {
		
		return true;
		
			
		
	}

}